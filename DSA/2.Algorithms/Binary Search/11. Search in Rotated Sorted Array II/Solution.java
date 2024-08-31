class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return true; // Check if target is at mid

            // Handle the case where left, mid, and right are duplicates
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++; // Skip the duplicate on the left
                right--; // Skip the duplicate on the right
            }
            // Check if the left half is sorted
            else if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Target is in the left half
                } else {
                    left = mid + 1; // Target is in the right half
                }
            }
            // Right half must be sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // Target is in the right half
                } else {
                    right = mid - 1; // Target is in the left half
                }
            }
        }
        return false; // Target not found
    }
}
