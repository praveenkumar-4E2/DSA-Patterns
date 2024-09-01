# [findKRotation](https://www.naukri.com/code360/problems/rotation_7449070?utm_source=youtube&utm_medium=affiliate&utm_campaign=codestudio_Striver_BinarySeries&leftPanelTabValue=PROBLEM)

Problem statement
You are given an array 'arr' having 'n' distinct integers sorted in ascending order. The array is right rotated 'r' times


Find the minimum value of 'r'.


Right rotating an array means shifting the element at 'ith' index to (‘i+1') mod 'n' index, for all 'i' from 0 to ‘n-1'.



Example:
```
Input: 'n' = 5 , ‘arr’ = [3, 4, 5, 1, 2]

Output: 3 
```
Explanation:
If we rotate the array [1 ,2, 3, 4, 5] right '3' times then we will get the 'arr'. Thus 'r' = 3.


Detailed explanation ( Input/output format, Notes, Images )
```
Sample Input 1:
4
2 3 4 1


Sample Output 1:
3   
```

Explanation of sample output 1:
If we right rotate the array {1, 2, 3, 4} by '3' times then we will get {2, 3, 4, 1}. Thus 'r' = 3.
```

Sample Input 2:
3
1 2 3

Sample Output 2:
0
```

Explanation of sample output 2:
If we right rotate the array {1, 2, 3} by '0' time then we will get {1, 2, 3}. Thus 'r' = 0.


Expected time complexity:
Can you solve this in O(logn) time complexity?


Constraints:
- ```1 <= ‘n’ <= 10^5  ```  
- ```1 <= ‘arr[i]’ <= 10^9```
- Time Limit: 1 sec


# Approach
### 1. Initialize Pointers:

- Set left to 0 and right to the last index of the array.
### 2.Binary Search Loop:

- While left is less than right:
    - Compute mid as left + (right - left) / 2.
    - If nums[mid] is greater than nums[right], the smallest element (rotation point) is in the right half, so set left to mid + 1.
    - Otherwise, the smallest element is in the left half, including mid, so set right to mid.
### Return Result:

- After the loop ends, left will point to the index of the smallest element, which is the number of rotations.