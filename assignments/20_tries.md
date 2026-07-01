# Tries — Assignment

> Source: Kunal Kushwaha Java + DSA Bootcamp + additional problems
> Files go in: src/20_tries/
> Rule: solve on onlinegdb.com first, then copy to .java file here and commit.

## Concepts to learn first
- Trie node structure: children (array of 26 or HashMap<Character, TrieNode>) + isEndOfWord flag
- Insert: O(L) where L is word length
- Search: O(L)
- startsWith: O(L)
- Space vs HashMap: trie is faster for prefix queries but uses more memory for sparse alphabets

## Problems

### Easy
- [ ] Implement Trie from scratch — insert, search, startsWith
- [ ] Count words with a given prefix
- [ ] Longest common prefix using a trie

### Medium
- [ ] Word Search II — find all words from a list in a 2D board (Trie + backtracking)
- [ ] Autocomplete system — return top 3 suggestions for a prefix
- [ ] Replace words with shortest root in a sentence

### Hard / Advanced
- [ ] Design a data structure that supports insert and search with wildcards (`.` matches any letter)

## LeetCode practice (after above)
- [ ] #208 — Implement Trie (Prefix Tree)
- [ ] #211 — Design Add and Search Words Data Structure
- [ ] #212 — Word Search II
- [ ] #648 — Replace Words
