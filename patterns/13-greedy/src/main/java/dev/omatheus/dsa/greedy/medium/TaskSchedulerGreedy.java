package dev.omatheus.dsa.greedy.medium;

/**
 * <a href="https://leetcode.com/problems/task-scheduler/">621. Task Scheduler</a> (Medium)
 *
 * <p>Given tasks and cooldown n, return the least number of intervals to finish all tasks.</p>
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
 *   <li>1 <= tasks.length <= 10^4</li>
 *   <li>tasks[i] is an uppercase English letter</li>
 *   <li>0 <= n <= 100</li>
 * </ul>
 *
 * @see TaskSchedulerGreedyTest
 */
public class TaskSchedulerGreedy {

    /**
     * Returns the least number of intervals needed to finish all tasks.
     *
     * @param tasks the array of task labels
     * @param n     the cooldown period
     * @return the minimum intervals needed
     */
    public int leastInterval(char[] tasks, int n) {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
