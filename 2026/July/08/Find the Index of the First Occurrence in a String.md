# Find the Index of the First Occurrence in a String

**Problem Number:** 28
**Difficulty:** EASY
**Language:** Java
**Date Solved:** 2026-07-08

---

## Problem Statement

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

&nbsp;
Example 1:


Input: haystack = &quot;sadbutsad&quot;, needle = &quot;sad&quot;
Output: 0
Explanation: &quot;sad&quot; occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.


Example 2:


Input: haystack = &quot;leetcode&quot;, needle = &quot;leeto&quot;
Output: -1
Explanation: &quot;leeto&quot; did not occur in &quot;leetcode&quot;, so we return -1.


&nbsp;
Constraints:


	1 &lt;= haystack.length, needle.length &lt;= 104
	haystack and needle consist of only lowercase English characters.

---

## Intuition

This problem involves finding the index of the first occurrence of a substring (needle) within a larger string (haystack). If the needle is not found, the function returns -1. The solution iterates through the haystack to find a match for the needle. The function uses a helper method to verify if the substring starting at a given index in the haystack matches the needle.

---

## Optimal Approach

The algorithm used in the given code is a simple string matching approach. It iterates through each character in the haystack and checks if it matches the first character of the needle. If a match is found, it calls a helper function to verify if the rest of the substring matches the needle. If a match is confirmed, it updates the index of the first occurrence if necessary.

---

## Dry Run

For example, given haystack = "sadbutsad" and needle = "sad", the function starts by checking the first character of the haystack. It matches the first character of the needle, so it calls the helper function to verify the rest of the substring. The helper function checks the next two characters and confirms that they match the rest of the needle, so it returns true. The function then returns the index 0 as the first occurrence of the needle.

---

## Time Complexity

O(n*m)

---

## Space Complexity

O(1)

---

## Important Observations

String matching, substring verification

---

## Interview Notes

Review string matching algorithms, understand the importance of verifying substring matches, and practice iterating through strings to find specific patterns.

---

## My Learnings

_Add your own personal notes here._
