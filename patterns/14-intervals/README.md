# Intervals Pattern

The Intervals pattern deals with overlapping ranges. It covers merging, inserting, and scheduling problems involving intervals.

## When to Use
- Time range problems (meetings, events, appointments)
- Overlapping intervals detection and merging
- Meeting room scheduling
- Any problem involving start/end ranges

## Key Techniques
1. **Sort by start time**: Enables sweep-line processing
2. **Sweep line**: Track events (start/end) chronologically
3. **Min-heap**: Track active intervals efficiently
4. **Merge strategy**: Check overlap by comparing `end` of one with `start` of next

## Common Patterns
- Merge overlapping intervals
- Insert and merge a new interval
- Count minimum rooms/resources needed
- Find non-overlapping subsets

## Problems

### Easy
- [Summary Ranges](src/main/java/dev/omatheus/dsa/intervals/easy/SummaryRanges.java)
- [Meeting Rooms](src/main/java/dev/omatheus/dsa/intervals/easy/MeetingRooms.java)

### Medium
- [Merge Intervals](src/main/java/dev/omatheus/dsa/intervals/medium/MergeIntervals.java)
- [Insert Interval](src/main/java/dev/omatheus/dsa/intervals/medium/InsertInterval.java)
- [Meeting Rooms II](src/main/java/dev/omatheus/dsa/intervals/medium/MeetingRoomsII.java)
- [Non-Overlapping Intervals](src/main/java/dev/omatheus/dsa/intervals/medium/NonOverlappingIntervalsGreedy.java)
