package dev.omatheus.dsa.heaps.medium;

import java.util.List;

/**
 * <a href="https://leetcode.com/problems/design-twitter/">355. Design Twitter</a> (Medium)
 *
 * <p>Design a simplified twitter where users can post tweets, follow/unfollow another user, and
 * is able to see the 10 most recent tweets in the user's news feed. Implement the Twitter class:
 * Twitter() Initializes your twitter object. void postTweet(int userId, int tweetId) Composes
 * a new tweet with ID tweetId by the user userId. List<Integer> getNewsFeed(int userId) Retrieves
 * the 10 most recent tweet IDs in the user's news feed. void follow(int followerId, int followeeId)
 * The user with ID followerId started following the user with ID followeeId. void unfollow(int followerId,
 * int followeeId) The user with ID followerId started unfollowing the user with ID followeeId.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Input: ["Twitter","postTweet","getNewsFeed","follow","postTweet","getNewsFeed","unfollow","getNewsFeed"]
 * [[],[1,5],[1],[1,2],[2,6],[1],[1,2],[1]]
 * Output: [null,null,[5],null,null,[6,5],null,[5]]
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>1 <= userId, followerId, followeeId <= 500</li>
 *   <li>1 <= tweetId <= 10^4</li>
 *   <li>All the calls have been made to the system (i.e. auth is handled)</li>
 *   <li>No duplicate tweet IDs</li>
 * </ul>
 *
 * @see DesignTwitterTest
 */
public class DesignTwitter {

    /**
     * Initializes the twitter object.
     */
    public DesignTwitter() {
    }

    /**
     * Composes a new tweet.
     *
     * @param userId the user who posted
     * @param tweetId the tweet ID
     */
    public void postTweet(int userId, int tweetId) {
        throw new UnsupportedOperationException("Solve this problem!");
    }

    /**
     * Retrieves the 10 most recent tweet IDs in the user's news feed.
     *
     * @param userId the user whose feed to retrieve
     * @return list of tweet IDs
     */
    public List<Integer> getNewsFeed(int userId) {
        throw new UnsupportedOperationException("Solve this problem!");
    }

    /**
     * Follows a user.
     *
     * @param followerId the follower's ID
     * @param followeeId the followee's ID
     */
    public void follow(int followerId, int followeeId) {
        throw new UnsupportedOperationException("Solve this problem!");
    }

    /**
     * Unfollows a user.
     *
     * @param followerId the follower's ID
     * @param followeeId the followee's ID
     */
    public void unfollow(int followerId, int followeeId) {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
