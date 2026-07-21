# Maximize Active Section with Trade I

**Problem Number:** 3499
**Difficulty:** MEDIUM
**Language:** Java
**Date Solved:** 2026-07-22

---

## Problem Statement

You are given a binary string s of length n, where:


	&#39;1&#39; represents an active section.
	&#39;0&#39; represents an inactive section.


You can perform at most one trade to maximize the number of active sections in s. In a trade, you:


	Convert a contiguous block of &#39;1&#39;s that is surrounded by &#39;0&#39;s to all &#39;0&#39;s.
	Afterward, convert a contiguous block of &#39;0&#39;s that is surrounded by &#39;1&#39;s to all &#39;1&#39;s.


Return the maximum number of active sections in s after making the optimal trade.

Note: Treat s as if it is augmented with a &#39;1&#39; at both ends, forming t = &#39;1&#39; + s + &#39;1&#39;. The augmented &#39;1&#39;s do not contribute to the final count.

&nbsp;
Example 1:


Input: s = &quot;01&quot;

Output: 1

Explanation:

Because there is no block of &#39;1&#39;s surrounded by &#39;0&#39;s, no valid trade is possible. The maximum number of active sections is 1.


Example 2:


Input: s = &quot;0100&quot;

Output: 4

Explanation:


	String &quot;0100&quot; &rarr; Augmented to &quot;101001&quot;.
	Choose &quot;0100&quot;, convert &quot;101001&quot; &rarr; &quot;100001&quot; &rarr; &quot;111111&quot;.
	The final string without augmentation is &quot;1111&quot;. The maximum number of active sections is 4.



Example 3:


Input: s = &quot;1000100&quot;

Output: 7

Explanation:


	String &quot;1000100&quot; &rarr; Augmented to &quot;110001001&quot;.
	Choose &quot;000100&quot;, convert &quot;110001001&quot; &rarr; &quot;110000001&quot; &rarr; &quot;111111111&quot;.
	The final string without augmentation is &quot;1111111&quot;. The maximum number of active sections is 7.



Example 4:


Input: s = &quot;01010&quot;

Output: 4

Explanation:


	String &quot;01010&quot; &rarr; Augmented to &quot;1010101&quot;.
	Choose &quot;010&quot;, convert &quot;1010101&quot; &rarr; &quot;1000101&quot; &rarr; &quot;1111101&quot;.
	The final string without augmentation is &quot;11110&quot;. The maximum number of active sections is 4.



&nbsp;
Constraints:


	1 &lt;= n == s.length &lt;= 105
	s[i] is either &#39;0&#39; or &#39;1&#39;

---

## Intuition

The problem involves maximizing the number of active sections in a binary string by performing at most one trade, where a trade involves converting a block of '1's to '0's and then converting a block of '0's to '1's. The goal is to find the maximum number of active sections after making the optimal trade. The string is augmented with '1's at both ends to simplify the problem.

---

## Optimal Approach

The solution uses a two-step approach: first, it counts the total number of '1's in the string, and then it iterates through the augmented string to find blocks of '1's that are surrounded by '0's. For each such block, it calculates the number of '0's that can be converted to '1's and updates the maximum number of active sections accordingly.

---

## Dry Run

For example, given the string '01010', the solution first counts the total number of '1's as 2. Then, it iterates through the augmented string '1010101' and finds the block '010' that is surrounded by '0's. It calculates that converting this block to '0's and then converting the surrounding '0's to '1's would result in a total of 4 active sections, which is the maximum.

---

## Time Complexity

O(n)

---

## Space Complexity

O(n)

---

## Important Observations

Prefix sum, block detection, and trade optimization

---

## Interview Notes

Key concepts to focus on include string manipulation, block detection, and trade optimization. Practice solving similar problems to improve your ability to analyze and solve complex string manipulation problems.

---

## My Learnings

_Add your own personal notes here._
