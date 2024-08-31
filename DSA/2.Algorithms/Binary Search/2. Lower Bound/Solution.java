class Solution {
    public int lowerBound(int[] nums, int x) {
        int left = 0;
        int right = nums.length - 1;
        int ans = nums.length;  // Initialize to nums.length to handle cases where x is greater than all elements
        
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= x) {
                ans = mid;       // Update ans to mid, since nums[mid] is a valid candidate
                right = mid - 1; // Move the search to the left half to find a lower bound
            } else {
                left = mid + 1;  // Move the search to the right half
            }
        }

        return ans;  // Return the index of the lower bound
    }
}
