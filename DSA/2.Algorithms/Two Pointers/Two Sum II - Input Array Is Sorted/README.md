# [167. Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/)


Given a 1-indexed array of integers numbers that is already sorted in ```non-decreasing order```, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where ```1 <= index1 < index2 <= numbers.length.```

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.

 

Example 1:
```
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
```
Example 2:
```
Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
```
Example 3:
```
Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
 ```

Constraints:

- ```2 <= numbers.length <= 3 * 104```
- ```-1000 <= numbers[i] <= 1000```
- numbers is sorted in ```non-decreasing order.```
- ```-1000 <= target <= 1000```
- The tests are generated such that there is **exactly one solution.**



# Approach
1. **Initialize Pointers:**  

    - left starts from the beginning (index 0).
    - right starts from the end (last index).
2. **Loop While Left <= Right:**

    -Calculate the sum of the two elements at numbers[left] and numbers[right].
3. **Check the Sum:**

    - If sum equals target: Return the 1-based indices {left + 1, right + 1}.
    - If sum is greater than target: Move the right pointer to the left (right--) because you want a smaller number.
    - If sum is less than target: Move the left pointer to the right (left++) because you want a larger number.
4. **Return Default:**

    - If no solution is found after the loop, return {-1, -1}.



# Time Complexity:
- **O(n)**, where n is the size of the input array, because you only pass through the array once by adjusting the two pointers.
# Space Complexity:
- **O(1)**, because only constant extra space is used for pointers and the result array.