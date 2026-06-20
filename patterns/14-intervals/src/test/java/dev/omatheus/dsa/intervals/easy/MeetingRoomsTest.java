package dev.omatheus.dsa.intervals.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomsTest {

    private final MeetingRooms solution = new MeetingRooms();

    @Test
    void basicTrue() {
        assertTrue(solution.canAttendMeetings(new int[][]{{0, 30}, {35, 40}, {45, 50}}));
    }

    @Test
    void basicFalse() {
        assertFalse(solution.canAttendMeetings(new int[][]{{0, 30}, {5, 10}, {15, 20}}));
    }

    @Test
    void emptyArray() {
        assertTrue(solution.canAttendMeetings(new int[][]{}));
    }

    @Test
    void singleMeeting() {
        assertTrue(solution.canAttendMeetings(new int[][]{{0, 5}}));
    }

    @Test
    void overlapping() {
        assertFalse(solution.canAttendMeetings(new int[][]{{1, 3}, {2, 4}}));
    }

    @Test
    void nonOverlapping() {
        assertTrue(solution.canAttendMeetings(new int[][]{{1, 3}, {4, 6}}));
    }
}
