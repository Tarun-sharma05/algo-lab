# Graphs — Assignment

> Source: Kunal Kushwaha Java + DSA Bootcamp + additional problems
> Files go in: src/16_graphs/  (subfolders: representation, bfs, dfs, shortest_path)
> Rule: solve on onlinegdb.com first, then copy to .java file here and commit.

## Concepts to learn first
- Directed vs undirected graphs
- Weighted vs unweighted
- Adjacency matrix — O(V²) space
- Adjacency list — O(V + E) space (preferred)
- BFS — queue-based, level-by-level, shortest path in unweighted graphs
- DFS — stack/recursion-based, explore as deep as possible
- Topological sort — valid only for directed acyclic graphs (DAGs)

## Problems

### Easy
- [ ] Represent a graph as an adjacency list
- [ ] BFS traversal (print all nodes level by level)
- [ ] DFS traversal (recursive)
- [ ] DFS traversal (iterative using a stack)
- [ ] Count connected components in an undirected graph
- [ ] Detect cycle in an undirected graph (BFS/DFS)

### Medium
- [ ] Topological sort — Kahn's algorithm (BFS-based)
- [ ] Topological sort — DFS-based
- [ ] Detect cycle in a directed graph
- [ ] Shortest path in unweighted graph (BFS)
- [ ] Dijkstra's algorithm (weighted non-negative edges)
- [ ] Find all paths from source to target

### Hard / Advanced
- [ ] Bellman-Ford algorithm (handles negative weights)
- [ ] Floyd-Warshall (all-pairs shortest path)
- [ ] Minimum spanning tree — Prim's algorithm
- [ ] Minimum spanning tree — Kruskal's algorithm
- [ ] Strongly connected components — Kosaraju's algorithm

## LeetCode practice (after above)
- [ ] #200 — Number of Islands
- [ ] #133 — Clone Graph
- [ ] #207 — Course Schedule
- [ ] #210 — Course Schedule II
- [ ] #743 — Network Delay Time
