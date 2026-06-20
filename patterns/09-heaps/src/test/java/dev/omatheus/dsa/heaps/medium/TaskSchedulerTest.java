package dev.omatheus.dsa.heaps.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskSchedulerTest {

    private final TaskScheduler solution = new TaskScheduler();

    @Test
    void basicCase() {
        assertEquals(8, solution.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2));
    }

    @Test
    void singleTask() {
        assertEquals(1, solution.leastInterval(new char[]{'A'}, 2));
    }

    @Test
    void noCooldown() {
        assertEquals(6, solution.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 0));
    }

    @Test
    void allSame() {
        assertEquals(5, solution.leastInterval(new char[]{'A', 'A', 'A', 'A', 'A'}, 2));
    }

    @Test
    void alternating() {
        assertEquals(4, solution.leastInterval(new char[]{'A', 'B', 'A', 'B'}, 2));
    }

    @Test
    void complexSchedule() {
        assertEquals(6, solution.leastInterval(new char[]{'A', 'A', 'B', 'B', 'C'}, 2));
    }

    @Test
    void twoTaskTypes() {
        assertEquals(4, solution.leastInterval(new char[]{'A', 'B', 'A', 'B'}, 1));
    }
}
