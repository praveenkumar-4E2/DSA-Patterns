# List of all essential coding patterns



### 1. [**Sliding Window**](https://github.com/praveenkumar-4E2/DSA-Patterns/tree/master/DSA/2.Algorithms/Sliding%20Window)

### **2. Two Pointers**
### **3. Fast & Slow Pointers (Tortoise and Hare)**
### **4. Merge Intervals**
### **5. Cyclic Sort**
### **6. In-place Reversal of a Linked List**
### **7. Tree Traversals**
### **8. BFS/DFS for Graphs**
### **9. Backtracking**
### **10. Dynamic Programming (DP)**
### **11. Greedy Algorithm**
### **12. Topological Sort**
### **13. Binary Search**
### **14. Bit Manipulation**
### **15. Union-Find**
### **16. Knapsack Pattern**
### **17. Kadane’s Algorithm**
### **18. Monotonic Stacks/Queues**
### **19. Trie (Prefix Tree)**
### **20. Segment Tree**
### **21. Heap / Priority Queue**
### **22. Matrix Traversal**
### **23. Fast Exponentiation**
### **24. Fenwick Tree / Binary Indexed Tree (BIT)**
### **25. Disjoint Set**
### **26. Sieve of Eratosthenes**
### **27. Top-Down vs. Bottom-Up DP**
### **28. Palindromic Substrings**
### **29. Prefix Sum & Difference Array**
### **30. Minimum Spanning Tree (MST)**
### **31. Floyd-Warshall Algorithm**
### **32. Dijkstra’s Algorithm**
### **33. Bellman-Ford Algorithm**
### **34. Longest Common Subsequence (LCS)**
### **35. Divide and Conquer**
### **36. Reservoir Sampling**
### **37. Binary Indexed Tree (Fenwick Tree)**
### **38. Discrete Logarithm**
### **39. Mo’s Algorithm**
### **40. Probability & Combinatorics**

---
# **Coding Patterns Flowchart for Problem Solving**

This guide helps in identifying the appropriate coding pattern for solving various problems. Follow the steps below to match the problem with the correct approach.

---

## **1. Understand the Problem**
- **What is the problem asking for?**
  - Determine the core requirement: searching, sorting, counting, finding paths, etc.
  - **Consider Constraints**: Input size, time, and space limits.

## **2. Is the Problem Related to Arrays or Strings?**
- **Yes**:
  - **Is there a requirement to find subarrays or substrings?**
    - **Yes**: Consider **Sliding Window** or **Two Pointers**.
  - **Does the problem involve contiguous subarrays/substrings?**
    - **Yes**: Use **Kadane’s Algorithm**.
  - **Do you need to search or sort in a sorted array?**
    - **Yes**: Use **Binary Search**.
  - **Is there a need to find intervals or merge them?**
    - **Yes**: Use **Merge Intervals**.
  - **Are there specific conditions like duplicates, cyclic properties, or missing elements?**
    - **Yes**: Use **Cyclic Sort**.
- **No**: Proceed to the next step.

## **3. Is the Problem Related to Linked Lists?**
- **Yes**:
  - **Is the problem about reversing a linked list or part of it?**
    - **Yes**: Use **In-place Reversal of a Linked List**.
  - **Is there a need to find the middle element or detect a cycle?**
    - **Yes**: Use **Fast & Slow Pointers (Tortoise and Hare)**.
- **No**: Move to the next step.

## **4. Is the Problem Involving Trees or Graphs?**
- **Yes**:
  - **Is the problem about traversing the tree or graph?**
    - **Yes**: Use **Tree Traversal** or **BFS/DFS for Graphs**.
  - **Does the problem involve finding paths, cycles, or connectivity?**
    - **Yes**: Use **BFS/DFS for Graphs** or **Union-Find**.
  - **Is it about sorting vertices in a directed graph?**
    - **Yes**: Use **Topological Sort**.
  - **Do you need to optimize a path or network?**
    - **Yes**: Use **Dijkstra’s Algorithm** or **Bellman-Ford Algorithm**.
- **No**: Move to the next step.

## **5. Is the Problem About Searching, Sorting, or Optimization?**
- **Yes**:
  - **Does it involve optimizing resources like time, space, or profits?**
    - **Yes**: Use **Greedy Algorithm** or **Knapsack Pattern**.
  - **Is there a need for finding a minimum or maximum value efficiently?**
    - **Yes**: Use **Heap / Priority Queue**.
  - **Does the problem involve multiple overlapping options?**
    - **Yes**: Use **Dynamic Programming (DP)**.
- **No**: Move to the next step.

## **6. Is the Problem About Sequence, Permutations, or Combinations?**
- **Yes**:
  - **Does the problem require generating all possible combinations or permutations?**
    - **Yes**: Use **Backtracking**.
  - **Are there repetitive sequences or overlapping subproblems?**
    - **Yes**: Use **Dynamic Programming (DP)**.
- **No**: Move to the next step.

## **7. Is the Problem Dealing with Numbers or Mathematical Operations?**
- **Yes**:
  - **Does it involve bitwise operations or manipulation of binary digits?**
    - **Yes**: Use **Bit Manipulation**.
  - **Does it involve finding prime numbers or factors?**
    - **Yes**: Use **Sieve of Eratosthenes**.
  - **Does it involve modular arithmetic or exponentiation?**
    - **Yes**: Use **Fast Exponentiation**.
- **No**: Move to the next step.

## **8. Is the Problem Related to Ranges or Intervals in Arrays?**
- **Yes**:
  - **Does the problem require querying and updating ranges efficiently?**
    - **Yes**: Use **Segment Tree** or **Fenwick Tree (BIT)**.
  - **Are the queries dynamic, or do they involve frequent updates?**
    - **Yes**: Use **Segment Tree** or **Fenwick Tree**.
- **No**: Move to the next step.

## **9. Is the Problem About Probability, Combinatorics, or Cryptography?**
- **Yes**:
  - **Does it involve calculating probabilities or expected values?**
    - **Yes**: Use **Probability & Combinatorics**.
  - **Is there a need to handle random sampling or stream processing?**
    - **Yes**: Use **Reservoir Sampling**.
  - **Does it involve solving for discrete logarithms or modular arithmetic?**
    - **Yes**: Use **Discrete Logarithm**.
- **No**: Move to the next step.

## **10. Consider Other Advanced Patterns**
- **Are there unusual data structures like Trie or Disjoint Set?**
  - **Yes**: Use **Trie (Prefix Tree)** or **Disjoint Set**.
- **Is it a problem that requires a custom or less common pattern?**
  - **Yes**: Explore specialized techniques.

## **11. Final Step: Dynamic Programming (DP)**
- **If none of the above patterns fit**, consider breaking down the problem into smaller subproblems and applying **Dynamic Programming (DP)**.

---

Mastering these coding patterns will help you approach a wide range of problems efficiently during coding interviews. Each pattern represents a fundamental technique or algorithm that is widely applicable across different problem types.
