class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If the middle element is less than the next element,
            // then the peak must be in the right half.
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                // Otherwise, the peak is in the left half (including mid).
                right = mid;
            }
        }

        // left and right converge to the peak element
        return left; // or return right; both are valid since left == right at the end
    }
}
