# DSA Java

Data Structures and Algorithms practice repository in **Java 25**, organized by **pattern-based approach** with Maven multi-module structure.

## Goal

Solve ~210 curated problems from **LeetCode** and **HackerRank**, grouped by the 15 core patterns that cover 90% of coding interviews.

## How to Use

Each module is a self-contained Maven project with:
- **README.md** - Pattern explanation, when to use, code template
- **Problem stubs** - Java classes with Javadoc (problem link + description)
- **Test suites** - Complete edge case coverage (tests fail until you solve them)

### Build & Test

```bash
# Build everything
mvn clean compile

# Run all tests (expect failures until you solve)
mvn clean test

# Run tests for a specific module
mvn clean test -pl patterns/01-two-pointers

# Run a specific test class
mvn clean test -pl patterns/01-two-pointers -Dtest=TwoSumTest
```

## Study Order

| # | Pattern | Module | Problems |
|---|---------|--------|----------|
| 1 | Two Pointers | [01-two-pointers](patterns/01-two-pointers) | 9 |
| 2 | Sliding Window | [02-sliding-window](patterns/02-sliding-window) | 8 |
| 3 | Prefix Sum | [03-prefix-sum](patterns/03-prefix-sum) | 5 |
| 4 | Hashing | [04-hashing](patterns/04-hashing) | 10 |
| 5 | Stacks | [05-stacks](patterns/05-stacks) | 9 |
| 6 | Linked Lists | [06-linked-lists](patterns/06-linked-lists) | 15 |
| 7 | Binary Search | [07-binary-search](patterns/07-binary-search) | 12 |
| 8 | Trees | [08-trees](patterns/08-trees) | 18 |
| 9 | Heaps | [09-heaps](patterns/09-heaps) | 10 |
| 10 | Graphs | [10-graphs](patterns/10-graphs) | 15 |
| 11 | Backtracking | [11-backtracking](patterns/11-backtracking) | 12 |
| 12 | Dynamic Programming | [12-dynamic-programming](patterns/12-dynamic-programming) | 23 |
| 13 | Greedy | [13-greedy](patterns/13-greedy) | 10 |
| 14 | Intervals | [14-intervals](patterns/14-intervals) | 6 |
| 15 | Tries | [15-tries](patterns/15-tries) | 4 |
| 16 | Bit Manipulation | [16-bit-manipulation](patterns/16-bit-manipulation) | 12 |
| 17 | Math | [17-math](patterns/17-math) | 8 |
| 18 | Union-Find | [18-union-find](patterns/18-union-find) | 4 |

## Problem Sources

| Platform | Count |
|----------|-------|
| LeetCode | ~185 |
| HackerRank | ~25 |

## Conventions

- Package: `dev.omatheus.dsa.<pattern>.<difficulty>`
- Difficulty subpackages: `easy/`, `medium/`, `hard/`
- Test classes: `<ProblemName>Test.java`
- All tests use JUnit 5 with `@Test` and `@ParameterizedTest` where applicable
