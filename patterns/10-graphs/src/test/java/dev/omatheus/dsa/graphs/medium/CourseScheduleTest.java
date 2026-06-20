package dev.omatheus.dsa.graphs.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleTest {

    private final CourseSchedule solution = new CourseSchedule();

    @Test
    void basicTrue() {
        assertTrue(solution.canFinish(2, new int[][]{{1, 0}}));
    }

    @Test
    void basicFalse() {
        assertFalse(solution.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }

    @Test
    void singleCourse() {
        assertTrue(solution.canFinish(1, new int[][]{}));
    }

    @Test
    void noPrerequisites() {
        assertTrue(solution.canFinish(5, new int[][]{}));
    }

    @Test
    void cycle() {
        assertFalse(solution.canFinish(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}));
    }

    @Test
    void longChain() {
        assertTrue(solution.canFinish(4, new int[][]{{1, 0}, {2, 1}, {3, 2}}));
    }

    @Test
    void complexGraph() {
        assertTrue(solution.canFinish(5, new int[][]{{1, 0}, {2, 1}, {3, 2}, {4, 3}}));
    }
}
