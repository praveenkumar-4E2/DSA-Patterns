# [633. Sum of Square Numbers](https://leetcode.com/problems/sum-of-square-numbers/description/)

Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

 

**Example 1:**
```
Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5
```
**Example 2:**
```
Input: c = 3
Output: false
 ```

**Constraints:**

- 0 <= c <= 231 - 1

--- 

# Approach
1. Initialize two pointers: a at 0 and b at the square root of c.
2. Use a loop to check if the sum of squares a^2 + b^2 equals c.
3. If the sum matches c, return true.
4. If the sum is greater than c, decrement b to reduce the sum.
5. If the sum is less than c, increment a to increase the sum.
6. Continue the loop until a exceeds b.
7. If no such pair is found, return false.


# Time Complexity:
- The time complexity is O(√c), where c is the input number.
    - This is because the algorithm uses two pointers (a and b). The pointer a starts from 0 and goes up to the square root of c (i.e., √c), while b starts at √c and decreases.
    - Each iteration moves one of the pointers, so the loop runs approximately O(√c) times.
# Space Complexity:
- The space complexity is O(1).
    - The algorithm uses only a few integer variables (a, b, sum), and no additional data structures are used, so the space usage is constant.