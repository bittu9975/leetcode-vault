# Concatenate Non-Zero Digits and Multiply by Sum II

**Problem Number:** 3756
**Difficulty:** MEDIUM
**Language:** Java
**Date Solved:** 2026-07-09

---

## Problem Statement

You are given a string s of length m consisting of digits. You are also given a 2D integer array queries, where queries[i] = [li, ri].

For each queries[i], extract the substring s[li..ri]. Then, perform the following:


	Form a new integer x by concatenating all the non-zero digits from the substring in their original order. If there are no non-zero digits, x = 0.
	Let sum be the sum of digits in x. The answer is x * sum.


Return an array of integers answer where answer[i] is the answer to the ith query.

Since the answers may be very large, return them modulo 109 + 7.

&nbsp;
Example 1:


Input: s = &quot;10203004&quot;, queries = [[0,7],[1,3],[4,6]]

Output: [12340, 4, 9]

Explanation:


	s[0..7] = &quot;10203004&quot;

	
		x = 1234
		sum = 1 + 2 + 3 + 4 = 10
		Therefore, answer is 1234 * 10 = 12340.
	
	
	s[1..3] = &quot;020&quot;
	
		x = 2
		sum = 2
		Therefore, the answer is 2 * 2 = 4.
	
	
	s[4..6] = &quot;300&quot;
	
		x = 3
		sum = 3
		Therefore, the answer is 3 * 3 = 9.
	
	



Example 2:


Input: s = &quot;1000&quot;, queries = [[0,3],[1,1]]

Output: [1, 0]

Explanation:


	s[0..3] = &quot;1000&quot;

	
		x = 1
		sum = 1
		Therefore, the answer is 1 * 1 = 1.
	
	
	s[1..1] = &quot;0&quot;
	
		x = 0
		sum = 0
		Therefore, the answer is 0 * 0 = 0.
	
	



Example 3:


Input: s = &quot;9876543210&quot;, queries = [[0,9]]

Output: [444444137]

Explanation:


	s[0..9] = &quot;9876543210&quot;

	
		x = 987654321
		sum = 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 = 45
		Therefore, the answer is 987654321 * 45 = 44444444445.
		We return 44444444445 modulo (109 + 7) = 444444137.
	
	



&nbsp;
Constraints:


	1 &lt;= m == s.length &lt;= 105
	s consists of digits only.
	1 &lt;= queries.length &lt;= 105
	queries[i] = [li, ri]
	0 &lt;= li &lt;= ri &lt; m

---

## Intuition

The problem requires processing a string of digits and answering queries by extracting substrings, concatenating non-zero digits, calculating the sum of these digits, and returning the product of the concatenated number and the sum modulo 10^9 + 7. The solution preprocesses the string to store positions and values of non-zero digits, then uses prefix sums and binary search to efficiently answer queries. The goal is to return an array of integers where each integer corresponds to the answer for a given query.

---

## Optimal Approach

The approach involves first preprocessing the input string to extract and store the positions and values of non-zero digits. Then, for each query, it uses binary search to find the range of non-zero digits within the query's substring. It calculates the concatenated number and the sum of its digits using prefix sums and modular arithmetic. Finally, it returns the product of the concatenated number and the sum modulo 10^9 + 7.

---

## Dry Run

Consider the input string '10203004' and the query [0,7]. The preprocessing step would store the positions and values of non-zero digits as [1,2,3,4]. For the query [0,7], the binary search would find the range of non-zero digits as [1,4], corresponding to the digits '1', '2', '3', '4'. The concatenated number would be 1234, and the sum of its digits would be 10. The answer would be (1234 * 10) % (10^9 + 7) = 12340.

---

## Time Complexity

O(n + q log n)

---

## Space Complexity

O(n)

---

## Important Observations

Prefix sums, binary search, modular arithmetic

---

## Interview Notes

Review prefix sums, binary search, and modular arithmetic. Practice problems involving string preprocessing and query answering.

---

## My Learnings

_Add your own personal notes here._
