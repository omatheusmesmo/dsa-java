package dev.omatheus.dsa.graphs.medium;

/**
 * <a href="https://leetcode.com/problems/course-schedule-ii/">210. Course Schedule II</a> (Medium)
 *
 * <p>There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1.
 * You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must
 * take course bi first if you want to take course ai. Return the ordering of courses you should
 * take to finish all courses. If there are many valid answers, return any of them.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Input: numCourses = 2, prerequisites = [[1,0]]
 * Output: [0,1]
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>1 <= numCourses <= 2000</li>
 *   <li>0 <= prerequisites.length <= 5000</li>
 *   <li>prerequisites[i].length == 2</li>
 * </ul>
 *
 * @see CourseScheduleIITest
 */
public class CourseScheduleII {

    /**
     * Returns the course ordering to finish all courses.
     *
     * @param numCourses total number of courses
     * @param prerequisites array of [course, prerequisite] pairs
     * @return the ordering of courses, or empty array if impossible
     */
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
