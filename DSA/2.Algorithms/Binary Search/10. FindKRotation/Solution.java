public class Solution {
    public static int findKRotation(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // Binary search to find the index of the smallest element
        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check which half is unsorted
            if (nums[mid] > nums[right]) {
                // If nums[mid] > nums[right], the smallest element is in the right half
                left = mid + 1;
            } else {
                // Otherwise, the smallest element is in the left half (including mid)
                right = mid;
            }
        }

        // left will point to the smallest element which is the number of rotations
        return left;
    }
}
