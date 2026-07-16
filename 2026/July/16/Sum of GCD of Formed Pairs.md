# Sum of GCD of Formed Pairs

**Problem Number:** 3867
**Difficulty:** MEDIUM
**Language:** Java
**Date Solved:** 2026-07-16

---

## Problem Statement

You are given an integer array nums of length n.

Construct an array prefixGcd where for each index i:


	Let mxi = max(nums[0], nums[1], ..., nums[i]).
	prefixGcd[i] = gcd(nums[i], mxi).


After constructing prefixGcd:


	Sort prefixGcd in non-decreasing order.
	Form pairs by taking the smallest unpaired element and the largest unpaired element.
	Repeat this process until no more pairs can be formed.
	For each formed pair, compute the gcd of the two elements.
	If n is odd, the middle element in the prefixGcd array remains unpaired and should be ignored.


Return an integer denoting the sum of the GCD values of all formed pairs.
The term gcd(a, b) denotes the greatest common divisor of a and b.
&nbsp;
Example 1:


Input: nums = [2,6,4]

Output: 2

Explanation:

Construct prefixGcd:


	
		
			i
			nums[i]
			mxi
			prefixGcd[i]
		
	
	
		
			0
			2
			2
			2
		
		
			1
			6
			6
			6
		
		
			2
			4
			6
			2
		
	


prefixGcd = [2, 6, 2]. After sorting, it forms [2, 2, 6].

Pair the smallest and largest elements: gcd(2, 6) = 2. The remaining middle element 2 is ignored. Thus, the sum is 2.


Example 2:


Input: nums = [3,6,2,8]

Output: 5

Explanation:

Construct prefixGcd:


	
		
			i
			nums[i]
			mxi
			prefixGcd[i]
		
	
	
		
			0
			3
			3
			3
		
		
			1
			6
			6
			6
		
		
			2
			2
			6
			2
		
		
			3
			8
			8
			8
		
	


prefixGcd = [3, 6, 2, 8]. After sorting, it forms [2, 3, 6, 8].

Form pairs: gcd(2, 8) = 2 and gcd(3, 6) = 3. Thus, the sum is 2 + 3 = 5.


&nbsp;
Constraints:


	1 &lt;= n == nums.length &lt;= 105
	1 &lt;= nums[i] &lt;= 10​​​​​​​9

---

## Intuition

The problem requires constructing an array prefixGcd where each element is the gcd of the current number and the maximum number seen so far, then sorting the array and forming pairs of the smallest and largest unpaired elements to calculate the sum of their gcd values. The goal is to return the sum of the gcd values of all formed pairs. The problem involves array construction, sorting, and pair formation to calculate the sum of gcd values.

---

## Optimal Approach

The solution uses a two-step approach: first, it constructs the prefixGcd array by iterating through the input array and calculating the gcd of each number and the maximum number seen so far. Then, it sorts the prefixGcd array and forms pairs of the smallest and largest unpaired elements, calculating the sum of their gcd values. The solution uses a simple iterative method to calculate the gcd of two numbers.

---

## Dry Run

For example, given the input array [2, 6, 4], the solution first constructs the prefixGcd array as [2, 6, 2]. After sorting, the array becomes [2, 2, 6]. Then, it forms a pair of the smallest and largest unpaired elements, which is (2, 6), and calculates their gcd as 2. The sum of the gcd values is 2.

---

## Time Complexity

O(n log n)

---

## Space Complexity

O(n)

---

## Important Observations

GCD calculation, array sorting, pair formation

---

## Interview Notes

Review gcd calculation, array sorting, and pair formation techniques. Practice solving problems involving array construction and manipulation.

---

## My Learnings

_Add your own personal notes here._
