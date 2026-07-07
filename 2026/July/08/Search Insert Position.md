# Search Insert Position

**Problem Number:** 35
**Difficulty:** EASY
**Language:** Java
**Date Solved:** 2026-07-08

---

## Problem Statement

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must&nbsp;write an algorithm with&nbsp;O(log n) runtime complexity.

&nbsp;
Example 1:


Input: nums = [1,3,5,6], target = 5
Output: 2


Example 2:


Input: nums = [1,3,5,6], target = 2
Output: 1


Example 3:


Input: nums = [1,3,5,6], target = 7
Output: 4


&nbsp;
Constraints:


	1 &lt;= nums.length &lt;= 104
	-104 &lt;= nums[i] &lt;= 104
	nums contains distinct values sorted in ascending order.
	-104 &lt;= target &lt;= 104

---

## Intuition

The problem requires finding the index of a target value in a sorted array of distinct integers. If the target is not found, the index where it should be inserted to maintain the sorted order is returned. The solution must have a runtime complexity of O(log n).

---

## Optimal Approach

The given code uses a binary search algorithm to find the target value in the sorted array. It maintains two pointers, l and h, representing the low and high indices of the search range. The mid index is calculated and compared to the target value. If the target is found, its index is returned. If not, the search range is adjusted based on whether the target is less than or greater than the middle element.

---

## Dry Run

For example, given the array [1,3,5,6] and target 2, the algorithm starts with l=0 and h=4. The mid index is 2, and since arr[2] (5) is greater than the target, h is updated to 2-1=1. The new mid index is 0, and since arr[0] (1) is less than the target, l is updated to 0+1=1. The search range is now [1,1], and since arr[1] (3) is greater than the target, the algorithm returns l=1, which is the index where the target should be inserted.

---

## Time Complexity

O(log n)

---

## Space Complexity

O(1)

---

## Important Observations

Binary search, early termination when target is greater than the last element

---

## Interview Notes

Review binary search algorithm, understand how to adjust search range based on comparisons, and practice implementing binary search for similar problems.

---

## My Learnings

_Add your own personal notes here._
