import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array to handle duplicates and use two-pointer technique

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the fixed pointer
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;   // Pointer after the fixed pointer
            int right = nums.length - 1;  // Pointer at the end

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Add the triplet to the result list
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for the left and right pointers
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    // Move both pointers
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;  // Increase sum by moving the left pointer
                } else {
                    right--;  // Decrease sum by moving the right pointer
                }
            }
        }

        return result;
    }
}
