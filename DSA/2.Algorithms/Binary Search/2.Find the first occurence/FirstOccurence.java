class Solution {
    public int firstPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1; 

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // Check if left is within bounds and if the target is at left position
        if (left < nums.length && nums[left] == target) {
            return left;
        }
        return -1;  // Target not found
    }

}
