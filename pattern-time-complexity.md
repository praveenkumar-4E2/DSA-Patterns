Here's a structured list of **Competitive Programming Patterns** ordered by their typical **input size limits** to help identify the best approach during a contest. 🚀  

---

## **1. Brute Force**  
- **Time Complexity**: \(O(n!)\), \(O(2^n)\), \(O(n^k)\)  
- **Identifiable When**: \(n \leq 20\)  
- **Example**: Generating all subsets, permutations, backtracking problems.  

---

## **2. Recursion & Backtracking**  
- **Time Complexity**: \(O(2^n)\) (exponential)  
- **Identifiable When**: \(n \leq 20\)  
- **Example**: N-Queens, Subset generation.  

---

## **3. Bit Manipulation**  
- **Time Complexity**: \(O(\log n)\), \(O(2^n)\) for bitmasking  
- **Identifiable When**: \(n \leq 20\) for bitmasking, \(n\) can be large for simple bitwise ops.  
- **Example**: Counting set bits, XOR operations, bitmask DP.  

---

## **4. Dynamic Programming (DP)**  
- **Time Complexity**:  
  - **1D DP**: \(O(n)\), when \(n \leq 10^6\)  
  - **2D DP**: \(O(n^2)\), when \(n \leq 1000\)  
  - **Knapsack-like DP**: \(O(n \cdot W)\), when \(n, W \leq 1000\)  
- **Identifiable When**: \(n \leq 10^6\) for 1D DP, \(n \leq 1000\) for 2D DP.  
- **Example**: Fibonacci, LCS, Knapsack.  

---

## **5. Sliding Window & Two Pointers**  
- **Time Complexity**: \(O(n)\)  
- **Identifiable When**: \(n \leq 10^6\)  
- **Example**: Longest substring without repeating characters, two-sum in sorted array.  

---

## **6. Greedy Algorithm**  
- **Time Complexity**: \(O(n)\) or \(O(n \log n)\) (if sorting is required)  
- **Identifiable When**: \(n \leq 10^6\) (or \(10^5\) if sorting is required)  
- **Example**: Activity selection, Huffman encoding.  

---

## **7. Binary Search**  
- **Time Complexity**: \(O(\log n)\)  
- **Identifiable When**: \(n \leq 10^{18}\) (Binary Search works even for large values)  
- **Example**: Searching in a sorted array, finding square roots.  

---

## **8. Prefix Sum & Difference Array**  
- **Time Complexity**:  
  - **Preprocessing**: \(O(n)\)  
  - **Query**: \(O(1)\)  
- **Identifiable When**: \(n \leq 10^6\)  
- **Example**: Range sum queries, difference arrays for fast updates.  

---

## **9. Graph Algorithms**  
- **Complexity Based on Algorithm**:  
  - **DFS / BFS**: \(O(V + E)\), works for \(n \leq 10^5\)  
  - **Dijkstra (Heap-based)**: \(O((V + E) \log V)\), works for \(n \leq 10^5\)  
  - **Bellman-Ford**: \(O(VE)\), works for \(n \leq 5000\)  
  - **Floyd-Warshall**: \(O(n^3)\), works for \(n \leq 300\)  
  - **Kruskal’s / Prim’s**: \(O(E \log E)\), works for \(n \leq 10^5\)  

---

## **10. Tree Algorithms**  
- **Complexity**:  
  - **DFS on Tree**: \(O(n)\), \(n \leq 10^5\)  
  - **Lowest Common Ancestor (LCA)**: \(O(\log n)\), \(n \leq 10^5\)  
  - **Segment Tree**:  
    - **Build**: \(O(n)\)  
    - **Query**: \(O(\log n)\)  
    - **Update**: \(O(\log n)\)  
    - \(n \leq 10^6\)  

---

## **11. Heap & Priority Queue**  
- **Time Complexity**:  
  - **Insert/Delete**: \(O(\log n)\)  
  - **Extract Min/Max**: \(O(\log n)\)  
  - **Heapify**: \(O(n)\)  
- **Identifiable When**: \(n \leq 10^6\)  
- **Example**: Top-k elements, Dijkstra’s shortest path.  

---

## **12. Trie (Prefix Tree)**  
- **Time Complexity**:  
  - **Insert/Search/Delete**: \(O(m)\) (where \(m\) is word length)  
- **Identifiable When**: \(n \leq 10^5\), \(m \leq 100\)  
- **Example**: Auto-complete, dictionary lookups.  

---

## **13. Union-Find (Disjoint Set)**  
- **Time Complexity**:  
  - **Find with Path Compression**: \(O(\alpha(n))\) (almost \(O(1)\))  
  - **Union by Rank**: \(O(\alpha(n))\) (almost \(O(1)\))  
  - **Overall amortized**: \(O(1)\)  
