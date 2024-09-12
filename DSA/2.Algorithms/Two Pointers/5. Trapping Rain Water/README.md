# [42. Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/description/)
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 

**Example 1:**

```
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
```
**Example 2:**
```
Input: height = [4,2,0,3,2,5]
Output: 9
 ```

**Constraints:**

- ```n == height.length```
- ```1 <= n <= 2 * 104```
- ```0 <= height[i] <= 105```





# Approach:
1. Use a two-pointer technique with left and right starting from opposite ends of the array.
2. Track the maximum heights (leftMax and rightMax) encountered from both sides.
3. At each step:
    - If height[left] <= height[right], process the left pointer, otherwise process the right pointer.
    - If the current height is greater than the max height from that side, update the max height.
    - Otherwise, calculate the water trapped at that point by subtracting the height from the max height and add it to totalWater.
4. Continue until the two pointers meet.
---

# Time Complexity:
- O(n): The array is traversed once with the two-pointer technique.
# Space Complexity:
- O(1): Only a few extra variables are used, so the space complexity is constant.

----

# Step-by-Step Execution:
1. **Iteration 1:**

- height[left] = 4, height[right] = 5
- height[left] <= height[right] (4 <= 5), check the left side.
- height[left] (4) > leftMax (0), so update leftMax = 4.
- Move left pointer to 1. left = 1.
2. **Iteration 2:**

- height[left] = 2, height[right] = 5
- height[left] <= height[right] (2 <= 5), check the left side.
- height[left] (2) <= leftMax (4) => water trapped at left = leftMax - height[left] = 4 - 2 = 2.
- Add 2 to totalWater (totalWater = 2).
- Move left pointer to 2. left = 2.
3. **Iteration 3:**

- height[left] = 0, height[right] = 5
- height[left] <= height[right] (0 <= 5), check the left side.
- height[left] (0) <= leftMax (4) => water trapped at left = leftMax - height[left] = 4 - 0 = 4.
- Add 4 to totalWater (totalWater = 6).
- Move left pointer to 3. left = 3.
4. **Iteration 4:**

- height[left] = 3, height[right] = 5
- height[left] <= height[right] (3 <= 5), check the left side.
- height[left] (3) <= leftMax (4) => water trapped at left = leftMax - height[left] = 4 - 3 = 1.
- Add 1 to totalWater (totalWater = 7).
- Move left pointer to 4. left = 4.
5. **Iteration 5:**

- height[left] = 2, height[right] = 5
- height[left] <= height[right] (2 <= 5), check the left side.
- height[left] (2) <= leftMax (4) => water trapped at left = leftMax - height[left] = 4 - 2 = 2.
- Add 2 to totalWater (totalWater = 9).
- Move left pointer to 5. left = 5.
6. **Iteration 6:**

- height[left] = 5, height[right] = 5
- height[left] > height[right] (5 > 5), so check the right side.
- height[right] (5) > rightMax (0), update rightMax = 5.
- Move right pointer to 4. right = 4.

Since left pointer (5) is now greater than right pointer (4), we exit the loop.

Result:
The total water trapped is 9 units.

Summary:
Total Water Trapped: 9 units