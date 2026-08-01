# Predict the Winner

**Problem Number:** 486
**Difficulty:** MEDIUM
**Language:** Java
**Date Solved:** 2026-08-01

---

## Problem Statement

You are given an integer array nums. Two players are playing a game with this array: player 1 and player 2.

Player 1 and player 2 take turns, with player 1 starting first. Both players start the game with a score of 0. At each turn, the player takes one of the numbers from either end of the array (i.e., nums[0] or nums[nums.length - 1]) which reduces the size of the array by 1. The player adds the chosen number to their score. The game ends when there are no more elements in the array.

Return true if Player 1 can win the game. If the scores of both players are equal, then player 1 is still the winner, and you should also return true. You may assume that both players are playing optimally.

&nbsp;
Example 1:


Input: nums = [1,5,2]
Output: false
Explanation: Initially, player 1 can choose between 1 and 2. 
If he chooses 2 (or 1), then player 2 can choose from 1 (or 2) and 5. If player 2 chooses 5, then player 1 will be left with 1 (or 2). 
So, final score of player 1 is 1 + 2 = 3, and player 2 is 5. 
Hence, player 1 will never be the winner and you need to return false.


Example 2:


Input: nums = [1,5,233,7]
Output: true
Explanation: Player 1 first chooses 1. Then player 2 has to choose between 5 and 7. No matter which number player 2 choose, player 1 can choose 233.
Finally, player 1 has more score (234) than player 2 (12), so you need to return True representing player1 can win.


&nbsp;
Constraints:


	1 &lt;= nums.length &lt;= 20
	0 &lt;= nums[i] &lt;= 107

---

## Intuition

The problem involves two players taking turns choosing numbers from either end of an array, with the goal of having a higher or equal score than the opponent. The game ends when all numbers have been chosen. The task is to determine if player 1 can win the game, assuming both players play optimally. The solution uses dynamic programming to find the maximum score difference player 1 can achieve.

---

## Optimal Approach

The solution uses a recursive approach with memoization to calculate the maximum score difference player 1 can achieve. It considers two options at each step: taking the number from the left end or the right end of the array. The maximum score difference is calculated by subtracting the minimum score difference the opponent can achieve from the chosen number. The memoization table dp stores the results of subproblems to avoid redundant calculations.

---

## Dry Run

For example, given the array [1,5,2], the solution starts by considering the options of taking 1 or 2. If player 1 takes 1, the opponent can take either 5 or 2. The solution calculates the maximum score difference for each option and stores the result in the memoization table. The process continues recursively until all numbers have been chosen, and the final result is the maximum score difference player 1 can achieve.

---

## Time Complexity

O(n^2)

---

## Space Complexity

O(n^2)

---

## Important Observations

Memoization, recursive approach, considering two options at each step

---

## Interview Notes

Focus on understanding the problem and identifying the key elements: the recursive approach, memoization, and considering two options at each step. Practice similar problems to improve your ability to recognize and apply these concepts.

---

## My Learnings

_Add your own personal notes here._
