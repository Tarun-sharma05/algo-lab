# Hashing — Assignment

> Source: Kunal Kushwaha Java + DSA Bootcamp + additional problems
> Files go in: src/15_hashing/
> Rule: solve on onlinegdb.com first, then copy to .java file here and commit.

## Concepts to learn first
- Hash function: maps key → index
- Collision handling: chaining (linked list at each bucket) vs open addressing (linear probing)
- Java HashMap internals: array of buckets, load factor (0.75), resize/rehash
- Average O(1) for get/put/remove; worst case O(n) if all keys collide

## Problems

### Easy
- [ ] Implement basic HashMap from scratch — array of linked lists (chaining)
- [ ] Two Sum using hashing
- [ ] Find duplicates in an array using a HashSet
- [ ] First non-repeating character in a string
- [ ] Word frequency count

### Medium
- [ ] Longest consecutive sequence
- [ ] Subarray sum equals K (prefix sum + HashMap)
- [ ] 4-Sum problem
- [ ] Longest subarray with equal number of 0s and 1s
- [ ] Group shifted strings

### Hard / Advanced
- [ ] Consistent hashing (conceptual understanding)

## LeetCode practice (after above)
- [ ] #1 — Two Sum
- [ ] #128 — Longest Consecutive Sequence
- [ ] #560 — Subarray Sum Equals K
- [ ] #49 — Group Anagrams
