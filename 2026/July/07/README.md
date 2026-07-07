# Roman to Integer

**Problem Number:** 13
**Difficulty:** EASY
**Language:** Java
**Date Solved:** 2026-07-07

---

## Problem Statement

Roman numerals are represented by seven different symbols:&nbsp;I, V, X, L, C, D and M.


Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example,&nbsp;2 is written as II&nbsp;in Roman numeral, just two ones added together. 12 is written as&nbsp;XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:


	I can be placed before V (5) and X (10) to make 4 and 9.&nbsp;
	X can be placed before L (50) and C (100) to make 40 and 90.&nbsp;
	C can be placed before D (500) and M (1000) to make 400 and 900.


Given a roman numeral, convert it to an integer.

&nbsp;
Example 1:


Input: s = &quot;III&quot;
Output: 3
Explanation: III = 3.


Example 2:


Input: s = &quot;LVIII&quot;
Output: 58
Explanation: L = 50, V= 5, III = 3.


Example 3:


Input: s = &quot;MCMXCIV&quot;
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


&nbsp;
Constraints:


	1 &lt;= s.length &lt;= 15
	s contains only&nbsp;the characters (&#39;I&#39;, &#39;V&#39;, &#39;X&#39;, &#39;L&#39;, &#39;C&#39;, &#39;D&#39;, &#39;M&#39;).
	It is guaranteed&nbsp;that s is a valid roman numeral in the range [1, 3999].

---

## Intuition

The problem involves converting a Roman numeral to an integer. The Roman numeral is represented by seven different symbols: I, V, X, L, C, D, and M. The goal is to write a function that takes a Roman numeral string as input and returns its integer equivalent.

---

## Optimal Approach

The solution uses a simple iterative approach. It defines a helper function to map each Roman numeral character to its integer value. Then, it iterates through the input string, adding the value of the current character to the total if it is greater than or equal to the next character, and subtracting it otherwise. This approach works because in Roman numerals, a smaller number placed before a larger one means subtraction.

---

## Dry Run

For example, given the input 'IV', the function will iterate as follows: it will first encounter 'I' with a value of 1, then 'V' with a value of 5. Since 1 is less than 5, it will subtract 1 from the total, resulting in -1. Then, it will add 5 to the total, resulting in a final total of 4.

---

## Time Complexity

O(n)

---

## Space Complexity

O(1)

---

## Important Observations

Mapping of Roman numerals to integers, conditional addition or subtraction based on the relative values of adjacent characters

---

## Interview Notes

Key concepts to review: Roman numeral representation, iterative string processing, conditional logic for handling subtraction cases

---

## My Learnings

_Add your own personal notes here._
