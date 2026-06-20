package dev.omatheus.dsa.graphs.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleIITest {

    private final CourseScheduleII solution = new CourseScheduleII();

    @Test
    void basicOrder() {
        int[] result = solution.findOrder(2, new int[][]{{1, 0}});
        assertEquals(2, result.length);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void singleCourse() {
        int[] result = solution.findOrder(1, new int[][]{});
        assertEquals(1, result.length);
        assertEquals(0, result[0]);
    }

    @Test
    void noPrerequisites() {
        int[] result = solution.findOrder(3, new int[][]{});
        assertEquals(3, result.length);
    }

    @Test
    void cycle() {
        int[] result = solution.findOrder(2, new int[][]{{1, 0}, {0, 1}});
        assertEquals(0, result.length);
    }

    @Test
    void complexGraph() {
        int[] result = solution.findOrder(4, new int[][]{{1, 0}, {2, 1}, {3, 2}});
        assertEquals(4, result.length);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
        assertEquals(2, result[2]);
        assertEquals(3, result[3]);
    }

    @Test
    void multiplePaths() {
        int[] result = solution.findOrder(3, new int[][]{{1, 0}, {2, 0}});
        assertEquals(3, result.length);
        assertEquals(0, result[0]);
    }
}
