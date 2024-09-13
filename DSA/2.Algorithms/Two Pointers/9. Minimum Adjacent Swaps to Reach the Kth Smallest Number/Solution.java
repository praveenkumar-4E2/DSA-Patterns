class Solution {
    // Swaps the elements at indices 'left' and 'right' in the array 'arr'
    public void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    // Reverses the segment of the array 'arr' from index 'left' to 'right'
    public void reverseSegment(char[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    // Finds the next greater permutation of the array 'arr'
    public void findNextGreaterPermutation(char[] arr) {
        int size = arr.length;
        int index = -1;

        // Step 1: Find the first decreasing element from the right
        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        // If no such element is found, the array is the highest permutation
        if (index == -1) return;

        // Step 2: Find the smallest element greater than arr[index] to the right
        for (int i = size - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                swap(arr, index, i);
                break;
            }
        }

        // Step 3: Reverse the elements to the right of index to get the next permutation
        reverseSegment(arr, index + 1, size - 1);
    }

    // Calculates the minimum number of swaps needed to transform 'arr' into 'target'
    public int calculateMinSwaps(char[] arr, char[] target) {
        int size = arr.length;
        int swapCount = 0;

        // For each index in 'arr', find where the corresponding target element is
        for (int i = 0; i < size; i++) {
            if (arr[i] == target[i]) continue;

            // Find the position of target[i] in 'arr'
            int j = i;
            while (arr[j] != target[i]) {
                j++;
            }

            // Swap the found element to the correct position
            while (j > i) {
                swap(arr, j, j - 1);
                j--;
                swapCount++;
            }
        }

        return swapCount;
    }

    // Main method to find the minimum number of swaps required to achieve the k-th permutation
    public int getMinSwaps(String num, int k) {
        char[] target = num.toCharArray();

        // Generate the k-th greater permutation
        for (int i = 0; i < k; i++) {
            findNextGreaterPermutation(target);
        }

        char[] current = num.toCharArray();
        // Calculate the number of swaps needed to transform 'current' into 'target'
        return calculateMinSwaps(current, target);
    }
}
