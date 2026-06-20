package dev.omatheus.dsa.intervals.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomsIITest {

    private final MeetingRoomsII solution = new MeetingRoomsII();

    @Test
    void basicCase() {
        assertEquals(2, solution.minMeetingRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}}));
    }

    @Test
    void noOverlap() {
        assertEquals(1, solution.minMeetingRooms(new int[][]{{0, 30}, {35, 40}}));
    }

    @Test
    void allOverlap() {
        assertEquals(3, solution.minMeetingRooms(new int[][]{{0, 30}, {5, 25}, {10, 20}}));
    }

    @Test
    void singleMeeting() {
        assertEquals(1, solution.minMeetingRooms(new int[][]{{0, 5}}));
    }

    @Test
    void twoMeetings() {
        assertEquals(2, solution.minMeetingRooms(new int[][]{{0, 10}, {5, 15}}));
    }

    @Test
    void complexSchedule() {
        assertEquals(3, solution.minMeetingRooms(new int[][]{{1, 5}, {2, 6}, {3, 7}, {4, 8}}));
    }
}
