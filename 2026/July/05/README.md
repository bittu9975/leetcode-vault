# Longest Substring Without Repeating Characters

**Problem Number:** 3
**Difficulty:** MEDIUM
**Language:** Java
**Date Solved:** 2026-07-05

---

## Problem Statement

Given a string s, find the length of the longest substring without duplicate characters.

&nbsp;
Example 1:


Input: s = &quot;abcabcbb&quot;
Output: 3
Explanation: The answer is &quot;abc&quot;, with the length of 3. Note that &quot;bca&quot; and &quot;cab&quot; are also correct answers.


Example 2:


Input: s = &quot;bbbbb&quot;
Output: 1
Explanation: The answer is &quot;b&quot;, with the length of 1.


Example 3:


Input: s = &quot;pwwkew&quot;
Output: 3
Explanation: The answer is &quot;wke&quot;, with the length of 3.
Notice that the answer must be a substring, &quot;pwke&quot; is a subsequence and not a substring.


&nbsp;
Constraints:


	0 &lt;= s.length &lt;= 5 * 104
	s consists of English letters, digits, symbols and spaces.

---

## Intuition

The problem asks to find the length of the longest substring without duplicate characters in a given string. The solution involves using a sliding window approach to track the longest substring. The goal is to find the maximum length of such a substring.

---

## Optimal Approach

The algorithm uses a HashSet to store unique characters within the current window. It expands the window to the right and adds characters to the set. If a duplicate character is found, it slides the window to the right by removing the leftmost character until the duplicate is removed. The maximum length of the window is updated at each step.

---

## Dry Run

For example, given the string 'abcabcbb', the algorithm starts with an empty window and expands it to 'a', 'ab', 'abc'. When it encounters 'a' again, it slides the window to 'bc' and continues. The maximum length is updated at each step, resulting in a final answer of 3.

---

## Time Complexity

O(n)

---

## Space Complexity

O(min(n, m))

---

## Important Observations

Sliding window, HashSet for duplicate detection

---

## Interview Notes

Review sliding window technique, HashSet usage for duplicate detection, and string manipulation.

---

## My Learnings

_Add your own personal notes here._
