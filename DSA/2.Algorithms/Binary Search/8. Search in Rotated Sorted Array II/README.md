# [81. Search in Rotated Sorted Array II](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/)

There is an integer array nums sorted in non-decreasing order (not necessarily with **distinct** values).

Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is ```[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]``` (0-indexed). For example, ```[0,1,2,4,4,4,5,6,6,7] ```might be rotated at pivot index 5 and become ```[4,5,6,6,7,0,1,2,4,4]```.

Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

You must decrease the overall operation steps as much as possible.

 

Example 1:
```
Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
```
Example 2:
```
Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false
 ```

Constraints:

- ```1 <= nums.length <= 5000```
- ```-104 <= nums[i] <= 104```
- nums is guaranteed to be rotated at some pivot.
- ```-104 <= target <= 104```

# Appraoch:
### 1.Initialize: Set left to 0 and right to the end of the array.
### 2.Binary Search Loop:
- While left ≤ right:
    - Compute mid.
    - If nums[mid] is the target, return true.
### 3. Handle Duplicates:
- If the elements at left, mid, and right are the same, adjust left and right to potentially skip duplicate values.
### 4. Check Sorted Half:
- If nums[left] ≤ nums[mid] (left is sorted):
    - If target is in the range of the sorted left half, adjust right to mid - 1.
    - Otherwise, adjust left to mid + 1.
- If the right half is sorted:
    - If target is in the range of the sorted right half, adjust left to mid + 1.
    - Otherwise, adjust right to mid - 1.
### 5. Return Result:
- If the loop ends without finding the target, return false.