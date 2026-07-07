# Concatenate Non-Zero Digits and Multiply by Sum I

**Problem Number:** 3754
**Difficulty:** EASY
**Language:** Java
**Date Solved:** 2026-07-07

---

## Problem Statement

You are given an integer n.

Form a new integer x by concatenating all the non-zero digits of n in their original order. If there are no non-zero digits, x = 0.

Let sum be the sum of digits in x.

Return an integer representing the value of x * sum.

&nbsp;
Example 1:


Input: n = 10203004

Output: 12340

Explanation:


	The non-zero digits are 1, 2, 3, and 4. Thus, x = 1234.
	The sum of digits is sum = 1 + 2 + 3 + 4 = 10.
	Therefore, the answer is x * sum = 1234 * 10 = 12340.



Example 2:


Input: n = 1000

Output: 1

Explanation:


	The non-zero digit is 1, so x = 1 and sum = 1.
	Therefore, the answer is x * sum = 1 * 1 = 1.



&nbsp;
Constraints:


	0 &lt;= n &lt;= 109

---

## Intuition

The problem involves forming a new integer by concatenating non-zero digits of a given integer, calculating the sum of these digits, and then returning the product of the new integer and the sum. The input integer can have up to 9 digits. The goal is to find the value of the new integer multiplied by the sum of its digits.

---

## Optimal Approach

The algorithm works by first extracting non-zero digits from the input integer and storing them in a StringBuilder. It then reverses the StringBuilder to maintain the original order of digits. After that, it constructs the new integer and calculates the sum of its digits. Finally, it returns the product of the new integer and the sum.

---

## Dry Run

For example, given the input 10203004, the algorithm extracts non-zero digits as 1, 2, 3, and 4. It then constructs the new integer x as 1234 and calculates the sum of its digits as 1+2+3+4 = 10. Finally, it returns the product x*sum as 1234*10 = 12340.

---

## Time Complexity

O(log n)

---

## Space Complexity

O(log n)

---

## Important Observations

Digit extraction, string manipulation, and basic arithmetic operations

---

## Interview Notes

Review string manipulation, digit extraction, and basic arithmetic operations. Practice solving problems involving integer manipulation and calculation.

---

## My Learnings

_Add your own personal notes here._
