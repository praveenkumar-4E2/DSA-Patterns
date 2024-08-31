class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // If the mid element is the target, return its index
            if (nums[mid] == target) return mid;

            // Determine if the left half is sorted
            if (nums[left] <= nums[mid]) {
                // Check if the target lies in the sorted left half
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;  // Move the right pointer to mid - 1
                } else {
                    left = mid + 1;   // Move the left pointer to mid + 1
                }
            } else {
                // The right half must be sorted
                // Check if the target lies in the sorted right half
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;   // Move the left pointer to mid + 1
                } else {
                    right = mid - 1;  // Move the right pointer to mid - 1
                }
            }
        }

        // If the target is not found, return -1
        return -1;
    }
}
