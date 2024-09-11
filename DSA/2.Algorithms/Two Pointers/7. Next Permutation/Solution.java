class Solution {
    public void reverseHelper(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public void nextPermutation(int[] nums) {
        int smallerIndex = -1;
        int size = nums.length;

        // Step 1: Find the first decreasing element from the end
        for (int i = size - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                smallerIndex = i;
                break;
            }
        }

        // Step 2: If no such element is found, reverse the entire array
        if (smallerIndex == -1) {
            reverseHelper(nums, 0, size - 1);
            return;
        }

        // Step 3: Find the element just larger than nums[smallerIndex]
        for (int i = size - 1; i > smallerIndex; i--) {
            if (nums[i] > nums[smallerIndex]) {
                // Step 4: Swap the elements
                int temp = nums[smallerIndex];
                nums[smallerIndex] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        // Step 5: Reverse the elements after smallerIndex
        reverseHelper(nums, smallerIndex + 1, size - 1);
    }
}
