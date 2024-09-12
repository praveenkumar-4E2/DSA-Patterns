class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftMax = 0; // Maximum height on the left
        int rightMax = 0; // Maximum height on the right
        int left = 0; // Left pointer
        int right = n - 1; // Right pointer
        int totalWater = 0; // Total water trapped

        // Use two-pointer approach
        while (left < right) {
            // If the left height is less than or equal to the right height
            if (height[left] <= height[right]) {
                if (height[left] > leftMax) {
                    leftMax = height[left]; // Update leftMax if current height is greater
                } else {
                    totalWater += leftMax - height[left]; // Add trapped water
                }
                left++; // Move left pointer inward
            } else {
                if (height[right] > rightMax) {
                    rightMax = height[right]; // Update rightMax if current height is greater
                } else {
                    totalWater += rightMax - height[right]; // Add trapped water
                }
                right--; // Move right pointer inward
            }
        }

        return totalWater; // Return the total amount of trapped water
    }
}
