package dev.omatheus.dsa.greedy.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskSchedulerGreedyTest {

    private final TaskSchedulerGreedy solution = new TaskSchedulerGreedy();

    @Test
    void basicCase() {
        assertEquals(8, solution.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2));
    }

    @Test
    void singleTask() {
        assertEquals(1, solution.leastInterval(new char[]{'A'}, 0));
    }

    @Test
    void noCooldown() {
        assertEquals(3, solution.leastInterval(new char[]{'A', 'B', 'C'}, 0));
    }

    @Test
    void allSame() {
        assertEquals(6, solution.leastInterval(new char[]{'A', 'A', 'A', 'A', 'A', 'A'}, 2));
    }

    @Test
    void alternating() {
        assertEquals(4, solution.leastInterval(new char[]{'A', 'B', 'A', 'B'}, 0));
    }

    @Test
    void complexSchedule() {
        assertEquals(10, solution.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B', 'C', 'C', 'C'}, 2));
    }
}
