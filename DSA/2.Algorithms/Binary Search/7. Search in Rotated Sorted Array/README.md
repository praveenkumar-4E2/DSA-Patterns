# [33. Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/description/)

There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is ```[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]``` (0-indexed). For example, ```[0,1,2,4,5,6,7]``` might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with ```O(log n)``` runtime complexity.

 

Example 1:
```
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
```
Example 2:
```
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
```
Example 3:
```
Input: nums = [1], target = 0
Output: -1
 ```

Constraints:

- ```1 <= nums.length <= 5000```
- ```-104 <= nums[i] <= 104```
- All values of nums are **unique**.
- ```nums``` is an ascending array that is possibly rotated.
- ```-104 <= target <= 104```


## Approach:
### 1.Initialize Pointers:

- Set left to 0 and right to nums.length - 1.
### 2.Binary Search Loop:

- While left is less than or equal to right:
    - Compute mid as left + (right - left) / 2.
    - Check if nums[mid] is the target. If yes, return mid.
### 3. Determine Sorted Half:

- If nums[left] <= nums[mid] (left half is sorted):

    - If nums[left] <= target < nums[mid], adjust right to mid - 1 (search in the left half).
    - Otherwise, adjust left to mid + 1 (search in the right half).
- If the left half is not sorted (right half is sorted):

    - If nums[mid] < target <= nums[right], adjust left to mid + 1 (search in the right half).
    - Otherwise, adjust right to mid - 1 (search in the left half).
### 4. Return Result:

- If the loop ends without finding the target, return -1