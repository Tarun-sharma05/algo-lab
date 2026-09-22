# DSA Repo Setup Specification
> Paste this file's contents into Claude CLI to set up the DSA repo structure.

---

## Context

I am setting up a DSA (Data Structures & Algorithms) learning repo in Java called "DSA".
This is a plain Java repo — no Android, no build tool required.
Each .java file runs standalone with a main() method.
Files can be run via: `javac FileName.java && java FileName`
OR by pasting into onlinegdb.com (online Java compiler).

My background: I am an Android developer (Kotlin/Compose) learning DSA in Java.
I have basic Java knowledge but am rusty after ~1 year gap.
Primary course I am following: Kunal Kushwaha's Java + DSA Bootcamp (free YouTube series).
I may also add content from other educators (Striver, Abdul Bari, etc.) later.

---

## Task

Set up the complete folder structure, README, assignment .md files,
and notes files for this DSA repo. Do not write Java solution files —
I will write those myself. Only create the structure and content files.

---

## 1. Folder Structure

Create this exact hierarchy with `.gitkeep` in each `src/` subfolder:

```
DSA/
├── README.md
├── src/
│   ├── 01_basics/
│   ├── 02_patterns/
│   ├── 03_arrays/
│   ├── 04_searching/
│   ├── 05_sorting/
│   ├── 06_strings/
│   ├── 07_recursion/
│   ├── 08_oop/
│   │   ├── classes_objects/
│   │   ├── constructors/
│   │   ├── keywords/
│   │   ├── inheritance/
│   │   ├── polymorphism/
│   │   ├── encapsulation/
│   │   ├── abstraction/
│   │   └── interfaces/
│   ├── 09_collections/
│   ├── 10_linked_list/
│   │   ├── singly/
│   │   ├── doubly/
│   │   └── circular/
│   ├── 11_stacks/
│   ├── 12_queues/
│   ├── 13_trees/
│   │   ├── binary_tree/
│   │   ├── bst/
│   │   └── avl/
│   ├── 14_heaps/
│   ├── 15_hashing/
│   ├── 16_graphs/
│   │   ├── representation/
│   │   ├── bfs/
│   │   ├── dfs/
│   │   └── shortest_path/
│   ├── 17_dynamic_programming/
│   │   ├── memoization/
│   │   └── tabulation/
│   ├── 18_greedy/
│   ├── 19_backtracking/
│   └── 20_tries/
├── assignments/
│   ├── 01_basics.md
│   ├── 02_patterns.md
│   ├── 03_arrays.md
│   ├── 04_searching.md
│   ├── 05_sorting.md
│   ├── 06_strings.md
│   ├── 07_recursion.md
│   ├── 08_oop.md
│   ├── 09_collections.md
│   ├── 10_linked_list.md
│   ├── 11_stacks.md
│   ├── 12_queues.md
│   ├── 13_trees.md
│   ├── 14_heaps.md
│   ├── 15_hashing.md
│   ├── 16_graphs.md
│   ├── 17_dynamic_programming.md
│   ├── 18_greedy.md
│   ├── 19_backtracking.md
│   └── 20_tries.md
└── notes/
    ├── time_complexity_cheatsheet.md
    ├── java_syntax_cheatsheet.md
    └── java_collections_reference.md
```

---

## 2. README.md

Create `README.md` with:
- Brief description: "Java DSA practice repo. One concept per file. Written from scratch."
- How to run: `javac src/topic/FileName.java && java FileName` OR use onlinegdb.com
- Progress checklist mirroring all 20 topics with `[ ]` checkboxes (Easy / Medium / Hard per topic)
- Commit format:
  ```
  feat(arrays): add two sum solution
  feat(oop): add inheritance example
  feat(sorting): add bubble sort
  fix(linkedlist): fix reverse logic
  docs(assignments): tick completed questions
  ```

---

## 3. Assignment .md Files

For each assignment file use this format:

```markdown
# [Topic Name] — Assignment

> Source: Kunal Kushwaha Java + DSA Bootcamp + additional problems
> Files go in: src/XX_topic/
> Rule: solve on onlinegdb.com first, then copy to .java file here and commit.

## Concepts to learn first
- [bullet list of concepts for this topic]

## Problems

### Easy
- [ ] Problem name — brief description

### Medium
- [ ] Problem name — brief description

### Hard / Advanced
- [ ] Problem name — brief description

## LeetCode practice (after above)
- [ ] #number — Problem name
```

### 01_basics.md
**Concepts:** variables, datatypes (int/long/double/char/boolean/String), type casting,
Scanner input, operators, if/else, switch, for/while/do-while, methods/functions

