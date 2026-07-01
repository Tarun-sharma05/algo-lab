# Java Collections Reference

---

## ArrayList

**When to use:** Resizable array; O(1) access by index; prefer over arrays when size is unknown.

```java
import java.util.*;

List<Integer> list = new ArrayList<>();
list.add(10);                        // append
list.add(0, 5);                      // insert at index 0
list.get(1);                         // 10
list.set(0, 99);                     // replace at index 0
list.remove(Integer.valueOf(10));    // remove by value
list.remove(0);                      // remove by index
list.size();                         // count
list.contains(99);                   // true
list.indexOf(99);                    // 0
Collections.sort(list);              // sort ascending
Collections.sort(list, Collections.reverseOrder()); // descending
list.isEmpty();                      // false
list.clear();
```

---

## LinkedList (as List and Queue)

**When to use:** Frequent insert/delete at head or tail; also usable as a Deque.

```java
LinkedList<Integer> ll = new LinkedList<>();
ll.addFirst(1);   ll.addLast(2);
ll.removeFirst(); ll.removeLast();
ll.peekFirst();   ll.peekLast();
// Also works as List: ll.add(), ll.get(i), ll.remove(i)
```

---

## Stack (use ArrayDeque instead)

```java
// Legacy — avoid for new code
Stack<Integer> stack = new Stack<>();
stack.push(1); stack.pop(); stack.peek(); stack.isEmpty();

// Preferred modern alternative:
Deque<Integer> stack = new ArrayDeque<>();
stack.push(1); stack.pop(); stack.peek(); stack.isEmpty();
```

---

## ArrayDeque — as Stack and Queue

**When to use:** Stack or Queue operations; faster than Stack and LinkedList.

```java
Deque<Integer> deque = new ArrayDeque<>();

// As stack (LIFO)
deque.push(10);       // addFirst
deque.pop();          // removeFirst
deque.peek();         // peekFirst

// As queue (FIFO)
deque.offer(10);      // addLast
deque.poll();         // removeFirst
deque.peek();         // peekFirst
```

---

## PriorityQueue (Min Heap by default)

**When to use:** Always need the smallest (or largest) element quickly.

```java
// Min heap (default)
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
minHeap.offer(5); minHeap.offer(1); minHeap.offer(3);
minHeap.poll();   // 1 (smallest)
minHeap.peek();   // 3

// Max heap
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
maxHeap.offer(5); maxHeap.offer(1); maxHeap.offer(3);
maxHeap.poll();   // 5 (largest)

// Custom comparator — sort by second element of int[]
PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
```

---

## HashMap

**When to use:** Fast key-value lookup; keys are unordered.

```java
Map<String, Integer> map = new HashMap<>();
map.put("apple", 3);
map.get("apple");                  // 3
map.getOrDefault("banana", 0);     // 0
map.containsKey("apple");          // true
map.containsValue(3);              // true
map.remove("apple");
map.size();

// Iterate
for (Map.Entry<String, Integer> e : map.entrySet()) {
    System.out.println(e.getKey() + " -> " + e.getValue());
}
for (String key : map.keySet()) { }
for (int val : map.values()) { }

// Frequency count pattern
map.put(key, map.getOrDefault(key, 0) + 1);

// Java 8+ helpers
map.putIfAbsent("apple", 1);
map.merge("apple", 1, Integer::sum);
map.computeIfAbsent("list", k -> new ArrayList<>()).add(item);
```

---

## LinkedHashMap

**When to use:** Need insertion-order or access-order iteration (e.g., LRU Cache).

```java
Map<String, Integer> lhm = new LinkedHashMap<>();
// Access-order for LRU:
Map<String, Integer> lru = new LinkedHashMap<>(16, 0.75f, true);
```

---

## TreeMap

**When to use:** Need keys sorted (natural order or custom comparator); O(log n) operations.

```java
TreeMap<Integer, String> tm = new TreeMap<>();
tm.put(3, "c"); tm.put(1, "a"); tm.put(2, "b");
tm.firstKey();           // 1
tm.lastKey();            // 3
tm.floorKey(2);          // 2  (largest key <= 2)
tm.ceilingKey(2);        // 2  (smallest key >= 2)
tm.headMap(3);           // keys < 3
tm.tailMap(2);           // keys >= 2
```

---

## HashSet

**When to use:** Unique elements, O(1) add/contains/remove; unordered.

```java
Set<Integer> set = new HashSet<>();
set.add(1); set.add(2); set.add(1); // {1, 2}
set.contains(1);    // true
set.remove(1);
set.size();         // 1

// Remove duplicates from a list
List<Integer> unique = new ArrayList<>(new HashSet<>(list));
```

---

## LinkedHashSet

**When to use:** Unique elements + insertion order matters.

```java
Set<String> lhs = new LinkedHashSet<>();
lhs.add("b"); lhs.add("a"); lhs.add("c");
// Iteration order: b, a, c
```

---

## TreeSet

**When to use:** Unique elements in sorted order; O(log n) operations.

```java
TreeSet<Integer> ts = new TreeSet<>();
ts.add(5); ts.add(1); ts.add(3);
ts.first();        // 1
ts.last();         // 5
ts.floor(4);       // 3  (largest element <= 4)
ts.ceiling(4);     // 5  (smallest element >= 4)
ts.higher(3);      // 5  (strictly greater than 3)
ts.lower(3);       // 1  (strictly less than 3)
ts.headSet(4);     // {1, 3}
ts.tailSet(3);     // {3, 5}
```

---

## Which Collection for Which DSA Scenario?

| Scenario | Use |
|----------|-----|
| Store elements, access by index | `ArrayList` |
| Frequent insert/delete at both ends | `ArrayDeque` or `LinkedList` |
| LIFO stack | `ArrayDeque` (push/pop/peek) |
| FIFO queue | `ArrayDeque` (offer/poll/peek) |
| Always get min/max efficiently | `PriorityQueue` |
| Key-value with fast lookup | `HashMap` |
| Key-value with sorted keys | `TreeMap` |
| Key-value in insertion order | `LinkedHashMap` |
| Unique elements, fast lookup | `HashSet` |
| Unique sorted elements | `TreeSet` |
| Sliding window max/min | `ArrayDeque` (monotonic deque) |
| Top K elements | `PriorityQueue` of size K |
| LRU Cache | `LinkedHashMap` (access-order) |
| Frequency count | `HashMap<T, Integer>` |
| Group elements by key | `HashMap<K, List<V>>` |
