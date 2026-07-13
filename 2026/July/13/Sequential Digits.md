# Sequential Digits

**Problem Number:** 1291
**Difficulty:** MEDIUM
**Language:** Java
**Date Solved:** 2026-07-13

---

## Problem Statement

An&nbsp;integer has sequential digits if and only if each digit in the number is one more than the previous digit.

Return a sorted list of all the integers&nbsp;in the range [low, high]&nbsp;inclusive that have sequential digits.

&nbsp;
Example 1:
Input: low = 100, high = 300
Output: [123,234]
Example 2:
Input: low = 1000, high = 13000
Output: [1234,2345,3456,4567,5678,6789,12345]

&nbsp;
Constraints:


	10 &lt;= low &lt;= high &lt;= 10^9

---

## Intuition

The problem requires finding all integers within a given range that have sequential digits, meaning each digit is one more than the previous digit. The solution involves generating all possible sequential digit numbers and filtering those within the given range. The result is a sorted list of integers with sequential digits.

---

## Optimal Approach

The algorithm uses a string of digits from 1 to 9 and generates all possible substrings of different lengths. Each substring represents a potential sequential digit number, which is then parsed to an integer and checked if it falls within the given range. If it does, the number is added to the result list.

---

## Dry Run

For example, with low = 100 and high = 300, the algorithm generates substrings like '12', '123', '1234', etc. It checks if the integer value of each substring, like 12, 123, 1234, falls within the range [100, 300]. If it does, like 123 and 234, the number is added to the result list.

---

## Time Complexity

O(n^2 log n)

---

## Space Complexity

O(n)

---

## Important Observations

String manipulation, substring generation, integer parsing

---

## Interview Notes

Review string manipulation, substring generation, and integer parsing. Practice generating all possible substrings of a string and parsing them to integers. Understand how to filter numbers within a given range.

---

## My Learnings

_Add your own personal notes here._
