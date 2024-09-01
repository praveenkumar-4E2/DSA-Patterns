Problem: Find Upper Bound in a Sorted Array

Given a sorted array of integers nums and an integer target x, return the index of the first occurrence of a number in the array that is strictly greater than x. If no such number exists, return the length of the array.

You must implement the algorithm in ```O(log n)``` time complexity.

Example 1:
```
Input: nums = [1, 2, 4, 4, 5, 6], x = 4
Output: 4
```
Example 2:
```
Input: nums = [1, 2, 4, 4, 5, 6], x = 6
Output: 6
```
Example 3:
```
Input: nums = [1, 2, 4, 4, 5, 6], x = 3
Output: 2
```
Constraints:

- ```1 <= nums.length <= 10^5```
- ```-10^9 <= nums[i], x <= 10^9```
- ```nums``` is sorted in non-decreasing order.