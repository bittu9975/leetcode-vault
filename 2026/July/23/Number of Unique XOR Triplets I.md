# Number of Unique XOR Triplets I

**Problem Number:** 3513
**Difficulty:** MEDIUM
**Language:** Java
**Date Solved:** 2026-07-23

---

## Problem Statement

You are given an integer array nums of length n, where nums is a permutation of the numbers in the range [1, n].

A XOR triplet is defined as the XOR of three elements nums[i] XOR nums[j] XOR nums[k] where i &lt;= j &lt;= k.

Return the number of unique XOR triplet values from all possible triplets (i, j, k).

&nbsp;
Example 1:


Input: nums = [1,2]

Output: 2

Explanation:

The possible XOR triplet values are:


	(0, 0, 0) &rarr; 1 XOR 1 XOR 1 = 1
	(0, 0, 1) &rarr; 1 XOR 1 XOR 2 = 2
	(0, 1, 1) &rarr; 1 XOR 2 XOR 2 = 1
	(1, 1, 1) &rarr; 2 XOR 2 XOR 2 = 2


The unique XOR values are {1, 2}, so the output is 2.


Example 2:


Input: nums = [3,1,2]

Output: 4

Explanation:

The possible XOR triplet values include:


	(0, 0, 0) &rarr; 3 XOR 3 XOR 3 = 3
	(0, 0, 1) &rarr; 3 XOR 3 XOR 1 = 1
	(0, 0, 2) &rarr; 3 XOR 3 XOR 2 = 2
	(0, 1, 2) &rarr; 3 XOR 1 XOR 2 = 0


The unique XOR values are {0, 1, 2, 3}, so the output is 4.


&nbsp;
Constraints:


	1 &lt;= n == nums.length &lt;= 105
	1 &lt;= nums[i] &lt;= n
	nums is a permutation of integers from 1 to n.

---

## Intuition

This problem asks to find the number of unique XOR triplet values from all possible triplets in a given integer array, where the array is a permutation of numbers in the range [1, n]. The solution involves understanding the properties of XOR operation and its relation to the bit length of the numbers. The goal is to determine the number of unique XOR values that can be obtained from the given array.

---

## Optimal Approach

The approach used in the given code is based on the observation that the XOR of three numbers can be represented as a binary number with a certain number of bits. The code calculates the bit length of the numbers in the array and uses it to determine the number of unique XOR values. The key insight is that the XOR of three numbers can have at most the same number of bits as the maximum number in the array, which is n. Therefore, the number of unique XOR values is 2 to the power of the bit length of n.

---

## Dry Run

For example, if the input array is [1, 2, 3], the bit length of the numbers is 2 (since 3 can be represented as 11 in binary). Therefore, the number of unique XOR values is 2^2 = 4, which corresponds to the XOR values {0, 1, 2, 3}.

---

## Time Complexity

O(1)

---

## Space Complexity

O(1)

---

## Important Observations

Properties of XOR, Bit manipulation

---

## Interview Notes

Understand the properties of XOR operation, bit manipulation, and how to calculate the bit length of a number. Practice problems related to XOR and bit manipulation to improve problem-solving skills.

---

## My Learnings

_Add your own personal notes here._
