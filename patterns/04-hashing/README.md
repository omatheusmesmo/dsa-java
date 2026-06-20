# Hashing Pattern

The Hashing pattern uses hash maps and sets for O(1) average-case lookups, enabling efficient solutions for problems involving frequency counting, grouping, and deduplication.

## Core Idea

Convert keys to array indices using a hash function, allowing constant-time insertions, deletions, and lookups. This transforms O(n²) nested loop solutions into O(n) solutions.

## Key Data Structures

### HashMap
- Store key-value pairs
- O(1) average lookup by key
- Use for: counting frequencies, mapping values to indices

### HashSet
- Store unique elements
- O(1) average membership test
- Use for: detecting duplicates, checking existence

## When to Use

- Frequency counting (how many times each element appears)
- Grouping elements by a property (anagrams, same differences)
- Two Sum pattern (complement lookup)
- Detecting duplicates
- Checking for existence
- Building character frequency maps

## Common Patterns

### Frequency Map
```java
Map<Character, Integer> freq = new HashMap<>();
for (char c : str.toCharArray()) {
    freq.merge(c, 1, Integer::sum);
}
```

### Anagram Grouping
```java
Map<String, List<String>> groups = new HashMap<>();
for (String s : strs) {
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    String key = new String(chars);
    groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
}
```

### Two Sum Pattern
```java
Map<Integer, Integer> map = new HashMap<>();
for (int i = 0; i < nums.length; i++) {
    int complement = target - nums[i];
    if (map.containsKey(complement)) {
        return new int[]{map.get(complement), i};
    }
    map.put(nums[i], i);
}
```

## Complexity Analysis

- Time: O(n) - single pass
- Space: O(n) - storing elements in hash structure
