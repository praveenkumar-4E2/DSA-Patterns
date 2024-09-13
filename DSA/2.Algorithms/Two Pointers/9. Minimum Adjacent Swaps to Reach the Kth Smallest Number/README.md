
# [1850. Minimum Adjacent Swaps to Reach the Kth Smallest Number](https://leetcode.com/problems/minimum-adjacent-swaps-to-reach-the-kth-smallest-number/description/)


---

You are given a string num, representing a large integer, and an integer k.

We call some integer wonderful if it is a permutation of the digits in num and is greater in value than num. There can be many wonderful integers. However, we only care about the smallest-valued ones.

- For example, when num = "5489355142":
    - The 1st smallest wonderful integer is "5489355214".
    - The 2nd smallest wonderful integer is "5489355241".
    - The 3rd smallest wonderful integer is "5489355412".
    - The 4th smallest wonderful integer is "5489355421".

Return the minimum number of adjacent digit swaps that needs to be applied to num to reach the kth smallest wonderful integer.

The tests are generated in such a way that kth smallest wonderful integer exists.

 

Example 1:
```
Input: num = "5489355142", k = 4
Output: 2
Explanation: The 4th smallest wonderful number is "5489355421". To get this number:
- Swap index 7 with index 8: "5489355142" -> "5489355412"
- Swap index 8 with index 9: "5489355412" -> "5489355421"
```
Example 2:
```
Input: num = "11112", k = 4
Output: 4
Explanation: The 4th smallest wonderful number is "21111". To get this number:
- Swap index 3 with index 4: "11112" -> "11121"
- Swap index 2 with index 3: "11121" -> "11211"
- Swap index 1 with index 2: "11211" -> "12111"
- Swap index 0 with index 1: "12111" -> "21111"
```
Example 3:
```
Input: num = "00123", k = 1
Output: 1
Explanation: The 1st smallest wonderful number is "00132". To get this number:
- Swap index 3 with index 4: "00123" -> "00132"
 
```
**Constraints:**

- ```2 <= num.length <= 1000```
-  ```1 <= k <= 1000```
- num only consists of digits.


# Approach
Find next permutaion (Next Greater Element III) and then apply min swap 

# Logic for min swaps

```

private int CountSteps(int[] num, int[] target, int size) {
    int i = 0, j = 0;
    int count = 0;

    while (i < size) {
        j = i;

        // Find the index in num where target[i] is located
        while (num[j] != target[i]) {
            j += 1;
        }

        // Swap elements to move num[j] to the correct position
        while (i < j) {
            swap(num, j, j - 1);
            j -= 1;
            count++;
        }
        i++;
    }

    return count;
}

private void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}

```

# Example
- Starting Arrays:
    - num: {4, 1, 2, 3}
    -  target: {1, 2, 3, 4}
**Process**
1. Iteration 1 (i = 0):

    - Target Position: Place 1 at index 0.
    - Current Position of 1: Index 1.
    - Action: Swap 1 with 4.
    - Updated num: {1, 4, 2, 3}
    - Swaps Made: 1

2. Iteration 2 (i = 1):

    - Target Position: Place 2 at index 1.
    - Current Position of 2: Index 2.
    - Action: Swap 2 with 4.
    - Updated num: {1, 2, 4, 3}
    - Swaps Made: 2
3. Iteration 3 (i = 2):

    - Target Position: Place 3 at index 2.
    - Current Position of 3: Index 3.
    - Action: Swap 3 with 4.
    - Updated num: {1, 2, 3, 4}
    - Swaps Made: 3
4. Iteration 4 (i = 3):

    - Target Position: 4 is already at index 3.
    - Action: No swap needed.

**Final State**
- Final num: {1, 2, 3, 4}
- Total Swaps: 3