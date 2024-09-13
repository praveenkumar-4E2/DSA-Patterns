# [556. Next Greater Element III](https://leetcode.com/problems/next-greater-element-iii/description/)

Given a positive integer n, find the smallest integer which has exactly the same digits existing in the integer n and is greater in value than n. If no such positive integer exists, return -1.

Note that the returned integer should fit in 32-bit integer, if there is a valid answer but it does not fit in 32-bit integer, return -1.

 

Example 1:
```
Input: n = 12
Output: 21
```
Example 2:
```
Input: n = 21
Output: -1
 ```

**Constraints:**

- ```1 <= n <= 231 - 1```


# Approach :
1. **Convert to Character Array:**

    - Convert the integer n into a character array so the digits can be manipulated easily.
2. **Find the First Decreasing Element:**

    - Starting from the end of the array, find the first digit that is smaller than the digit to its right. This digit is where the rearrangement starts, and it's stored in index.
    - If no such digit exists (the digits are in descending order), return -1 because no larger number can be formed.
3. **Find the Next Larger Digit:**

    - Starting from the rightmost digit, find the smallest digit that is larger than the digit at index. Swap these two digits.
4. **Reverse the Digits After the Swap:**

    - To make the number as small as possible, reverse the digits to the right of the index to ensure they are in ascending order.
5. **Convert Back to Integer:**

    - Convert the character array back to a long, and if the result exceeds Integer.MAX_VALUE, return -1. Otherwise, return the result as an integer.

---

# Time Complexity:
- O(n) where n is the number of digits in n. The algorithm traverses the digits a few times (finding the decreasing element, swapping, and reversing).

# Space Complexity:
- O(n) due to the character array used to hold the digits of the number.

---

# Example:
Let's take n = 534976.

1. Step 1: Convert n to array: ['5', '3', '4', '9', '7', '6'].
2. Step 2: Find the first decreasing element: 4 < 9 at index = 2.
3. Step 3: Find the smallest larger digit after 4, which is 6. Swap them:
['5', '3', '6', '9', '7', '4'].
4. Step 4: Reverse the digits after index 2:
['5', '3', '6', '4', '7', '9'].
5. Step 5: Convert back to number: 536479.

The next greater number is 536479