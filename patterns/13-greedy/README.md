# Greedy Pattern

The Greedy pattern makes locally optimal choices at each step to find a global optimum. It works by selecting the best available option at each decision point without reconsidering past choices.

## When to Use
- Optimization problems (minimize/maximize something)
- Activity selection and interval scheduling
- Problems where a greedy choice property can be proven

## Key Insights
1. **Greedy Choice Property**: A global optimum can be arrived at by selecting a local optimum.
2. **Optimal Substructure**: An optimal solution to the problem contains optimal solutions to sub-problems.

## Common Techniques
- Sort by a key property, then iterate making greedy decisions
- Use priority queues for selecting best candidates
- Track maximum reach (e.g., jump game, gas station)
- Two-pass approaches (e.g., candy distribution)

## Problems

### Medium
- [Jump Game](src/main/java/dev/omatheus/dsa/greedy/medium/JumpGame.java)
- [Jump Game II](src/main/java/dev/omatheus/dsa/greedy/medium/JumpGameII.java)
- [Gas Station](src/main/java/dev/omatheus/dsa/greedy/medium/GasStation.java)
- [Hand of Straights](src/main/java/dev/omatheus/dsa/greedy/medium/HandOfStraights.java)
- [Partition Labels](src/main/java/dev/omatheus/dsa/greedy/medium/PartitionLabels.java)
- [Task Scheduler](src/main/java/dev/omatheus/dsa/greedy/medium/TaskSchedulerGreedy.java)

### Hard
- [Candy](src/main/java/dev/omatheus/dsa/greedy/hard/Candy.java)