- **Identifiable When**: \(n \leq 10^6\)  
- **Example**: Connected components in graphs, Kruskal’s MST.  

---

## **14. Matrix Exponentiation**  
- **Time Complexity**: \(O(\log n)\)  
- **Identifiable When**: \(n \leq 10^{18}\)  
- **Example**: Fibonacci in \(O(\log n)\).  

---

## **15. Number Theory**  
| **Algorithm**           | **Time Complexity** | **Identifiable When** |
|------------------------|--------------------|----------------------|
| **GCD (Euclidean Algorithm)** | \(O(\log n)\) | \(n \leq 10^{18}\) |
| **Sieve of Eratosthenes** | \(O(n \log \log n)\) | \(n \leq 10^7\) |
| **Modular Exponentiation** | \(O(\log n)\) | \(n \leq 10^{18}\) |
| **Chinese Remainder Theorem** | \(O(\log n)\) | \(n \leq 10^{18}\) |

---

## **How to Identify the Best Approach in a Contest?**  

| **Pattern**         | **Best for n ≤** |
|---------------------|----------------|
| **Brute Force** | \(20\) |
| **Backtracking** | \(20\) |
| **Bitmasking** | \(20\) |
| **2D DP** | \(1000\) |
| **Graph (Floyd-Warshall)** | \(300\) |
| **Graph (Bellman-Ford)** | \(5000\) |
| **Graph (Dijkstra / BFS / DFS)** | \(10^5\) |
| **Sorting (Merge/Quick Sort)** | \(10^6\) |
| **1D DP** | \(10^6\) |
| **Prefix Sum / Two Pointers** | \(10^6\) |
| **Segment Tree / Union-Find** | \(10^6\) |
| **Binary Search** | \(10^{18}\) |
| **Modular Exponentiation** | \(10^{18}\) |

Now, you can **quickly decide which approach to use** based on the **input size limit**! 🚀




---










## 📝 **How to Identify Problem Types in a Contest?**  

During a contest, quickly identifying the problem type **based on constraints** is key to choosing the right approach. Below is a **step-by-step guide** to recognizing patterns in problems and their best solutions.  

---

## **1️⃣ Check Input Constraints**  
- The most important clue to determine the **expected time complexity** and which approach to use.  

| **n (Input Size)** | **Max Operations Allowed (in 1 sec)** | **Suggested Approach** |
|------------------|--------------------------------|------------------|
| \(n \leq 10\) | \(10!\) or \(2^n\) (~3.6M) | Brute Force, Backtracking |
| \(n \leq 20\) | \(2^n\) (~1M) | Bitmasking, Recursion |
| \(n \leq 100\) | \(O(n^3)\) (~1M) | Floyd-Warshall, DP |
| \(n \leq 1000\) | \(O(n^2)\) (~1M) | 2D DP, Graphs (Adj. Matrix) |
| \(n \leq 10^5\) | \(O(n \log n)\) (~2M) | Sorting, Segment Tree, Graphs |
| \(n \leq 10^6\) | \(O(n)\) (~10M) | Prefix Sum, Greedy, DFS/BFS |
| \(n \leq 10^{18}\) | \(O(\log n)\) (~60) | Binary Search, Modular Exponentiation |

---

## **2️⃣ Identifying Problem Patterns**  

### **🔹 Brute Force / Backtracking**  
✅ **When to use?**  
- Small input size (\(n \leq 20\)).  
- The problem asks for **"all possible ways"**, **"generate all subsets/permutations"**, etc.  
- Example: **N-Queens, Traveling Salesman Problem**.  

### **🔹 Dynamic Programming (DP)**  
✅ **When to use?**  
- \(n \leq 10^6\) (1D DP), \(n \leq 1000\) (2D DP).  
- Problem has **overlapping subproblems** (e.g., Fibonacci).  
- Problem asks for **"minimum/maximum ways"** to do something.  
- Example: **Knapsack, LCS, LIS, Coin Change**.  

### **🔹 Greedy Algorithm**  
✅ **When to use?**  
- The problem can be **solved step-by-step optimally**.  
- Problem asks for **minimum number of operations, maximum sum, shortest path, etc.**  
- **No "rollback" needed**, i.e., local optimum leads to the global optimum.  
- Example: **Activity Selection, Huffman Encoding**.  

### **🔹 Sliding Window / Two Pointers**  
✅ **When to use?**  
- Problem involves **subarrays/substrings**.  
- The problem asks for **maximum/minimum length, sum, or count** within a window.  
- Example: **Longest Substring Without Repeating Characters, Two-Sum (Sorted Array)**.  

