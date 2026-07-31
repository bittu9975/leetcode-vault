# Minimum Number of Pushes to Type Word II

**Problem Number:** 3016
**Difficulty:** MEDIUM
**Language:** Java
**Date Solved:** 2026-08-01

---

## Problem Statement

You are given a string word containing lowercase English letters.

Telephone keypads have keys mapped with distinct collections of lowercase English letters, which can be used to form words by pushing them. For example, the key 2 is mapped with [&quot;a&quot;,&quot;b&quot;,&quot;c&quot;], we need to push the key one time to type &quot;a&quot;, two times to type &quot;b&quot;, and three times to type &quot;c&quot; .

It is allowed to remap the keys numbered 2 to 9 to distinct collections of letters. The keys can be remapped to any amount of letters, but each letter must be mapped to exactly one key. You need to find the minimum number of times the keys will be pushed to type the string word.

Return the minimum number of pushes needed to type word after remapping the keys.

An example mapping of letters to keys on a telephone keypad is given below. Note that 1, *, #, and 0 do not map to any letters.

&nbsp;
Example 1:


Input: word = &quot;abcde&quot;
Output: 5
Explanation: The remapped keypad given in the image provides the minimum cost.
&quot;a&quot; -&gt; one push on key 2
&quot;b&quot; -&gt; one push on key 3
&quot;c&quot; -&gt; one push on key 4
&quot;d&quot; -&gt; one push on key 5
&quot;e&quot; -&gt; one push on key 6
Total cost is 1 + 1 + 1 + 1 + 1 = 5.
It can be shown that no other mapping can provide a lower cost.


Example 2:


Input: word = &quot;xyzxyzxyzxyz&quot;
Output: 12
Explanation: The remapped keypad given in the image provides the minimum cost.
&quot;x&quot; -&gt; one push on key 2
&quot;y&quot; -&gt; one push on key 3
&quot;z&quot; -&gt; one push on key 4
Total cost is 1 * 4 + 1 * 4 + 1 * 4 = 12
It can be shown that no other mapping can provide a lower cost.
Note that the key 9 is not mapped to any letter: it is not necessary to map letters to every key, but to map all the letters.


Example 3:


Input: word = &quot;aabbccddeeffgghhiiiiii&quot;
Output: 24
Explanation: The remapped keypad given in the image provides the minimum cost.
&quot;a&quot; -&gt; one push on key 2
&quot;b&quot; -&gt; one push on key 3
&quot;c&quot; -&gt; one push on key 4
&quot;d&quot; -&gt; one push on key 5
&quot;e&quot; -&gt; one push on key 6
&quot;f&quot; -&gt; one push on key 7
&quot;g&quot; -&gt; one push on key 8
&quot;h&quot; -&gt; two pushes on key 9
&quot;i&quot; -&gt; one push on key 9
Total cost is 1 * 2 + 1 * 2 + 1 * 2 + 1 * 2 + 1 * 2 + 1 * 2 + 1 * 2 + 2 * 2 + 6 * 1 = 24.
It can be shown that no other mapping can provide a lower cost.


&nbsp;
Constraints:


	1 &lt;= word.length &lt;= 105
	word consists of lowercase English letters.

---

## Intuition

The problem requires finding the minimum number of pushes needed to type a given word on a telephone keypad after remapping the keys. The goal is to minimize the total number of pushes by assigning the most frequent letters to the keys that require the fewest pushes. The problem can be solved by sorting the frequencies of the letters in descending order and then assigning them to the keys.

---

## Optimal Approach

The approach used in the given code is to first calculate the frequency of each letter in the word. Then, the frequencies are sorted in descending order. The sorted frequencies are then assigned to the keys, with the most frequent letters being assigned to the keys that require the fewest pushes. The total number of pushes is calculated by multiplying the frequency of each letter by the number of pushes required to type it.

---

## Dry Run

For example, if the word is 'abcde', the frequencies of the letters are [1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]. After sorting, the frequencies are [1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]. The total number of pushes is 1*1 + 1*1 + 1*1 + 1*1 + 1*1 = 5.

---

## Time Complexity

O(n log n)

---

## Space Complexity

O(n)

---

## Important Observations

Sorting frequencies, greedy assignment of letters to keys

---

## Interview Notes

Calculate letter frequencies, sort them, assign to keys, calculate total pushes

---

## My Learnings

_Add your own personal notes here._
