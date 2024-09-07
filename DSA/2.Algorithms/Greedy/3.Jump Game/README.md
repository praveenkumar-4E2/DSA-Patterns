# [55. Jump Game](https://leetcode.com/problems/jump-game/description/?envType=problem-list-v2&envId=greedy)

You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

 

**Example 1:**
```
Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
```
**Example 2:**
```
Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 ```

**Constraints:**

- ```1 <= nums.length <= 104```
- ```0 <= nums[i] <= 105```


# Approach
1. **Initialize maxJump:** Start with maxJump set to the value of the first element, which represents the maximum index you can reach initially.
2. **Iterate through the array:** For each index, check if it’s beyond the current maxJump. If so, return false because you cannot reach this index.
3. **Update maxJump:** Update maxJump to be the maximum of its current value and the farthest index that can be reached from the current index (index + nums[index]).
4. **Return true:** If you finish iterating without finding an unreachable index, return true because you can reach the end of the array.