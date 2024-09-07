
# Steps to Identify a Greedy Algorithm Problem

### 1. Is the goal to calculate a maximum or minimum of something? (true/false)
- **Keywords :** max/min, shortest/longest, least/greatest etc.
- **Yes:** Proceed to the next steps (most greedy problems involve optimizing, either maximizing or minimizing a value).

- **No**: Not a greedy problem.
### 2. Does the problem follow a monotonic condition (i.e., an increasing or decreasing pattern)?

- **Yes:** Likely not a greedy algorithm problem. Monotonic conditions are more suited to problems like dynamic programming.
- **No:** Continue, as greedy algorithms usually work on non-monotonic problems.

### 3. Can the problem be split into subproblems?

- **Yes:** This is likely dynamic programming.
- **No:** Proceed to check for greedy applicability.

### 4. Can you make a local optimal choice at each step that leads to a global solution?

- **Yes:** The problem can likely be solved using a greedy algorithm.
- **No:** It's not a greedy problem; consider dynamic programming or another approach.


---


## 1. Greedy Choice (Local Optimization)
- **Concept:** Make a locally optimal choice at each step with the hope that it will lead to a globally optimal solution.
- **Example:**
    - Coin Change Problem (selecting the largest denomination at each step).
    - Activity Selection (choosing the next activity that finishes the earliest).

## 2. Fractional Greedy (Partial Selection)
- **Concept:** If you can take a fraction of an item, greedily choose the portion that maximizes the result.
- **Example:**
    - Fractional Knapsack Problem (take as much of an item as possible based on its value per weight ratio).
## 3. Greedy on Graphs (Graph Algorithms)
**Concept:** Greedily select the best choice in graph-related problems to optimize paths, networks, or spanning trees.
- **Example:**
    - Dijkstra's Algorithm (shortest path from a source vertex).
    - Prim's Algorithm (minimum spanning tree).
    - Kruskal's Algorithm (minimum spanning tree using edges).

## 4. Greedy by Sorting (Pre-sorting)
- **Concept:** Sort the input based on a specific criterion and make greedy choices based on this order.
- **Example:**
    - Job Sequencing with Deadlines (sort by profit and select jobs accordingly).
    - Huffman Coding (sort characters by frequency to build a minimum-cost prefix code).
## 5. Greedy Interval Scheduling (Task Selection)
- **Concept:** Select intervals (or tasks) based on start and finish times to maximize the number of tasks or minimize conflicts.
- **Example:**
    - Activity Selection Problem (choosing the maximum number of non-overlapping intervals).

## 6. Greedy Set Covering (Cover Problems)
- **Concept:** Select the most effective subset of elements that covers the largest portion of a universal set.
- **Example:**
    - Set Cover Problem (choosing sets that cover all elements with the minimum number of sets).
## 7. Greedy Scheduling (Minimizing Costs)
- **Concept:** Greedily minimize costs or time based on scheduling constraints.
- **Example:**
Job Scheduling Problem (assign jobs to minimize overall completion time or maximize profit).

## 8. Greedy Matching (Matching Problems)
- **Concept:** Greedily match elements in two sets based on some optimal criteria (e.g., value or cost).
- **Example:**
    - Maximum Bipartite Matching (matching nodes in bipartite graphs).