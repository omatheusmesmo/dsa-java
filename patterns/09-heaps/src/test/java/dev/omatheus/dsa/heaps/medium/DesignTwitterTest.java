package dev.omatheus.dsa.heaps.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class DesignTwitterTest {

    @Test
    void basicPostGet() {
        DesignTwitter twitter = new DesignTwitter();
        twitter.postTweet(1, 5);
        List<Integer> feed = twitter.getNewsFeed(1);
        assertEquals(1, feed.size());
        assertEquals(5, feed.get(0));
    }

    @Test
    void followUnfollow() {
        DesignTwitter twitter = new DesignTwitter();
        twitter.postTweet(1, 1);
        twitter.postTweet(2, 2);
        twitter.follow(1, 2);
        List<Integer> feed = twitter.getNewsFeed(1);
        assertEquals(2, feed.size());
        assertEquals(2, feed.get(0));
        twitter.unfollow(1, 2);
        feed = twitter.getNewsFeed(1);
        assertEquals(1, feed.size());
        assertEquals(1, feed.get(0));
    }

    @Test
    void multipleUsers() {
        DesignTwitter twitter = new DesignTwitter();
        twitter.postTweet(1, 1);
        twitter.postTweet(2, 2);
        twitter.postTweet(3, 3);
        twitter.follow(1, 2);
        twitter.follow(1, 3);
        List<Integer> feed = twitter.getNewsFeed(1);
        assertEquals(3, feed.size());
    }

    @Test
    void newsFeedOrder() {
        DesignTwitter twitter = new DesignTwitter();
        twitter.postTweet(1, 1);
        twitter.postTweet(1, 2);
        twitter.postTweet(1, 3);
        List<Integer> feed = twitter.getNewsFeed(1);
        assertEquals(3, feed.size());
        assertEquals(3, feed.get(0));
        assertEquals(2, feed.get(1));
        assertEquals(1, feed.get(2));
    }

    @Test
    void selfFollow() {
        DesignTwitter twitter = new DesignTwitter();
        twitter.postTweet(1, 1);
        twitter.follow(1, 1);
        List<Integer> feed = twitter.getNewsFeed(1);
        assertEquals(1, feed.size());
    }

    @Test
    void noTweets() {
        DesignTwitter twitter = new DesignTwitter();
        List<Integer> feed = twitter.getNewsFeed(1);
        assertTrue(feed.isEmpty());
    }
}
