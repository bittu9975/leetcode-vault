# Maximum Product of Two Elements in an Array

**Problem Number:** 1464
**Difficulty:** EASY
**Language:** Java
**Date Solved:** 2026-07-27

---

## Problem Statement

Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
&nbsp;
Example 1:


Input: nums = [3,4,5,2]
Output: 12 
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 


Example 2:


Input: nums = [1,5,4,5]
Output: 16
Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.


Example 3:


Input: nums = [3,7]
Output: 12


&nbsp;
Constraints:


	2 &lt;= nums.length &lt;= 500
	1 &lt;= nums[i] &lt;= 10^3

---

## Intuition

The problem requires finding the maximum product of two elements in an array after subtracting 1 from each element. The goal is to choose two different indices i and j from the array to maximize the value of (nums[i]-1)*(nums[j]-1). The solution involves iterating through the array to find the two largest numbers.

---

## Optimal Approach

The given code uses a simple iterative approach to find the two largest numbers in the array, which will result in the maximum product after subtracting 1 from each. It maintains two variables, max1 and max2, to keep track of the maximum and second maximum values encountered so far.

---

## Dry Run

For example, given the array [3,4,5,2], the code will iterate through the array and update max1 and max2 as follows: max1 = 3, max2 = 0; max1 = 4, max2 = 3; max1 = 5, max2 = 4; max1 = 5, max2 = 4. Finally, it returns (5-1)*(4-1) = 12.

---

## Time Complexity

O(n)

---

## Space Complexity

O(1)

---

## Important Observations

Finding the two largest elements in an array, iterating through the array once

---

## Interview Notes

To solve this problem, remember to iterate through the array only once and keep track of the two largest elements encountered. This approach ensures an efficient solution with a time complexity of O(n).

---

## My Learnings

_Add your own personal notes here._
