# Length of Last Word

**Problem Number:** 58
**Difficulty:** EASY
**Language:** Java
**Date Solved:** 2026-07-08

---

## Problem Statement

Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

&nbsp;
Example 1:


Input: s = &quot;Hello World&quot;
Output: 5
Explanation: The last word is &quot;World&quot; with length 5.


Example 2:


Input: s = &quot;   fly me   to   the moon  &quot;
Output: 4
Explanation: The last word is &quot;moon&quot; with length 4.


Example 3:


Input: s = &quot;luffy is still joyboy&quot;
Output: 6
Explanation: The last word is &quot;joyboy&quot; with length 6.


&nbsp;
Constraints:


	1 &lt;= s.length &lt;= 104
	s consists of only English letters and spaces &#39; &#39;.
	There will be at least one word in s.

---

## Intuition

The problem asks to find the length of the last word in a given string, where a word is a maximal substring consisting of non-space characters only. The input string may contain leading, trailing, or multiple spaces between words. The goal is to return the length of the last word in the string. The solution involves trimming the input string and then finding the length of the last word.

---

## Optimal Approach

The given code uses the trim() method to remove leading and trailing spaces from the input string, and then finds the index of the last space character using the lastIndexOf() method. It adds 1 to this index to get the starting position of the last word, and then subtracts this position from the length of the trimmed string to get the length of the last word.

---

## Dry Run

For example, if the input string is "Hello World", the trim() method returns "Hello World", the lastIndexOf() method returns 5, and the length of the trimmed string is 11. So, the length of the last word is 11 - (5 + 1) = 5.

---

## Time Complexity

O(n)

---

## Space Complexity

O(n)

---

## Important Observations

String trimming, last index of a character

---

## Interview Notes

Remember to trim the input string, use lastIndexOf() to find the last space, and calculate the length of the last word by subtracting the starting position of the last word from the length of the trimmed string.

---

## My Learnings

_Add your own personal notes here._
