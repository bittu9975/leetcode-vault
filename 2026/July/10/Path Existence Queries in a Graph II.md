# Path Existence Queries in a Graph II

**Problem Number:** 3534
**Difficulty:** HARD
**Language:** Java
**Date Solved:** 2026-07-10

---

## Problem Statement

You are given an integer n representing the number of nodes in a graph, labeled from 0 to n - 1.

You are also given an integer array nums of length n and an integer maxDiff.

An undirected edge exists between nodes i and j if the absolute difference between nums[i] and nums[j] is at most maxDiff (i.e., |nums[i] - nums[j]| &lt;= maxDiff).

You are also given a 2D integer array queries. For each queries[i] = [ui, vi], find the minimum distance between nodes ui and vi. If no path exists between the two nodes, return -1 for that query.

Return an array answer, where answer[i] is the result of the ith query.

Note: The edges between the nodes are unweighted.

&nbsp;
Example 1:


Input: n = 5, nums = [1,8,3,4,2], maxDiff = 3, queries = [[0,3],[2,4]]

Output: [1,1]

Explanation:

The resulting graph is:




	
		
			Query
			Shortest Path
			Minimum Distance
		
		
			[0, 3]
			0 &rarr; 3
			1
		
		
			[2, 4]
			2 &rarr; 4
			1
		
	


Thus, the output is [1, 1].


Example 2:


Input: n = 5, nums = [5,3,1,9,10], maxDiff = 2, queries = [[0,1],[0,2],[2,3],[4,3]]

Output: [1,2,-1,1]

Explanation:

The resulting graph is:





	
		
			Query
			Shortest Path
			Minimum Distance
		
		
			[0, 1]
			0 &rarr; 1
			1
		
		
			[0, 2]
			0 &rarr; 1 &rarr; 2
			2
		
		
			[2, 3]
			None
			-1
		
		
			[4, 3]
			3 &rarr; 4
			1
		
	


Thus, the output is [1, 2, -1, 1].

Example 3:


Input: n = 3, nums = [3,6,1], maxDiff = 1, queries = [[0,0],[0,1],[1,2]]

Output: [0,-1,-1]

Explanation:

There are no edges between any two nodes because:


	Nodes 0 and 1: |nums[0] - nums[1]| = |3 - 6| = 3 &gt; 1
	Nodes 0 and 2: |nums[0] - nums[2]| = |3 - 1| = 2 &gt; 1
	Nodes 1 and 2: |nums[1] - nums[2]| = |6 - 1| = 5 &gt; 1


Thus, no node can reach any other node, and the output is [0, -1, -1].


&nbsp;
Constraints:


	1 &lt;= n == nums.length &lt;= 105
	0 &lt;= nums[i] &lt;= 105
	0 &lt;= maxDiff &lt;= 105
	1 &lt;= queries.length &lt;= 105
	queries[i] == [ui, vi]
	0 &lt;= ui, vi &lt; n

---

## Intuition

This problem involves finding the minimum distance between nodes in a graph where edges exist between nodes with values within a certain difference. The goal is to answer a series of queries about the shortest paths between given pairs of nodes. The graph is constructed based on the absolute difference between node values and a given maximum difference. The solution involves sorting the nodes by value, grouping them into connected components, and using a jump table to efficiently find the shortest paths.

---

## Optimal Approach

The solution starts by sorting the nodes based on their values and then grouping them into connected components based on the maximum difference. It uses a jump table (up array) to store the farthest reachable node for each node, which allows for efficient computation of the shortest path. The algorithm iterates over each query, checks if the nodes are in the same connected component, and if so, uses the jump table to find the shortest path. If the nodes are not in the same component, the algorithm returns -1.

---

## Dry Run

For example, given n = 5, nums = [1,8,3,4,2], maxDiff = 3, and queries = [[0,3],[2,4]], the algorithm first sorts the nodes by value: [1,2,3,4,8]. It then groups them into connected components: [1,2,3,4] and [8]. For the first query [0,3], it finds the shortest path as 0 -> 3 with a distance of 1. For the second query [2,4], it finds the shortest path as 2 -> 4 with a distance of 1.

---

## Time Complexity

O(n log n + q log n)

---

## Space Complexity

O(n + q)

---

## Important Observations

Connected components, jump table, binary search

---

## Interview Notes

Understand how to construct a graph based on node values and a maximum difference, and how to use a jump table to efficiently find shortest paths. Practice implementing the algorithm and handling edge cases.

---

## My Learnings

_Add your own personal notes here._
