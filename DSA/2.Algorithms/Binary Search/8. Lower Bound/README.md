Given a sorted array of integers nums and an integer target x, return the index of the first occurrence of a number in the array that is greater than or equal to x. If no such number exists, return the length of the array.

You must implement the algorithm in O(log n) time complexity.

Example 1:
```
Input: nums = [1, 2, 4, 4, 5, 6], x = 4
Output: 2
Explanation: The first occurrence of 4 is at index 2, so the lower bound for 4 is 2.
```
Example 2:
```
Input: nums = [1, 2, 4, 4, 5, 6], x = 3
Output: 2
Explanation: There is no 3 in the array. The lower bound for 3 is at index 2, where the first element greater than 3 is 4.
```
Example 3:
```
Input: nums = [1, 2, 4, 4, 5, 6], x = 7
Output: 6
Explanation: 7 is greater than all elements in the array, so the function should return 6, the length of the array.
```

Constraints:
- ```1 <= nums.length <= 10^5```
- ```-10^9 <= nums[i], x <= 10^9```
- ```nums``` is sorted in non-decreasing order.