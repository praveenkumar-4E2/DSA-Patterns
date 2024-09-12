# [11. Container With Most Water](https://leetcode.com/problems/container-with-most-water/description/)

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

 

**Example 1:**
```

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
```
**Example 2:**
```
Input: height = [1,1]
Output: 1
 
```
**Constraints:**

- ```n == height.length```
-  ```2 <= n <= 105```
- ```0 <= height[i] <= 104 ```


--- 


# Approach:
1. Start with two pointers: one at the beginning (left) and the other at the end (right) of the height array.
2. At each step, calculate the area formed by the lines at the left and right pointers and the distance between them.
3. Move the pointer pointing to the shorter height because moving the taller one won't increase the area (the area is limited by the shorter line).
4. Keep track of the maximum area encountered during the process.
5. Repeat this until the two pointers meet, ensuring you've explored all possible containers.

# Time and Space Complexity:
- **Time Complexity:** O(n) where n is the length of the array, as each pointer moves at most n steps.
- **Space Complexity:** O(1) since no extra space is used beyond a few variables.



*** 


# Let's walk through the execution of the maxArea function using the input height = [1,8,6,2,5,4,8,3,7] step-by-step.


**Initial Setup:**
- height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
- left = 0 (first index)
- right = 8 (last index)
- totalWater = 0 (initial max area)

**Step-by-Step Execution:**

1. **Iteration 1:**

    - height[left] = 1, height[right] = 7
    - Area = min(1, 7) * (8 - 0) = 1 * 8 = 8
    - totalWater = max(0, 8) = 8
    - Since height[left] < height[right], move the left pointer to 1 (left = 1).
2. **Iteration 2:**

    - height[left] = 8, height[right] = 7
    - Area = min(8, 7) * (8 - 1) = 7 * 7 = 49
    - totalWater = max(8, 49) = 49
    - Since height[left] > height[right], move the right pointer to 7 (right = 7).

3. **Iteration 3:**

    - height[left] = 8, height[right] = 3
    - Area = min(8, 3) * (7 - 1) = 3 * 6 = 18
    - totalWater remains 49 (since 18 is smaller than 49)
    - Move right pointer to 6 (right = 6).

4. **Iteration 4:**

    - height[left] = 8, height[right] = 8
    - Area = min(8, 8) * (6 - 1) = 8 * 5 = 40
    - totalWater remains 49 (since 40 is smaller than 49)
    - Move right pointer to 5 (right = 5).

5. **Iteration 5:**

    - height[left] = 8, height[right] = 4
    - Area = min(8, 4) * (5 - 1) = 4 * 4 = 16
    - totalWater remains 49
    - Move right pointer to 4 (right = 4).

6. **Iteration 6:**

    - height[left] = 8, height[right] = 5
    - Area = min(8, 5) * (4 - 1) = 5 * 3 = 15
    - totalWater remains 49
    - Move right pointer to 3 (right = 3).

7. **Iteration 7:**

    - height[left] = 8, height[right] = 2
    - Area = min(8, 2) * (3 - 1) = 2 * 2 = 4
    - totalWater remains 49
    - Move right pointer to 2 (right = 2).

8. **Iteration 8:**

    - height[left] = 8, height[right] = 6
    - Area = min(8, 6) * (2 - 1) = 6 * 1 = 6
    - totalWater remains 49
    - Move right pointer to 1 (right = 1).

Now, left is no longer less than right, so the loop ends.

# Final Result:
- Total Water (Maximum Area) = 49

The function correctly calculates the maximum area of water trapped as 49 units for the input height = [1,8,6,2,5,4,8,3,7].







