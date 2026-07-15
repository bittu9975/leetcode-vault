# GCD of Odd and Even Sums

**Problem Number:** 3658
**Difficulty:** EASY
**Language:** Java
**Date Solved:** 2026-07-15

---

## Problem Statement

You are given an integer n. Your task is to compute the GCD (greatest common divisor) of two values:


	
	sumOdd: the sum of the smallest&nbsp;n&nbsp;positive odd numbers.
	
	
	sumEven: the sum of the smallest&nbsp;n&nbsp;positive even numbers.
	


Return the GCD of sumOdd and sumEven.

&nbsp;
Example 1:


Input: n = 4

Output: 4

Explanation:


	Sum of the first 4 odd numbers sumOdd = 1 + 3 + 5 + 7 = 16
	Sum of the first 4 even numbers sumEven = 2 + 4 + 6 + 8 = 20


Hence, GCD(sumOdd, sumEven) = GCD(16, 20) = 4.


Example 2:


Input: n = 5

Output: 5

Explanation:


	Sum of the first 5 odd numbers sumOdd = 1 + 3 + 5 + 7 + 9 = 25
	Sum of the first 5 even numbers sumEven = 2 + 4 + 6 + 8 + 10 = 30


Hence, GCD(sumOdd, sumEven) = GCD(25, 30) = 5.


&nbsp;
Constraints:


	1 &lt;= n &lt;= 10​​​​​​​00

---

## Intuition

The problem asks to find the GCD of the sum of the smallest n positive odd numbers and the sum of the smallest n positive even numbers. The sum of the first n odd numbers can be calculated as n^2 and the sum of the first n even numbers can be calculated as n*(n+1). The GCD of these two sums is then calculated using the Euclidean algorithm.

---

## Optimal Approach

The given code uses the mathematical formulas for the sum of the first n odd and even numbers, which are n^2 and n*(n+1) respectively. It then uses the Euclidean algorithm to calculate the GCD of these two sums. The Euclidean algorithm works by repeatedly replacing the larger number with the remainder of the division of the larger number by the smaller number, until the remainder is 0.

---

## Dry Run

For example, if n = 4, the sum of the first 4 odd numbers is 4^2 = 16 and the sum of the first 4 even numbers is 4*(4+1) = 20. The GCD of 16 and 20 is then calculated using the Euclidean algorithm: getGCD(16, 20) = getGCD(20, 16%20) = getGCD(20, 16) = getGCD(16, 20%16) = getGCD(16, 4) = getGCD(4, 16%4) = getGCD(4, 0) = 4.

---

## Time Complexity

O(log min(a, b))

---

## Space Complexity

O(1)

---

## Important Observations

Mathematical formulas for sum of odd and even numbers, Euclidean algorithm for GCD

---

## Interview Notes

Remember the formulas for sum of first n odd and even numbers, and the Euclidean algorithm for GCD. Practice deriving the formulas and implementing the Euclidean algorithm.

---

## My Learnings

_Add your own personal notes here._
