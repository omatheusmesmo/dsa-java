package dev.omatheus.dsa.graphs.medium;

/**
 * <a href="https://leetcode.com/problems/course-schedule/">207. Course Schedule</a> (Medium)
 *
 * <p>There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1.
 * You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must
 * take course bi first if you want to take course ai. Return true if you can finish all courses.
 * Otherwise, return false.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Input: numCourses = 2, prerequisites = [[1,0]]
 * Output: true
 * Explanation: You can take course 0 first, then course 1.
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>1 <= numCourses <= 2000</li>
 *   <li>0 <= prerequisites.length <= 5000</li>
 *   <li>prerequisites[i].length == 2</li>
 * </ul>
 *
 * @see CourseScheduleTest
 */
public class CourseSchedule {

    /**
     * Determines if all courses can be finished.
     *
     * @param numCourses total number of courses
     * @param prerequisites array of [course, prerequisite] pairs
     * @return true if all courses can be finished
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
