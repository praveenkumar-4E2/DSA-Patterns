# [15. 3Sum](https://leetcode.com/problems/3sum/description/)

Given an integer array nums, return all the triplets ```[nums[i], nums[j], nums[k]]``` such that ```i != j, i != k```, and``` j != k```, and ```nums[i] + nums[j] + nums[k] == 0```.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:
```
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
```
Example 2:
```
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
```
Example 3:
```
Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 ```

Constraints:

- ```3 <= nums.length <= 3000```
- ```-105 <= nums[i] <= 105```

---

# Approach
1. **Sort the Array:** This helps in handling duplicates and simplifies the two-pointer technique.
2. **Initialize the Result List:** To store unique triplets.
3. **Iterate with a Fixed Pointer:** Use the first pointer (i) to iterate from the start to nums.length - 2.
4. **Skip Duplicates for Fixed Pointer:** Continue to the next iteration if the current value is the same as the previous value.
5. **Use Two Pointers:**
    - Initialize left to i + 1 and right to the end of the array.
    - While left < right, calculate the sum of nums[i], nums[left], and nums[right].
    - If the sum is zero, add the triplet to the result, then skip duplicates and move both pointers.
    - If the sum is less than zero, increment left to increase the sum.
    - If the sum is greater than zero, decrement right to decrease the sum.
6. **Return the Result List:** Containing all unique triplets.
--- 

# Complexity:
- **Time Complexity:** O(n^2), where n is the number of elements in the array. This is because, for each element, the algorithm performs a linear scan with the two-pointer approach.
- **Space Complexity:** O(1) (excluding the space for the result list), as only a few extra variables are used.