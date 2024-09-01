# Sliding Window Technique
- A method to find subarrays or substrings in an array or string by maintaining a subset of elements as a window and adjusting this window's size or position to satisfy given conditions.

## Types of Sliding Windows
### 1 Fixed Window:

- **Window Size:** Remains constant throughout the process.
- **Usage:** Ideal for problems requiring analysis of subarrays or substrings of a specific size.
- **Example:** Finding the maximum sum of a subarray of size k.
### 2 Variable Window:

- **Window Size:** Changes dynamically as needed.
- **Usage:** Suitable for problems where the subarray length varies, depending on the conditions to be met.
- **Example:** Finding the smallest subarray with a sum greater than or equal to a given value.

## How to Identify When to Use the Sliding Window
- **Problem Involves Subarrays or Substrings:** The problem requires finding or analyzing contiguous elements in an array or string.

- **Fixed-Length Analysis:** If you need to evaluate all possible subarrays of a fixed size (e.g., max sum of k elements), consider a **Fixed Window**.

- **Variable-Length Subarray/Substring:** If the problem requires finding the smallest or longest subarray that satisfies a condition, a **Variable Window** is likely appropriate.

- **Optimization:** The brute-force solution involves nested loops that lead to inefficiency; Sliding Window can optimize this by reducing time complexity.

- **Real-Time Calculation:** Problems where the condition needs to be checked or recalculated as new elements are added or removed from the window are good candidates.

## Applications
- **Subarray/Subsequence Finding:** Identify subarrays or substrings that meet specific criteria, like maximum sum, specific patterns, or all unique elements.

- **Pattern Matching:** Search for patterns within strings, such as finding all anagrams of a string in another string.

- **Resource Optimization:** In scenarios like streaming data or time-series analysis, where processing efficiency is crucial.

## Connection to Dynamic Programming
- **Subset of Dynamic Programming:** Often seen as part of dynamic programming where problems are solved by dividing them into smaller overlapping subproblems.

- **Efficiency:** Enhances performance by reusing calculations within the window, preventing redundant processing.

## Use Cases
- Finding the longest substring with all unique characters using a variable window.
- Calculating the maximum sum of a subarray of fixed length using a fixed window.
- Detecting the smallest subarray whose sum exceeds a certain value using a variable window.
- Checking for repeated patterns or sequences in a data stream.

----
# Appraoches
## 1. Fixed-Size Sliding Window
1. Initialize a variable to store the result (e.g., a list or an array).
2. Set window_sum to 0 and window_start to 0.
3. Iterate through the array with a loop:
    - Add the current element to window_sum.
    - If the window size is equal to the required fixed size k:
        - Store the current window_sum in the result.
        - Subtract the element at window_start from window_sum.
        - Move window_start one step forward.
4. Return the result.

## 2. Variable-Size Sliding Window
1. Initialize window_sum to 0, window_start to 0, and min_length to a very large number (infinity).
2. Iterate through the array with a loop:
    - Add the current element to window_sum.
    - While window_sum meets or exceeds the target condition:
        - Update min_length to the smaller of its current value or the current window size.
        - Subtract the element at window_start from window_sum.
        - Move window_start one step forward.
3. Return min_length (or a suitable value if no valid subarray is found).

## 3. Dynamic Condition Sliding Window
1. Initialize window_start to 0 and a variable to store the result.
2. Iterate through the array with a loop:
    - Perform actions or checks based on a dynamic condition.
    - While the condition is met:
        - Process or record the current window’s result.
        - Move window_start one step forward.
3. Return the result.