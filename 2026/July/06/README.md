# Number of Paths with Max Score

**Problem Number:** 1301
**Difficulty:** HARD
**Language:** Java
**Date Solved:** 2026-07-06

---

## Problem Statement

You are given a square board&nbsp;of characters. You can move on the board starting at the bottom right square marked with the character&nbsp;&#39;S&#39;.

You need&nbsp;to reach the top left square marked with the character &#39;E&#39;. The rest of the squares are labeled either with a numeric character&nbsp;1, 2, ..., 9 or with an obstacle &#39;X&#39;. In one move you can go up, left or up-left (diagonally) only if there is no obstacle there.

Return a list of two integers: the first integer is the maximum sum of numeric characters you can collect, and the second is the number of such paths that you can take to get that maximum sum, taken modulo 10^9 + 7.

In case there is no path, return&nbsp;[0, 0].

&nbsp;
Example 1:
Input: board = ["E23","2X2","12S"]
Output: [7,1]
Example 2:
Input: board = ["E12","1X1","21S"]
Output: [4,2]
Example 3:
Input: board = ["E11","XXX","11S"]
Output: [0,0]

&nbsp;
Constraints:


	2 &lt;= board.length == board[i].length &lt;= 100

---

## Intuition

This problem involves finding the maximum sum of numeric characters that can be collected on a square board while moving from the bottom right square to the top left square, and also finding the number of paths that can achieve this maximum sum. The board contains numeric characters, obstacles, and start and end points. The goal is to return a list of two integers: the maximum sum of numeric characters and the number of paths that can achieve this maximum sum. If there is no path, the function returns [0, 0].

---

## Optimal Approach

The solution uses dynamic programming to solve the problem. It initializes two 2D arrays, dpScore and dpWays, to store the maximum score and the number of ways to achieve this score for each cell on the board. The function then traverses the board from the bottom right to the top left, updating the dpScore and dpWays arrays based on the values of the adjacent cells. The function also handles obstacles and the start and end points. Finally, the function returns the maximum sum of numeric characters and the number of paths that can achieve this maximum sum.

---

## Dry Run

For example, given the board ["E23", "2X2", "12S"], the function will start from the bottom right cell and move up, left, and diagonally to the top left cell, updating the dpScore and dpWays arrays along the way. The function will skip obstacles and handle the start and end points. The final result will be [7, 1], indicating that the maximum sum of numeric characters is 7 and there is 1 path that can achieve this maximum sum.

---

## Time Complexity

O(n^2)

---

## Space Complexity

O(n^2)

---

## Important Observations

Dynamic programming, obstacle handling, start and end points

---

## Interview Notes

Review dynamic programming, obstacle handling, and start and end points. Practice solving similar problems to improve problem-solving skills.

---

## My Learnings

_Add your own personal notes here._
