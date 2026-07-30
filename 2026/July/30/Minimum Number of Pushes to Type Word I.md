# Minimum Number of Pushes to Type Word I

**Problem Number:** 3014
**Difficulty:** EASY
**Language:** Java
**Date Solved:** 2026-07-30

---

## Problem Statement

You are given a string word containing distinct lowercase English letters.

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


Input: word = &quot;xycdefghij&quot;
Output: 12
Explanation: The remapped keypad given in the image provides the minimum cost.
&quot;x&quot; -&gt; one push on key 2
&quot;y&quot; -&gt; two pushes on key 2
&quot;c&quot; -&gt; one push on key 3
&quot;d&quot; -&gt; two pushes on key 3
&quot;e&quot; -&gt; one push on key 4
&quot;f&quot; -&gt; one push on key 5
&quot;g&quot; -&gt; one push on key 6
&quot;h&quot; -&gt; one push on key 7
&quot;i&quot; -&gt; one push on key 8
&quot;j&quot; -&gt; one push on key 9
Total cost is 1 + 2 + 1 + 2 + 1 + 1 + 1 + 1 + 1 + 1 = 12.
It can be shown that no other mapping can provide a lower cost.


&nbsp;
Constraints:


	1 &lt;= word.length &lt;= 26
	word consists of lowercase English letters.
	All letters in word are distinct.

---

## Intuition

The problem involves finding the minimum number of pushes needed to type a given word on a telephone keypad after remapping the keys. The word consists of distinct lowercase English letters and the goal is to minimize the total number of pushes. The solution involves distributing the letters across the keys in a way that minimizes the total number of pushes.

---

## Optimal Approach

The given solution uses a simple yet effective approach. It calculates the minimum number of pushes by dividing the index of each letter by 8 and adding 1. This is because each key can have at most 8 letters mapped to it, and the number of pushes required to type a letter is equal to its position in the key's mapping. By using this formula, the solution effectively distributes the letters across the keys to minimize the total number of pushes.

---

## Dry Run

For example, if the input word is 'abcdefghij', the solution will calculate the minimum number of pushes as follows: (0/8)+1 = 1 for 'a', (1/8)+1 = 1 for 'b', (2/8)+1 = 1 for 'c', and so on. The total number of pushes will be 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 2 + 2 = 12.

---

## Time Complexity

O(n)

---

## Space Complexity

O(1)

---

## Important Observations

Distribution of letters across keys, integer division

---

## Interview Notes

Remapping keys to minimize pushes, distributing letters across keys, integer division to calculate pushes

---

## My Learnings

_Add your own personal notes here._
