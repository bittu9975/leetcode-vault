"""
Fetches public LeetCode profile stats and injects them into README.md
between the LEETCODE_STATS marker comments.

Env vars:
    LEETCODE_USERNAME - your LeetCode username (required)
    README_PATH        - path to README file (default: README.md)
"""

import os
import re
import sys
from datetime import datetime, timezone

import requests

LEETCODE_USERNAME = os.environ.get("LEETCODE_USERNAME", "BiTTu__07")
README_PATH = os.environ.get("README_PATH", "README.md")
GRAPHQL_URL = "https://leetcode.com/graphql"

QUERY = """
query getUserProfile($username: String!) {
  allQuestionsCount {
    difficulty
    count
  }
  matchedUser(username: $username) {
    username
    profile {
      ranking
      reputation
    }
    submitStats: submitStatsGlobal {
      acSubmissionNum {
        difficulty
        count
        submissions
      }
    }
  }
}
"""

START_MARKER = "<!--START_SECTION:leetcode_stats-->"
END_MARKER = "<!--END_SECTION:leetcode_stats-->"


def fetch_stats(username: str) -> dict:
    headers = {
        "Content-Type": "application/json",
        "Referer": f"https://leetcode.com/{username}/",
        "User-Agent": "Mozilla/5.0 (README-bot)",
    }
    payload = {"query": QUERY, "variables": {"username": username}}

    resp = requests.post(GRAPHQL_URL, json=payload, headers=headers, timeout=20)
    resp.raise_for_status()
    data = resp.json()

    if data.get("errors"):
        raise RuntimeError(f"LeetCode API returned errors: {data['errors']}")

    if not data.get("data", {}).get("matchedUser"):
        raise RuntimeError(
            f"No user found for username '{username}'. "
            "Check that LEETCODE_USERNAME matches your LeetCode profile exactly."
        )

    return data["data"]


def build_stats_block(data: dict) -> str:
    matched = data["matchedUser"]
    ac_counts = {
        item["difficulty"]: item["count"]
        for item in matched["submitStats"]["acSubmissionNum"]
    }
    total_counts = {
        item["difficulty"]: item["count"] for item in data["allQuestionsCount"]
    }
    ranking = matched["profile"]["ranking"]

    total_solved = ac_counts.get("All", 0)
    total_available = total_counts.get("All", 0)

    updated_at = datetime.now(timezone.utc).strftime("%Y-%m-%d %H:%M UTC")

    lines = [
        f"**LeetCode Profile:** [{LEETCODE_USERNAME}](https://leetcode.com/u/{LEETCODE_USERNAME}/)",
        "",
        "| Category | Solved | Total |",
        "|----------|-------:|------:|",
        f"| Total | {total_solved} | {total_available} |",
        f"| Easy | {ac_counts.get('Easy', 0)} | {total_counts.get('Easy', 0)} |",
        f"| Medium | {ac_counts.get('Medium', 0)} | {total_counts.get('Medium', 0)} |",
        f"| Hard | {ac_counts.get('Hard', 0)} | {total_counts.get('Hard', 0)} |",
        "",
        f"**Global Ranking:** {ranking:,}" if isinstance(ranking, int) else "**Global Ranking:** N/A",
        "",
        f"_Last updated: {updated_at}_",
    ]
    return "\n".join(lines)


def update_readme(new_block: str) -> None:
    if not os.path.exists(README_PATH):
        raise FileNotFoundError(f"{README_PATH} not found")

    with open(README_PATH, "r", encoding="utf-8") as f:
        content = f.read()

    if START_MARKER not in content or END_MARKER not in content:
        raise RuntimeError(
            f"Could not find {START_MARKER} / {END_MARKER} markers in {README_PATH}. "
            "Add these markers where you want the stats table to appear."
        )

    pattern = re.compile(
        re.escape(START_MARKER) + r".*?" + re.escape(END_MARKER), re.DOTALL
    )
    replacement = f"{START_MARKER}\n\n{new_block}\n\n{END_MARKER}"
    updated_content = pattern.sub(replacement, content)

    if updated_content == content:
        print("No changes detected in README.md")
        return

    with open(README_PATH, "w", encoding="utf-8") as f:
        f.write(updated_content)

    print("README.md updated successfully.")


def main():
    try:
        data = fetch_stats(LEETCODE_USERNAME)
        stats_block = build_stats_block(data)
        update_readme(stats_block)
    except Exception as exc:
        print(f"Error: {exc}", file=sys.stderr)
        sys.exit(1)


if __name__ == "__main__":
    main()