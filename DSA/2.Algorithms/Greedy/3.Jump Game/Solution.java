class Solution {
    public boolean canJump(int[] nums) {
        int maxJump = nums[0]; // Initialize the maximum reachable index with the first element

        for (int index = 0; index < nums.length; index++) {
            // If the current index is beyond the maximum reachable index, return false
            if (index > maxJump) return false;
            
            // Update the maximum reachable index
            maxJump = Math.max(maxJump, index + nums[index]);
        }
        
        // If we finish the loop, we can reach the end of the array
        return true;
    }
}
