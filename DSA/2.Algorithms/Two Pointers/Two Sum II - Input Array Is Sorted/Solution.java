class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int size = numbers.length;  
        int left = 0;               // Pointer starting from the left
        int right = size - 1;       // Pointer starting from the right

        // Iterate while left pointer is before or at the right pointer
        while (left <= right) {
            int sum = numbers[left] + numbers[right];  // Calculate sum of elements at left and right pointers

            // If sum equals the target, return the 1-based indices
            if (target == sum) return new int[]{left + 1, right + 1};
            
            // If sum is greater than target, move the right pointer to the left
            if (sum > target) right--;
            
            // If sum is less than target, move the left pointer to the right
            else left++;
        }

        // If no pair is found, return {-1, -1}
        return new int[]{-1, -1};
    }
}
