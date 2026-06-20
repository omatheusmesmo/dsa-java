package dev.omatheus.dsa.heaps.medium;

/**
 * <a href="https://leetcode.com/problems/task-scheduler/">621. Task Scheduler</a> (Medium)
 *
 * <p>Given a char array representing tasks CPU need to do. It contains capital letters A-Z
 * representing different tasks. Each task could be done in one interval. For each interval,
 * CPU could finish one task or just be idle. However, there is a non-negative integer n that
 * represents a cooldown interval between two same tasks (same letter). That means there must
 * be at least n intervals between two same tasks. Return the least number of intervals the CPU
 * will take to finish all the given tasks.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Input: tasks = ["A","A","A","B","B","B"], n = 2
 * Output: 8
 * Explanation: A -> B -> idle -> A -> B -> idle -> A -> B
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>1 <= task.length <= 10^4</li>
 *   <li>tasks[i] is upper-case English letter</li>
 *   <li>The integer n is in the range [0, 100]</li>
 * </ul>
 *
 * @see TaskSchedulerTest
 */
public class TaskScheduler {

    /**
     * Returns the least number of intervals to finish all tasks.
     *
     * @param tasks array of task characters
     * @param n cooldown interval between same tasks
     * @return minimum number of intervals
     */
    public int leastInterval(char[] tasks, int n) {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