**Easy:** print hello world, swap two numbers without temp variable, check even/odd,
find max of 3 numbers, check leap year, reverse a number, check armstrong number,
print multiplication table

**Medium:** print all prime numbers up to N, find GCD (Euclidean algorithm),
check if number is palindrome, sum of digits, convert decimal to binary

---

### 02_patterns.md
**Concepts:** nested for loops, `System.out.print` vs `println`

**Easy:** right-angled triangle (stars), inverted triangle,
number triangle (1 / 1 2 / 1 2 3...), Floyd's triangle

**Medium:** pyramid, inverted pyramid, diamond, hollow square, hollow rectangle

**Hard:** butterfly pattern, zig-zag pattern, Pascal's triangle

---

### 03_arrays.md
**Concepts:** declaration, initialization, traversal, `Arrays.sort`, `Arrays.fill`,
multi-dimensional arrays, time complexity of operations

**Easy:** reverse without built-in, find max and min, find second largest,
check if sorted, count occurrences, move zeros to end

**Medium:** rotate by k positions, two sum (return indices), pairs with given sum,
find duplicate, merge two sorted arrays, find missing number in 1..N

**Hard:** Kadane's algorithm (max subarray sum), majority element, trapping rain water

**LeetCode:** #1 Two Sum, #26 Remove Duplicates, #283 Move Zeroes,
#53 Maximum Subarray, #217 Contains Duplicate

---

### 04_searching.md
**Concepts:** linear search, binary search (iterative + recursive),
binary search on answer concept

**Easy:** linear search (return index or -1), binary search on sorted array,
find first and last occurrence of element

**Medium:** search in rotated sorted array, find peak element,
find square root using binary search (integer part only),
find element in nearly sorted array

**LeetCode:** #704 Binary Search, #33 Search in Rotated Sorted Array,
#162 Find Peak Element, #69 Sqrt(x)

---

### 05_sorting.md
**Concepts:** stability, in-place, time and space complexity of each algorithm

**Easy:** bubble sort (write from scratch), selection sort (write from scratch),
insertion sort (write from scratch)

**Medium:** merge sort (divide and conquer), quick sort,
count sort (for limited integer range), Dutch national flag (sort 0s 1s 2s)

**Know verbally:** when to use which sort, why merge sort for linked lists,
why quick sort preferred in practice

**LeetCode:** #912 Sort an Array, #75 Sort Colors, #215 Kth Largest Element

---

### 06_strings.md
**Concepts:** String immutability, String pool, StringBuilder vs String,
charAt, length, substring, toCharArray, split, trim, compareTo, equals vs ==

**Easy:** reverse a string, check palindrome, count vowels and consonants,
remove duplicate characters, check if two strings are anagrams

**Medium:** reverse words in a sentence, find all permutations,
longest common prefix, compress a string (aaabbc → a3b2c1),
check if string is rotation of another

**LeetCode:** #344 Reverse String, #125 Valid Palindrome, #242 Valid Anagram,
#14 Longest Common Prefix, #151 Reverse Words in a String

---

### 07_recursion.md
**Concepts:** base case, recursive case, call stack, stack overflow,
recursion vs iteration, tail recursion

**Easy:** factorial, fibonacci, sum of digits, power(x, n),
print 1 to N, print N to 1

**Medium:** check if array is sorted (recursion), reverse string using recursion,
binary search (recursive), flood fill, tower of Hanoi

**Hard (backtracking):** N-Queens, solve Sudoku, rat in a maze,
generate all subsets, generate all permutations

**LeetCode:** #50 Pow(x,n), #78 Subsets, #46 Permutations, #51 N-Queens

---

### 08_oop.md
**Concepts:** class, object, constructor (default/parameterized/copy),
this, super, static, final keywords, 4 pillars of OOP,
interface, abstract class, method overriding vs overloading,
instanceof, Object class (toString, equals, hashCode)

**Easy:** Student class (fields + constructor + getters/setters + toString),
BankAccount class (deposit/withdraw/balance), method overloading demo,
method overriding demo (parent + child)

**Medium:** Shape hierarchy (abstract Shape → Circle, Rectangle, Triangle with area() + perimeter()),
interface with multiple implementations,
explain: abstract class vs interface (when to use which),
implement Comparable for custom sorting

**Hard (design):** parking lot system, simple LinkedList using OOP,
Library management system (Book, Member, Library classes)

---

### 09_collections.md
**Concepts:** Collections Framework hierarchy, List/Set/Map/Queue interfaces,
ArrayList, LinkedList, Stack, ArrayDeque, PriorityQueue,
HashMap, LinkedHashMap, TreeMap, HashSet, TreeSet, Iterator

