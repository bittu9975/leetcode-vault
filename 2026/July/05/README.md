# Add Two Numbers

**Problem Number:** 2
**Difficulty:** MEDIUM
**Language:** Java
**Date Solved:** 2026-07-05

---

## Problem Statement

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum&nbsp;as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

&nbsp;
Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.


Example 2:


Input: l1 = [0], l2 = [0]
Output: [0]


Example 3:


Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]


&nbsp;
Constraints:


	The number of nodes in each linked list is in the range [1, 100].
	0 &lt;= Node.val &lt;= 9
	It is guaranteed that the list represents a number that does not have leading zeros.

---

## Intuition

The problem requires adding two non-negative integers represented as linked lists, where each node contains a single digit, and returning the sum as a linked list. The digits are stored in reverse order. The goal is to implement a function that can handle this addition and return the correct result. The function should be able to handle cases where the input linked lists have different lengths and where the sum of the numbers results in a carry.

---

## Optimal Approach

The solution uses a dummy head node to simplify the code and avoid dealing with special cases for the head of the result list. It then iterates through the input linked lists, adding corresponding digits and keeping track of any carry. The sum of the digits and the carry is calculated, and the result is used to create a new node in the result list. The process continues until all nodes in the input lists have been processed, and any remaining carry is handled.

---

## Dry Run

For example, given the input linked lists [2,4,3] and [5,6,4], the function would perform the following steps: (2+5)%10 = 7, carry = (2+5)/10 = 0, so the first node in the result list is 7. Then, (4+6)%10 = 0, carry = (4+6)/10 = 1, so the second node in the result list is 0. Finally, (3+4+1)%10 = 8, carry = (3+4+1)/10 = 0, so the third node in the result list is 8.

---

## Time Complexity

O(max(m, n))

---

## Space Complexity

O(max(m, n))

---

## Important Observations

Iteration through linked lists, carry propagation

---

## Interview Notes

Key points to remember: use a dummy head node to simplify the code, iterate through the input linked lists, and keep track of any carry. Make sure to handle cases where the input linked lists have different lengths and where the sum of the numbers results in a carry.

---

## My Learnings

_Add your own personal notes here._
