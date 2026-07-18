# Find Greatest Common Divisor of Array

**Problem Number:** 1979
**Difficulty:** EASY
**Language:** Java
**Date Solved:** 2026-07-18

---

## Problem Statement

Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.

The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

&nbsp;
Example 1:


Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.


Example 2:


Input: nums = [7,5,6,8,3]
Output: 1
Explanation:
The smallest number in nums is 3.
The largest number in nums is 8.
The greatest common divisor of 3 and 8 is 1.


Example 3:


Input: nums = [3,3]
Output: 3
Explanation:
The smallest number in nums is 3.
The largest number in nums is 3.
The greatest common divisor of 3 and 3 is 3.


&nbsp;
Constraints:


	2 &lt;= nums.length &lt;= 1000
	1 &lt;= nums[i] &lt;= 1000

---

## Intuition

The problem requires finding the greatest common divisor (GCD) of the smallest and largest numbers in a given array. The GCD is the largest positive integer that evenly divides both numbers. The solution involves finding the minimum and maximum numbers in the array and then calculating their GCD.

---

## Optimal Approach

The approach used in the given code is to first find the minimum and maximum numbers in the array by iterating through it. Then, it uses a recursive function to calculate the GCD of the maximum and minimum numbers using the Euclidean algorithm, which is based on the principle that the GCD of two numbers does not change if the larger number is replaced by its difference with the smaller number.

---

## Dry Run

For example, given the array [2,5,6,9,10], the minimum number is 2 and the maximum number is 10. The GCD of 10 and 2 is calculated as follows: gcd(10, 2) = gcd(2, 10%2) = gcd(2, 0) = 2.

---

## Time Complexity

O(n + log(min))

---

## Space Complexity

O(1)

---

## Important Observations

Euclidean algorithm, finding min and max in array

---

## Interview Notes

Remember to find min and max in array, use Euclidean algorithm for GCD, and consider using recursion or iteration for GCD calculation.

---

## My Learnings

_Add your own personal notes here._
