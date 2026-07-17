# Sorted GCD Pair Queries

**Problem Number:** 3312
**Difficulty:** HARD
**Language:** Java
**Date Solved:** 2026-07-17

---

## Problem Statement

You are given an integer array nums of length n and an integer array queries.

Let gcdPairs denote an array obtained by calculating the GCD of all possible pairs (nums[i], nums[j]), where 0 &lt;= i &lt; j &lt; n, and then sorting these values in ascending order.

For each query queries[i], you need to find the element at index queries[i] in gcdPairs.

Return an integer array answer, where answer[i] is the value at gcdPairs[queries[i]] for each query.

The term gcd(a, b) denotes the greatest common divisor of a and b.

&nbsp;
Example 1:


Input: nums = [2,3,4], queries = [0,2,2]

Output: [1,2,2]

Explanation:

gcdPairs = [gcd(nums[0], nums[1]), gcd(nums[0], nums[2]), gcd(nums[1], nums[2])] = [1, 2, 1].

After sorting in ascending order, gcdPairs = [1, 1, 2].

So, the answer is [gcdPairs[queries[0]], gcdPairs[queries[1]], gcdPairs[queries[2]]] = [1, 2, 2].


Example 2:


Input: nums = [4,4,2,1], queries = [5,3,1,0]

Output: [4,2,1,1]

Explanation:

gcdPairs sorted in ascending order is [1, 1, 1, 2, 2, 4].


Example 3:


Input: nums = [2,2], queries = [0,0]

Output: [2,2]

Explanation:

gcdPairs = [2].


&nbsp;
Constraints:


	2 &lt;= n == nums.length &lt;= 105
	1 &lt;= nums[i] &lt;= 5 * 104
	1 &lt;= queries.length &lt;= 105
	0 &lt;= queries[i] &lt; n * (n - 1) / 2

---

## Intuition

The problem requires finding the GCD of all possible pairs of numbers in an array, sorting them, and then answering queries about the sorted GCDs. The GCD of two numbers is the largest number that divides both of them without a remainder. The solution involves calculating the frequency of each number, the number of pairs divisible by each number, and the number of GCDs for each number.

---

## Optimal Approach

The solution uses a combination of frequency counting, divisibility counting, and prefix sum calculation to efficiently answer queries about the sorted GCDs. It first calculates the frequency of each number in the array, then calculates the number of pairs divisible by each number, and finally calculates the number of GCDs for each number using a prefix sum. The queries are then answered by performing a binary search on the prefix sum array to find the GCD at the specified index.

---

## Dry Run

For example, given the array [2, 3, 4] and the query [0, 2, 2], the solution first calculates the frequency of each number: [0, 0, 1, 1, 1]. Then, it calculates the number of pairs divisible by each number: [0, 0, 3, 2, 1]. Next, it calculates the number of GCDs for each number: [0, 0, 2, 1, 1]. Finally, it answers the queries by performing a binary search on the prefix sum array: [1, 2, 2].

---

## Time Complexity

O(n log n + n^2 + q log n)

---

## Space Complexity

O(n)

---

## Important Observations

Frequency counting, divisibility counting, prefix sum calculation, binary search

---

## Interview Notes

Understand how to calculate GCDs, frequency counting, and prefix sum calculation. Practice binary search and understand how to apply it to solve problems. Review the concept of divisibility counting and how to use it to solve problems.

---

## My Learnings

_Add your own personal notes here._