### **🔹 Sorting + Binary Search**  
✅ **When to use?**  
- The problem asks for **maximum/minimum values** or **searching efficiently**.  
- If \(n \leq 10^5\), sorting is feasible \(O(n \log n)\).  
- Example: **Find the smallest/largest element satisfying a condition, Aggressive Cows (Binary Search on Answer)**.  

### **🔹 Graph Algorithms**  
✅ **When to use?**  
- The problem involves **"paths", "networks", "cities", "connections"**.  
- If \(n \leq 1000\) → Use **Adjacency Matrix**.  
- If \(n \leq 10^5\) → Use **Adjacency List**.  
- Example:  
  - **DFS/BFS** → **Connected Components, Shortest Path in Unweighted Graphs**.  
  - **Dijkstra** → **Shortest Path in Weighted Graph**.  
  - **Kruskal/Prim** → **Minimum Spanning Tree**.  

### **🔹 Union-Find (Disjoint Set)**  
✅ **When to use?**  
- The problem asks for **"connected components", "cycle detection", "grouping elements"**.  
- Works well when \(n \leq 10^6\) due to **amortized \(O(1)\) operations**.  
- Example: **Friend Circles, Kruskal’s MST**.  

### **🔹 Segment Tree / Fenwick Tree**  
✅ **When to use?**  
- The problem involves **range queries and updates** (sum, min, max, gcd, etc.).  
- **Better than brute force** when \(n \geq 10^5\).  
- Example: **Range Minimum Query, Range Sum Query with Updates**.  

### **🔹 Number Theory**  
✅ **When to use?**  
- The problem involves **gcd, lcm, modular arithmetic, primes**.  
- **Sieve of Eratosthenes** → **\(n \leq 10^7\)** (Prime numbers).  
- **GCD (Euclidean Algorithm)** → **\(O(\log n)\), works for large \(n\)**.  
- Example: **Finding LCM/GCD, Modular Inverse, Large Exponents using Modular Exponentiation**.  

---

## **3️⃣ Decision Table (Quick Guide)**
| **Keyword in Problem Statement** | **Pattern to Use** |
|----------------------------------|-------------------|
| **"Find all possible ways"** | Backtracking / Recursion |
| **"Maximize / Minimize"** | DP / Greedy |
| **"Subarray / Substring"** | Sliding Window / Two Pointers |
| **"Graph, Network, City, Road"** | DFS / BFS / Dijkstra |
| **"Connected components"** | Union-Find |
| **"Sort and Find"** | Sorting + Binary Search |
| **"Range Query + Updates"** | Segment Tree / Fenwick Tree |
| **"GCD, LCM, Modulo, Prime"** | Number Theory |
| **"Exponentiation with large numbers"** | Modular Exponentiation |
| **"Yes/No answer with constraints"** | Binary Search |
| **"Count paths, ways, subsets"** | DP / Bitmasking |

---

## **4️⃣ Step-by-Step Problem Solving Approach**
**1️⃣ Read the constraints carefully**  
- Identify the **input limits** to determine the **time complexity required**.  

**2️⃣ Recognize keywords in the problem statement**  
- Look for phrases like **"maximum", "minimum", "shortest", "longest", "number of ways"**, etc.  

**3️⃣ Choose the right approach**  
- Use the **Decision Table** above to match patterns.  

**4️⃣ Optimize if needed**  
- If **brute force is too slow**, look for **DP, Greedy, Binary Search** alternatives.  

---

## **5️⃣ Final Tips**
✅ **Sort first** if the problem involves **pairing elements** or **binary search**.  
✅ **Use prefix sums** for quick range sum calculations.  
✅ **Think greedy** when **sorting + decision-making** is involved.  
✅ **Always check constraints** to decide if brute force is feasible.  
✅ **Use modulo \(10^9+7\)** when dealing with large numbers in combinatorics.  

---

🔥 **Master these patterns and you'll dominate contests!** 🚀💪






---









## **🚀 Step-by-Step Order to Check a Problem in a Contest**  

When solving a problem in a contest, follow this structured approach to quickly **identify the pattern and optimize the solution**.  

---

## **🔹 Step 1: Read the Problem Statement Carefully**
- Read the entire problem **without rushing**.  
- Identify **what needs to be calculated** (sum, count, path, maximum, minimum, etc.).  
- Look for **keywords** like "shortest path", "subarray", "connected components", "ways to do something", etc.  

---

## **🔹 Step 2: Check the Constraints (Most Important!)**  
**Why?** The constraints **directly determine** the best algorithm to use.  

