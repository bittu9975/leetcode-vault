# Maximum Product of Two Digits

**Problem Number:** 3536
**Difficulty:** EASY
**Language:** Java
**Date Solved:** 2026-07-25

---

## Problem Statement

You are given a positive integer n.

Return the maximum product of any two digits in n.

Note: You may use the same digit twice if it appears more than once in n.

&nbsp;
Example 1:


Input: n = 31

Output: 3

Explanation:


	The digits of n are [3, 1].
	The possible products of any two digits are: 3 * 1 = 3.
	The maximum product is 3.



Example 2:


Input: n = 22

Output: 4

Explanation:


	The digits of n are [2, 2].
	The possible products of any two digits are: 2 * 2 = 4.
	The maximum product is 4.



Example 3:


Input: n = 124

Output: 8

Explanation:


	The digits of n are [1, 2, 4].
	The possible products of any two digits are: 1 * 2 = 2, 1 * 4 = 4, 2 * 4 = 8.
	The maximum product is 8.



&nbsp;
Constraints:


	10 &lt;= n &lt;= 109

---

## Intuition

This problem asks to find the maximum product of any two digits in a given positive integer n. The digits can be used more than once if they appear multiple times in n. The goal is to return the maximum product of any two digits in n.

---

## Optimal Approach

The algorithm used in the given code works by iterating through each digit of the number n from right to left. It keeps track of the largest and second largest digits encountered so far. If a new digit is larger than the current largest, it updates the largest and second largest digits. If a new digit is not larger than the current largest but is larger than the second largest, it updates the second largest digit. Finally, it returns the product of the largest and second largest digits.

---

## Dry Run

For example, if n = 124, the algorithm will iterate through the digits as follows: 4 (largest = 4, secondLargest = 0), 2 (largest = 4, secondLargest = 2), 1 (largest = 4, secondLargest = 2). The maximum product is then 4 * 2 = 8.

---

## Time Complexity

O(log n)

---

## Space Complexity

O(1)

---

## Important Observations

Digit extraction using modulo, keeping track of largest and second largest values

---

## Interview Notes

Remember to iterate through digits from right to left, keep track of largest and second largest digits, and return their product.

---

## My Learnings

_Add your own personal notes here._
