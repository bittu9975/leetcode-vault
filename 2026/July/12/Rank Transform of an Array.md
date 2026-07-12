# Rank Transform of an Array

**Problem Number:** 1331
**Difficulty:** EASY
**Language:** Java
**Date Solved:** 2026-07-12

---

## Problem Statement

Given an array of integers&nbsp;arr, replace each element with its rank.

The rank represents how large the element is. The rank has the following rules:


	Rank is an integer starting from 1.
	The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
	Rank should be as small as possible.


&nbsp;
Example 1:


Input: arr = [40,10,20,30]
Output: [4,1,2,3]
Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.

Example 2:


Input: arr = [100,100,100]
Output: [1,1,1]
Explanation: Same elements share the same rank.


Example 3:


Input: arr = [37,12,28,9,100,56,80,5,12]
Output: [5,3,4,2,8,6,7,1,3]


&nbsp;
Constraints:


	0 &lt;= arr.length &lt;= 105
	-109&nbsp;&lt;= arr[i] &lt;= 109

---

## Intuition

The problem requires replacing each element in the given array with its rank, where the rank represents how large the element is. The rank is an integer starting from 1, and the larger the element, the larger the rank. If two elements are equal, their rank must be the same. The goal is to find the smallest possible rank for each element.

---

## Optimal Approach

The given solution uses a two-step approach. First, it creates a copy of the original array, sorts it, and then uses a HashMap to assign a unique rank to each distinct element in the sorted array. Then, it iterates over the original array and uses the HashMap to replace each element with its corresponding rank.

---

## Dry Run

For example, given the array [40,10,20,30], the solution first creates a sorted copy [10,20,30,40]. Then, it assigns ranks to each distinct element: 10 gets rank 1, 20 gets rank 2, 30 gets rank 3, and 40 gets rank 4. Finally, it replaces each element in the original array with its corresponding rank, resulting in [4,1,2,3].

---

## Time Complexity

O(n log n)

---

## Space Complexity

O(n)

---

## Important Observations

Hash table for rank mapping, Sorting

---

## Interview Notes

Use sorting and hash tables to solve ranking problems, consider edge cases with duplicate elements

---

## My Learnings

_Add your own personal notes here._
