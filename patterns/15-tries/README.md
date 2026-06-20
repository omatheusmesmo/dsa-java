# Tries Pattern

A Trie (Prefix Tree) is a tree-based data structure for storing strings where each node represents a character. It enables efficient prefix-based operations.

## When to Use
- String prefix matching and autocomplete
- Dictionary/word lookup operations
- Word games (Boggle, Word Search)
- Any problem requiring fast prefix queries

## Key Concepts
1. **Insert**: Add words character by character, creating nodes as needed
2. **Search**: Traverse the tree following character edges
3. **Prefix check**: Verify if a path exists for the prefix
4. **Wildcards**: Use DFS/backtracking for patterns like '.'
5. **Trie + DFS**: Combine trie structure with board traversal for word search

## Trie Node Structure
```
class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEnd;
}
```

## Problems

### Medium
- [Implement Trie (Prefix Tree)](src/main/java/dev/omatheus/dsa/tries/medium/ImplementTrie.java)
- [Design Add and Search Words Data Structure](src/main/java/dev/omatheus/dsa/tries/medium/DesignAddAndSearchWords.java)
- [Word Search II](src/main/java/dev/omatheus/dsa/tries/medium/WordSearchII.java)
- [Contacts](src/main/java/dev/omatheus/dsa/tries/medium/ContactsHackerRank.java)
