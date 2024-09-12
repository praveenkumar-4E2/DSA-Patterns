class Solution {
    public int maxArea(int[] height) {
        int left = 0; // Initialize left pointer at the start
        int right = height.length - 1; // Initialize right pointer at the end
        int totalWater = 0; // Variable to store the maximum water area

        // Loop until the two pointers meet
        while (left < right) {
            // Calculate the area between the lines at left and right
            int water = Math.min(height[left], height[right]) * (right - left);

            // Update the maximum area if the current area is larger
            totalWater = Math.max(totalWater, water);

            // Move the pointer corresponding to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return totalWater; // Return the maximum water area found
    }
}
