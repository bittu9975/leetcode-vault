# Stone Game V

**Problem Number:** 1563
**Difficulty:** HARD
**Language:** Java
**Date Solved:** 2026-08-17

---

## Problem Statement

There are several stones arranged in a row, and each stone has an associated value which is an integer given in the array stoneValue.

In each round of the game, Alice divides the row into two non-empty rows (i.e. left row and right row), then Bob calculates the value of each row which is the sum of the values of all the stones in this row. Bob throws away the row which has the maximum value, and Alice&#39;s score increases by the value of the remaining row. If the value of the two rows are equal, Bob lets Alice decide which row will be thrown away. The next round starts with the remaining row.

The game ends when there is only one stone remaining. Alice&#39;s score is initially zero.

Return the maximum score that Alice can obtain.

&nbsp;
Example 1:


Input: stoneValue = [6,2,3,4,5,5]
Output: 18
Explanation: In the first round, Alice divides the row to [6,2,3], [4,5,5]. The left row has the value 11 and the right row has value 14. Bob throws away the right row and Alice&#39;s score is now 11.
In the second round Alice divides the row to [6], [2,3]. This time Bob throws away the left row and Alice&#39;s score becomes 16 (11 + 5).
The last round Alice has only one choice to divide the row which is [2], [3]. Bob throws away the right row and Alice&#39;s score is now 18 (16 + 2). The game ends because only one stone is remaining in the row.


Example 2:


Input: stoneValue = [7,7,7,7,7,7,7]
Output: 28


Example 3:


Input: stoneValue = [4]
Output: 0


&nbsp;
Constraints:


	1 &lt;= stoneValue.length &lt;= 500
	1 &lt;= stoneValue[i] &lt;= 106

---

## Intuition

Alice and Bob play a game where Alice divides a row of stones into two non-empty rows, and Bob throws away the row with the maximum value. The game ends when there is only one stone remaining, and Alice's score is the sum of the values of the stones in the rows she keeps. The goal is to find the maximum score Alice can obtain.

---

## Optimal Approach

The solution uses a depth-first search (DFS) approach with memoization to find the maximum score. It calculates the sum of the values of the stones in the current row and tries all possible divisions of the row into two non-empty rows. For each division, it recursively calls the DFS function on the left and right rows and updates the maximum score.

---

## Dry Run

For example, given the input [6,2,3,4,5,5], the DFS function first calculates the sum of the values of the stones in the current row, which is 25. Then, it tries all possible divisions of the row into two non-empty rows, such as [6,2,3] and [4,5,5], and recursively calls the DFS function on the left and right rows.

---

## Time Complexity

O(n^2)

---

## Space Complexity

O(n^2)

---

## Important Observations

Memoization, recursive DFS

---

## Interview Notes

To solve this problem, remember to use memoization to avoid redundant calculations and to try all possible divisions of the row into two non-empty rows. Also, pay attention to the base case where the row has only one stone, in which case the score is 0.

---

## My Learnings

_Add your own personal notes here._
