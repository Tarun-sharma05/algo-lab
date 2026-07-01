# Time Complexity Cheatsheet

## Big-O Quick Reference

| Notation | Name | Example |
|----------|------|---------|
| O(1) | Constant | Array access by index, HashMap get/put |
| O(log n) | Logarithmic | Binary search, balanced BST operations |
| O(n) | Linear | Linear search, single-pass traversal |
| O(n log n) | Linearithmic | Merge sort, heap sort, quick sort (avg) |
| O(n²) | Quadratic | Bubble/selection/insertion sort, nested loops |
| O(2ⁿ) | Exponential | Naive recursive Fibonacci, all subsets |
| O(n!) | Factorial | All permutations |

---

## Data Structure Operations

| Data Structure | Access | Search | Insert | Delete | Space |
|----------------|--------|--------|--------|--------|-------|
| Array | O(1) | O(n) | O(n) | O(n) | O(n) |
| ArrayList | O(1) | O(n) | O(1) amort. | O(n) | O(n) |
| LinkedList (singly) | O(n) | O(n) | O(1) at head | O(1) with ref | O(n) |
| Stack (ArrayDeque) | O(n) | O(n) | O(1) | O(1) | O(n) |
| Queue (ArrayDeque) | O(n) | O(n) | O(1) | O(1) | O(n) |
| HashMap | N/A | O(1) avg | O(1) avg | O(1) avg | O(n) |
| HashSet | N/A | O(1) avg | O(1) avg | O(1) avg | O(n) |
| Binary Tree | O(n) | O(n) | O(n) | O(n) | O(n) |
| BST (balanced) | O(log n) | O(log n) | O(log n) | O(log n) | O(n) |
| Heap (PriorityQueue) | O(1) peek | O(n) | O(log n) | O(log n) | O(n) |
| Trie | O(L) | O(L) | O(L) | O(L) | O(n·L) |

> L = length of the key/word

---

## Sorting Algorithms

| Algorithm | Best | Average | Worst | Space | Stable? |
|-----------|------|---------|-------|-------|---------|
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) | Yes |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) | No |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) | Yes |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) | Yes |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n) | No |
| Heap Sort | O(n log n) | O(n log n) | O(n log n) | O(1) | No |
| Count Sort | O(n+k) | O(n+k) | O(n+k) | O(k) | Yes |

> k = range of input values (Count Sort requires integer keys in a known range)

---

## When to Use Which Sort

| Situation | Use |
|-----------|-----|
| General-purpose, large data | Quick Sort (avg best constant factors) |
| Need guaranteed O(n log n) | Merge Sort |
| Nearly sorted input | Insertion Sort |
| Sorting a linked list | Merge Sort (no random access needed) |
| Limited integer range | Count Sort |
| Memory is tight | Heap Sort |
| Need stability | Merge Sort or Insertion Sort |