| **Max Input Size (n)** | **Max Operations Possible in 1s** | **Best Possible Complexity** | **Expected Approach** |
|----------------|----------------|------------------|--------------------------|
| \( n \leq 10 \) | \(10!\) (~3.6M) | \(O(n!)\), \(O(2^n)\) | Brute Force, Backtracking |
| \( n \leq 20 \) | \(2^n\) (~1M) | \(O(2^n)\) | Recursion, Bitmasking |
| \( n \leq 100 \) | \(10^6\) | \(O(n^3)\) | DP, Graphs (Floyd-Warshall) |
| \( n \leq 1000 \) | \(10^6\) | \(O(n^2)\) | DP, Graphs (Adj. Matrix) |
| \( n \leq 10^5 \) | \(10^7\) | \(O(n \log n)\) | Sorting, Segment Tree, Graphs |
| \( n \leq 10^6 \) | \(10^8\) | \(O(n)\) | Prefix Sum, Greedy, DFS/BFS |
| \( n \leq 10^{18} \) | \(10\) | \(O(\log n)\) | Binary Search, Modular Exponentiation |

💡 **Rule of Thumb:**  
- **\( n \leq 10 \)** → **Brute Force** is fine.  
- **\( n \leq 100 \)** → **DP or \(O(n^3)\) solutions** are okay.  
- **\( n \leq 10^5 \)** → **Sorting, Graphs, \(O(n \log n)\)** solutions are ideal.  
- **\( n \leq 10^6 \)** → **Linear algorithms \(O(n)\) are needed**.  
- **\( n \geq 10^{12} \)** → **Logarithmic solution \(O(\log n)\) is required**.  

---

## **🔹 Step 3: Identify the Problem Pattern**  
Use the **Decision Table** below to match the problem type:  

| **Keyword in Problem Statement** | **Pattern to Use** |
|----------------------------------|-------------------|
| **"Find all possible ways"** | Backtracking / Recursion |
| **"Maximize / Minimize"** | DP / Greedy |
| **"Subarray / Substring"** | Sliding Window / Two Pointers |
| **"Graph, Network, City, Road"** | DFS / BFS / Dijkstra |
| **"Connected components"** | Union-Find |
| **"Sort and Find"** | Sorting + Binary Search |
| **"Range Query + Updates"** | Segment Tree / Fenwick Tree |
| **"GCD, LCM, Modulo, Prime"** | Number Theory |
| **"Exponentiation with large numbers"** | Modular Exponentiation |
| **"Yes/No answer with constraints"** | Binary Search |
| **"Count paths, ways, subsets"** | DP / Bitmasking |

---

## **🔹 Step 4: Choose the Best Approach**
Follow this order to **optimize** the solution:  

1️⃣ **Can brute force work?**  
   - If **\( n \leq 10 \)**, brute force (backtracking) is fine.  
   - If too slow → **Try DP, Greedy, or Binary Search**.  

2️⃣ **Can sorting help?**  
   - Many problems become easy if sorted first **\(O(n \log n)\)**.  
   - Example: **Find k-th smallest element → Sort and take the k-th element.**  

3️⃣ **Is it a subarray/subset problem?**  
   - Try **Sliding Window, Two Pointers, or Bitmasking**.  

4️⃣ **Is it an optimization problem?**  
   - **"Maximize" or "Minimize"** → Try **Greedy or DP**.  

5️⃣ **Is it a graph problem?**  
   - **Find shortest path?** → **Dijkstra (Weighted)**, **BFS (Unweighted)**.  
   - **Find connectivity?** → **Union-Find (DSU)**.  
   - **Find cycles?** → **DFS or Union-Find**.  

6️⃣ **Does it involve range queries?**  
   - **Segment Tree or Fenwick Tree** is useful.  

7️⃣ **Does it involve number properties?**  
   - **GCD, LCM, Modular Exponentiation** techniques are useful.  

---

## **🔹 Step 5: Implement & Optimize**
### **🔥 If Brute Force is Too Slow:**
- Convert Recursion → **Memoization (Top-Down DP)**.  
- Use Iterative DP instead of Recursion.  
- Optimize loops using **Prefix Sums, HashMaps, or Two Pointers**.  
- Replace nested loops with **Binary Search or Sorting**.  

---

## **🔹 Step 6: Debugging & Edge Cases**
### ✅ **Before submitting, test with:**
- **Smallest inputs** (e.g., \( n=1 \)).  
- **Largest inputs** (to check time complexity).  
- **Edge cases** (negative numbers, duplicates, all equal elements, empty input).  
- **Special cases** (single element, sorted input, reverse-sorted input).  

---

## **🔹 Final Cheat Sheet**
1️⃣ **Check Constraints** (decides time complexity).  
2️⃣ **Identify the Problem Type** (match with Decision Table).  
3️⃣ **Choose the Best Algorithm** (Brute Force → DP → Greedy → Graphs).  
4️⃣ **Optimize if Needed** (Sorting, Prefix Sums, Binary Search, DSU).  
5️⃣ **Test Edge Cases** (smallest, largest, special cases).  

---

🔥 **Master this strategy and you'll solve problems faster in contests!** 🚀💡
