# Path Existence Queries in a Graph I

**Problem Number:** 3532
**Difficulty:** MEDIUM
**Language:** Java
**Date Solved:** 2026-07-09

---

## Problem Statement

You are given an integer n representing the number of nodes in a graph, labeled from 0 to n - 1.

You are also given an integer array nums of length n sorted in non-decreasing order, and an integer maxDiff.

An undirected edge exists between nodes i and j if the absolute difference between nums[i] and nums[j] is at most maxDiff (i.e., |nums[i] - nums[j]| &lt;= maxDiff).

You are also given a 2D integer array queries. For each queries[i] = [ui, vi], determine whether there exists a path between nodes ui and vi.

Return a boolean array answer, where answer[i] is true if there exists a path between ui and vi in the ith query and false otherwise.

&nbsp;
Example 1:


Input: n = 2, nums = [1,3], maxDiff = 1, queries = [[0,0],[0,1]]

Output: [true,false]

Explanation:


	Query [0,0]: Node 0 has a trivial path to itself.
	Query [0,1]: There is no edge between Node 0 and Node 1 because |nums[0] - nums[1]| = |1 - 3| = 2, which is greater than maxDiff.
	Thus, the final answer after processing all the queries is [true, false].



Example 2:


Input: n = 4, nums = [2,5,6,8], maxDiff = 2, queries = [[0,1],[0,2],[1,3],[2,3]]

Output: [false,false,true,true]

Explanation:

The resulting graph is:




	Query [0,1]: There is no edge between Node 0 and Node 1 because |nums[0] - nums[1]| = |2 - 5| = 3, which is greater than maxDiff.
	Query [0,2]: There is no edge between Node 0 and Node 2 because |nums[0] - nums[2]| = |2 - 6| = 4, which is greater than maxDiff.
	Query [1,3]: There is a path between Node 1 and Node 3 through Node 2 since |nums[1] - nums[2]| = |5 - 6| = 1 and |nums[2] - nums[3]| = |6 - 8| = 2, both of which are within maxDiff.
	Query [2,3]: There is an edge between Node 2 and Node 3 because |nums[2] - nums[3]| = |6 - 8| = 2, which is equal to maxDiff.
	Thus, the final answer after processing all the queries is [false, false, true, true].



&nbsp;
Constraints:


	1 &lt;= n == nums.length &lt;= 105
	0 &lt;= nums[i] &lt;= 105
	nums is sorted in non-decreasing order.
	0 &lt;= maxDiff &lt;= 105
	1 &lt;= queries.length &lt;= 105
	queries[i] == [ui, vi]
	0 &lt;= ui, vi &lt; n

---

## Intuition

The problem involves determining whether a path exists between two nodes in a graph, where an edge exists between two nodes if the absolute difference between their corresponding values in a sorted array is within a given maximum difference. The goal is to return a boolean array indicating the existence of a path for each query. The graph is constructed based on the given array and maximum difference, and then the queries are processed to determine the existence of a path between the specified nodes.

---

## Optimal Approach

The given solution uses a union-find approach to group nodes into components based on the maximum difference. It iterates through the sorted array and assigns a component ID to each node based on whether the difference between consecutive nodes exceeds the maximum difference. Then, for each query, it checks if the two nodes belong to the same component, indicating the existence of a path.

---

## Dry Run

For example, given the array [2, 5, 6, 8] and a maximum difference of 2, the component IDs would be assigned as follows: node 0 (2) is assigned ID 0, node 1 (5) is assigned ID 1 because 5 - 2 > 2, node 2 (6) is assigned ID 1 because 6 - 5 <= 2, and node 3 (8) is assigned ID 1 because 8 - 6 <= 2. Then, for the query [1, 3], the nodes 1 and 3 belong to the same component (ID 1), indicating the existence of a path.

---

## Time Complexity

O(n + q)

---

## Space Complexity

O(n + q)

---

## Important Observations

Union-find, component assignment based on maximum difference

---

## Interview Notes

Review union-find data structure, understand how to apply it to graph problems, and practice solving problems involving component assignment and path existence queries.

---

## My Learnings

_Add your own personal notes here._
