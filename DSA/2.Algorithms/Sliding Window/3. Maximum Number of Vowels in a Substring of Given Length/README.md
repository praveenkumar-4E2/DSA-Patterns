# [1456. Maximum Number of Vowels in a Substring of Given Length](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/)

Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

 

Example 1:
```
Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
```
Example 2:
```
Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
```
Example 3:
```
Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.
``` 

Constraints:

- ```1 <= s.length <= 105```
- ```s``` consists of lowercase English letters.
- ```1 <= k <= s.length```


## Approach
- **Initialize Variables:** Use a HashSet to store vowels and initialize counters for the number of vowels in the current window and the maximum found so far.

- **Sliding Window:** Iterate through the string with a window of size k using two pointers: left and right.

- **Expand the Window:** For each character at the right pointer, check if it’s a vowel and update the vowel count.

- **Contract the Window:** When the window size reaches k, update the maximum number of vowels found. Slide the left pointer rightward and adjust the vowel count if the character at the left pointer is a vowel.

- **Return Result:** After processing all possible windows, return the maximum number of vowels found in any window of size k.
