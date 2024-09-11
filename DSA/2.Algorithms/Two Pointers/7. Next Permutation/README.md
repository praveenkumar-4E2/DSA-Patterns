# [31. Next Permutation](https://leetcode.com/problems/next-permutation/description/)

A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.


**Example 1:**
```
Input: nums = [1,2,3]
Output: [1,3,2]
```
**Example 2:**
```
Input: nums = [3,2,1]
Output: [1,2,3]
```
**Example 3:**
```
Input: nums = [1,1,5]
Output: [1,5,1]
 ```

**Constraints:**

- 1 <= nums.length <= 100
- 0 <= nums[i] <= 100

# Appraoch
1. Find the first decreasing element from the end of the array (smallerIndex). This element is the point where the current permutation can still be rearranged to get a larger permutation.
2. If no such element is found, the array is in descending order, so reverse the entire array to get the smallest permutation.
3. Find the smallest element larger than nums[smallerIndex] from the right of the array and swap them. This ensures that we get the next larger permutation.
4. Finally, reverse the portion of the array after smallerIndex to make it the smallest possible arrangement.

# Time Complexity:
- The algorithm runs in O(n) because we scan the array several times.
# Space Complexity:
- The space complexity is O(1) since we are only using a few extra variables for swapping and reversing in place.


--- 


# Let's run through the example [1, 1, 3, 2, 9, 7, 5, 4] step by step using the nextPermutation algorithm to understand how it finds the next greater permutation.

Initial Array: [1, 1, 3, 2, 9, 7, 5, 4]
1. Step 1: Find the first decreasing element from the end.

    - Start from the end of the array and move left, checking when an element is smaller than the one after it.
    - 4 is smaller than 5 (no), 5 is smaller than 7 (no), 7 is smaller than 9 (no), 9 is smaller than 2 (no).
    - Finally, 2 < 9. So, smallerIndex = 3 (element 2).
2. Step 2: Find the element just larger than nums[smallerIndex] (which is 2).

    - Look for the element just larger than 2 by scanning from the right side.
    - Starting from the end, the first element larger than 2 is 4.
    - Swap 2 and 4.
    - Array after swap: [1, 1, 3, 4, 9, 7, 5, 2]

3. Step 3: Reverse the elements after smallerIndex + 1.

    - Now, reverse the part of the array after index 3 (the portion [9, 7, 5, 2]).
    - Reversing this gives [2, 5, 7, 9].
**Final Array:** [1, 1, 3, 4, 2, 5, 7, 9]

**Result:**
The next permutation of [1, 1, 3, 2, 9, 7, 5, 4] is [1, 1, 3, 4, 2, 5, 7, 9].