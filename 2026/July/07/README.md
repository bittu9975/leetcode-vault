# Palindrome Number

**Problem Number:** 9
**Difficulty:** EASY
**Language:** Java
**Date Solved:** 2026-07-07

---

## Problem Statement

Given an integer x, return true if x is a palindrome, and false otherwise.

&nbsp;
Example 1:


Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.


Example 2:


Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.


Example 3:


Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


&nbsp;
Constraints:


	-231&nbsp;&lt;= x &lt;= 231&nbsp;- 1


&nbsp;
Follow up: Could you solve it without converting the integer to a string?

---

## Intuition

The problem asks to determine if a given integer is a palindrome, meaning it reads the same forwards and backwards. The input is an integer x, and the output is a boolean value indicating whether x is a palindrome. The solution must handle integers within the range -2^31 to 2^31 - 1.

---

## Optimal Approach

The given solution uses a simple iterative approach to reverse the input integer and then compare it with the original value. It first checks if the input is negative, in which case it immediately returns false since negative numbers cannot be palindromes. Then, it uses a while loop to extract each digit from the input integer, append it to the reversed integer, and update the input integer by removing the last digit. This process continues until all digits have been processed, at which point the reversed integer is compared with the original input to determine if it is a palindrome.

---

## Dry Run

For example, given the input x = 121, the solution will perform the following steps: (1) check if x is negative (it is not), (2) initialize reversed = 0 and temp = 121, (3) extract the last digit (1) and append it to reversed (reversed = 1), (4) update temp to 12, (5) extract the last digit (2) and append it to reversed (reversed = 12), (6) update temp to 1, (7) extract the last digit (1) and append it to reversed (reversed = 121), (8) compare reversed (121) with x (121) and return true since they are equal.

---

## Time Complexity

O(log n)

---

## Space Complexity

O(1)

---

## Important Observations

Reversing the integer, handling negative numbers

---

## Interview Notes

Remember to handle negative numbers, and consider the range of the input integer. Practice reversing integers and comparing them with the original values to become familiar with this type of problem.

---

## My Learnings

_Add your own personal notes here._
