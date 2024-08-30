public class Solution {
    public int maxSumSubarrayOfSizeK(int[] nums, int k) {
        int maxSum = 0, windowSum = 0;

        // Calculate the sum of the first window of size k
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        // Initialize maxSum as the sum of the first window
        maxSum = windowSum;

        // Slide the window over the array
        for (int i = k; i < nums.length; i++) {
            // Subtract the element that is going out of the window and add the element that is coming into the window
            windowSum += nums[i] - nums[i - k];
            // Update the maxSum if the current windowSum is greater
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