**Easy:** ArrayList CRUD (add/remove/get/size/contains/iterate),
HashMap CRUD (put/get/remove/containsKey/getOrDefault/entrySet),
HashSet to remove duplicates from list, Stack push/pop/peek, Queue offer/poll/peek

**Medium:** group anagrams (HashMap<String, List<String>>),
top K frequent elements (HashMap + PriorityQueue),
sliding window maximum (ArrayDeque monotonic),
sort a Map by value

**LeetCode:** #146 LRU Cache, #347 Top K Frequent Elements,
#239 Sliding Window Maximum, #49 Group Anagrams

---

### 10_linked_list.md
**Concepts:** Node structure, head pointer, singly vs doubly vs circular,
time complexity vs arrays

**Easy (singly):** insert at beginning/end/position, delete by value/position,
traverse and print, find length, search for value

**Medium (singly):** reverse (iterative + recursive), find middle (slow/fast pointer),
detect cycle (Floyd's), remove nth node from end, merge two sorted lists

**Hard:** merge k sorted lists, reverse in groups of k,
find intersection of two lists, copy list with random pointer

**Doubly:** insert/delete, reverse traversal
**Circular:** insert/delete, detect end

**LeetCode:** #206 Reverse Linked List, #141 Linked List Cycle,
#21 Merge Two Sorted Lists, #19 Remove Nth From End,
#876 Middle of Linked List, #23 Merge K Sorted Lists

---

### 11_stacks.md
**Concepts:** LIFO, push/pop/peek/isEmpty, array-backed vs linked-list-backed,
monotonic stack

**Easy:** implement Stack using array (from scratch), using ArrayList, using LinkedList

**Medium:** valid parentheses / balanced brackets, next greater element,
evaluate postfix expression, min stack O(1), sort stack using recursion,
reverse string using stack

**LeetCode:** #20 Valid Parentheses, #155 Min Stack, #739 Daily Temperatures,
#84 Largest Rectangle in Histogram, #394 Decode String

---

### 12_queues.md
**Concepts:** FIFO, enqueue/dequeue/peek/isEmpty, circular queue,
deque (double-ended), priority queue (heap-backed)

**Easy:** implement Queue using array (circular),
implement Queue using two stacks, implement Stack using two queues

**Medium:** generate binary numbers 1 to N using queue,
first non-repeating character in stream, sliding window maximum (ArrayDeque),
BFS preview (use Queue)

**LeetCode:** #232 Implement Queue using Stacks, #225 Implement Stack using Queues,
#239 Sliding Window Maximum, #933 Number of Recent Calls

---

### 13_trees.md
**Concepts:** binary tree node structure, height/depth/level,
complete/full/perfect/balanced binary tree, BST property, traversals

**Binary Tree Easy:** insert, inorder/preorder/postorder (recursive),
level-order BFS (using Queue), height, count nodes, count leaf nodes

**Binary Tree Medium:** check if identical, diameter, check balanced,
lowest common ancestor, right side view, zigzag level order, serialize/deserialize

**BST:** search, insert, delete, validate BST,
kth smallest, sorted array to BST, inorder successor

**LeetCode:** #104 Maximum Depth, #226 Invert Binary Tree, #543 Diameter,
#102 Level Order Traversal, #98 Validate BST,
#235 LCA of BST, #110 Balanced Binary Tree

---

### 14_heaps.md
**Concepts:** min heap vs max heap, heap property, heapify,
PriorityQueue in Java (min heap default), custom comparator for max heap

**Easy:** implement min heap from scratch (array-based), PriorityQueue operations, heap sort

**Medium:** kth largest element, merge k sorted arrays,
top K frequent elements, find median from data stream

**LeetCode:** #215 Kth Largest Element, #347 Top K Frequent Elements,
#295 Find Median from Data Stream, #23 Merge K Sorted Lists

---

### 15_hashing.md
**Concepts:** hash function, collision handling (chaining vs open addressing),
Java HashMap internals, O(1) average time complexity

**Easy:** implement basic HashMap from scratch (array of lists),
two sum using hashing, find duplicates, first non-repeating character, word frequency count

**Medium:** longest consecutive sequence, subarray sum equals K,
4-sum problem, longest subarray with equal 0s and 1s, group shifted strings

**LeetCode:** #1 Two Sum, #128 Longest Consecutive Sequence,
#560 Subarray Sum Equals K, #49 Group Anagrams

---

### 16_graphs.md
**Concepts:** directed vs undirected, weighted vs unweighted,
adjacency matrix vs adjacency list, BFS, DFS, topological sort

**Easy:** represent graph as adjacency list, BFS traversal, DFS traversal (recursive + iterative),
count connected components, detect cycle in undirected graph

**Medium:** topological sort (Kahn's + DFS), detect cycle in directed graph,
shortest path BFS (unweighted), Dijkstra (weighted non-negative),
find all paths from source to target

**Hard:** Bellman-Ford, Floyd-Warshall, minimum spanning tree (Prim's / Kruskal's),
strongly connected components (Kosaraju's)

**LeetCode:** #200 Number of Islands, #133 Clone Graph,
#207 Course Schedule, #210 Course Schedule II, #743 Network Delay Time

---

### 17_dynamic_programming.md
**Concepts:** overlapping subproblems, optimal substructure,
memoization (top-down) vs tabulation (bottom-up), state definition

**Easy:** fibonacci (memoized + tabulated), climbing stairs, coin change (min coins), house robber

**Medium:** 0/1 knapsack, LCS (longest common subsequence),
LIS (longest increasing subsequence), edit distance,
matrix chain multiplication, subset sum

**Hard:** rod cutting, egg drop, word break, palindrome partitioning, burst balloons

**LeetCode:** #70 Climbing Stairs, #322 Coin Change, #198 House Robber,
#300 LIS, #1143 LCS, #72 Edit Distance, #416 Partition Equal Subset Sum

---

### 18_greedy.md
**Concepts:** greedy choice property, locally optimal = globally optimal,
when greedy works vs when DP needed

**Easy:** activity selection, fractional knapsack, minimum coins (standard denominations)

**Medium:** job scheduling with deadlines, Huffman encoding concept,
minimum platforms (interval scheduling), gas station problem

**LeetCode:** #455 Assign Cookies, #435 Non-overlapping Intervals,
#134 Gas Station, #45 Jump Game II, #630 Course Schedule III

---

### 19_backtracking.md
**Concepts:** decision tree, pruning, state space tree, recursion + undo step

**Easy:** all subsets, all permutations of string, all valid parentheses combinations

**Medium:** N-Queens (all solutions), solve Sudoku, rat in a maze,
word search in grid, letter combinations of phone number

**LeetCode:** #78 Subsets, #46 Permutations, #51 N-Queens,
#37 Sudoku Solver, #79 Word Search, #17 Letter Combinations

---

### 20_tries.md
**Concepts:** trie node structure (children array or HashMap),
insert, search, startsWith operations, time/space vs HashMap

**Easy:** implement Trie from scratch (insert + search + startsWith),
count words with given prefix, longest common prefix using trie

**Medium:** word search II (trie + backtracking), autocomplete system,
replace words with shortest root

**LeetCode:** #208 Implement Trie, #211 Design Add and Search Words,
#212 Word Search II, #648 Replace Words

---

## 4. Notes Files

### notes/time_complexity_cheatsheet.md
Create a table:
- Data Structure | Operation | Best | Average | Worst — cover Array, ArrayList, LinkedList,
  Stack, Queue, HashMap, HashSet, Binary Tree, BST (balanced), Heap, Trie
- Sorting algorithms complexity table (Bubble, Selection, Insertion, Merge, Quick, Heap, Count)
- Big-O quick reference: O(1), O(log n), O(n), O(n log n), O(n²), O(2ⁿ), O(n!) with examples

### notes/java_syntax_cheatsheet.md
DSA-relevant Java syntax quick reference:
- Primitive types and ranges (int: ±2³¹, long: ±2⁶³, etc.)
- Type casting examples (int↔char, int↔long, int↔double)
- String methods: charAt, substring, toCharArray, split, trim, compareTo, equals, contains, replace
- Math: Math.max, Math.min, Math.abs, Math.pow, Math.sqrt, Math.floor, Math.ceil
- Arrays: Arrays.sort, Arrays.fill, Arrays.copyOf, Arrays.copyOfRange, Arrays.toString
- Integer: Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.parseInt, Integer.toBinaryString, Integer.bitCount
- Character: Character.isDigit, Character.isLetter, Character.isUpperCase, Character.toLowerCase, (char)('a'+i)
- StringBuilder: append, insert, delete, deleteCharAt, reverse, charAt, toString, length

### notes/java_collections_reference.md
For each collection: when to use it, declaration syntax, key methods with one-line examples.
Cover: ArrayList, LinkedList (as List and Queue), Stack, ArrayDeque (as Stack and Queue),
PriorityQueue (min heap + max heap with comparator), HashMap, LinkedHashMap, TreeMap,
HashSet, LinkedHashSet, TreeSet.
End with a comparison table: "Which collection for which DSA scenario?"

---

## 5. After Creating All Files

1. Run: `git add .`
2. Commit: `chore: initialize DSA repo structure with assignments and notes`
3. Show the final folder tree to confirm everything is correct.

**Do not write any `.java` solution files. Only create structure, `.md` files, and `.gitkeep` placeholders.**
