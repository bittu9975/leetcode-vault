# Shift 2D Grid

**Problem Number:** 1260
**Difficulty:** EASY
**Language:** Java
**Date Solved:** 2026-07-20

---

## Problem Statement

Given a 2D grid of size m x n&nbsp;and an integer k. You need to shift the grid&nbsp;k times.

In one shift operation:


	Element at grid[i][j] moves to grid[i][j + 1].
	Element at grid[i][n - 1] moves to grid[i + 1][0].
	Element at grid[m&nbsp;- 1][n - 1] moves to grid[0][0].


Return the 2D grid after applying shift operation k times.

&nbsp;
Example 1:


Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
Output: [[9,1,2],[3,4,5],[6,7,8]]


Example 2:


Input: grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]


Example 3:


Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
Output: [[1,2,3],[4,5,6],[7,8,9]]


&nbsp;
Constraints:


	m ==&nbsp;grid.length
	n ==&nbsp;grid[i].length
	1 &lt;= m &lt;= 50
	1 &lt;= n &lt;= 50
	-1000 &lt;= grid[i][j] &lt;= 1000
	0 &lt;= k &lt;= 100

---

## Intuition

The problem requires shifting a 2D grid k times, where each shift operation moves elements to the right and wraps around to the next row when necessary. The goal is to return the grid after applying the shift operation k times. The grid has m rows and n columns, and k is an integer between 0 and 100.

---

## Optimal Approach

The solution uses the concept of modular arithmetic to calculate the new position of each element after k shifts. It first calculates the total number of elements in the grid (m * n) and then takes the modulus of k with the total number of elements to handle cases where k is greater than the total number of elements. It then iterates over each element in the grid, calculates its new position after k shifts, and assigns the element to its new position in the result grid.

---

## Dry Run

For example, given the grid [[1, 2, 3], [4, 5, 6], [7, 8, 9]] and k = 1, the solution calculates the new position of each element as follows: (0, 0) -> (0, 1), (0, 1) -> (0, 2), (0, 2) -> (1, 0), (1, 0) -> (1, 1), (1, 1) -> (1, 2), (1, 2) -> (2, 0), (2, 0) -> (2, 1), (2, 1) -> (2, 2), (2, 2) -> (0, 0). The resulting grid is [[9, 1, 2], [3, 4, 5], [6, 7, 8]].

---

## Time Complexity

O(m * n)

---

## Space Complexity

O(m * n)

---

## Important Observations

Modular arithmetic, grid iteration

---

## Interview Notes

Key concepts to review: modular arithmetic, grid iteration, and handling edge cases where k is greater than the total number of elements.

---

## My Learnings

_Add your own personal notes here._
