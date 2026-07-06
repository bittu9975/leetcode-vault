# Remove Covered Intervals

**Problem Number:** 1288
**Difficulty:** MEDIUM
**Language:** Java
**Date Solved:** 2026-07-06

---

## Problem Statement

Given an array intervals where intervals[i] = [li, ri] represent the interval [li, ri), remove all intervals that are covered by another interval in the list.

The interval [a, b) is covered by the interval [c, d) if and only if c &lt;= a and b &lt;= d.

Return the number of remaining intervals.

&nbsp;
Example 1:


Input: intervals = [[1,4],[3,6],[2,8]]
Output: 2
Explanation: Interval [3,6] is covered by [2,8], therefore it is removed.


Example 2:


Input: intervals = [[1,4],[2,3]]
Output: 1


&nbsp;
Constraints:


	1 &lt;= intervals.length &lt;= 1000
	intervals[i].length == 2
	0 &lt;= li &lt; ri &lt;= 105
	All the given intervals are unique.

---

## Intuition

The problem asks to remove all intervals that are covered by another interval in the list and return the number of remaining intervals. An interval [a, b) is covered by the interval [c, d) if and only if c <= a and b <= d. The goal is to count the number of intervals that are not covered by any other interval. The problem provides a list of intervals where each interval is represented as [li, ri) and asks to return the count of remaining intervals after removing the covered ones.

---

## Optimal Approach

The given solution sorts the intervals based on their start value and in case of a tie, it sorts them based on their end value in descending order. It then iterates through the sorted intervals and increments the count whenever it encounters an interval with an end value greater than the current maxEnd. This approach works because the sorting ensures that if an interval is covered by another, the covering interval will come first in the sorted list and will have a larger end value.

---

## Dry Run

For example, given the input intervals = [[1,4],[3,6],[2,8]], the solution first sorts them as [[1,4],[2,8],[3,6]]. It then initializes count to 0 and maxEnd to 0. As it iterates through the sorted intervals, it increments the count to 1 for the interval [1,4] because its end value 4 is greater than the current maxEnd 0. It then updates maxEnd to 4. For the next interval [2,8], it increments the count to 2 because its end value 8 is greater than the current maxEnd 4. It then updates maxEnd to 8. For the last interval [3,6], it does not increment the count because its end value 6 is not greater than the current maxEnd 8. Therefore, the solution returns the count 2.

---

## Time Complexity

O(n log n)

---

## Space Complexity

O(1)

---

## Important Observations

Sorting, Iteration

---

## Interview Notes

Understand the concept of covered intervals, practice sorting and iteration techniques, and be able to explain the time and space complexity of the solution.

---

## My Learnings

_Add your own personal notes here._
