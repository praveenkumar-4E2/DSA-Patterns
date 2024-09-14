class Solution {
    // Helper function to swap two elements in the array
    public void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    // Helper function to reverse elements in the array from index 'left' to 'right'
    public void reverseHelper(char[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    public int nextGreaterElement(int n) {
        // Step 1: Convert the number to a character array to work with individual
        // digits
        char[] arr = ("" + n).toCharArray();
        int size = arr.length;
        int index = -1;

        // Step 2: Find the first decreasing element from the right
        // We need to find the first digit that breaks the descending order from right
        // to left
        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        // Step 3: If no such element is found, that means the digits are in descending
        // order
        // Return -1 because no greater permutation exists
        if (index == -1)
            return -1;

        // Step 4: Find the smallest digit larger than arr[index] to the right of index
        // This is the smallest number we can swap to form a larger number
        for (int i = size - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                swap(arr, index, i);
                break;
            }
        }

        // Step 5: Reverse the digits after 'index' to get the smallest possible
        // arrangement
        reverseHelper(arr, index + 1, size - 1);

        // Step 6: Convert the character array back to a long and handle overflow
        long result = Long.parseLong(new String(arr));
        return (result > Integer.MAX_VALUE) ? -1 : (int) result;
    }
}
