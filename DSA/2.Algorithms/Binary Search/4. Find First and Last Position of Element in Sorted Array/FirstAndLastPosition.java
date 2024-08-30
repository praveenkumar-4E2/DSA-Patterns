class Solution {
    public int[] searchRange(int[] nums, int target) {
        int right = lastPosition(nums, target);
        int left = firstPosition(nums, target);
        return new int[] { left, right };
    }

    public int lastPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Check if right is within bounds and nums[right] equals the target
        if (right >= 0 && nums[right] == target) {
            return right;
        }

        return -1; // Target not found
    }

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

        return -1; // Target not found
    }

}
