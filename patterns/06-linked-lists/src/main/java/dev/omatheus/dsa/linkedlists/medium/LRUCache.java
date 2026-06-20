package dev.omatheus.dsa.linkedlists.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/lru-cache/">146. LRU Cache</a> (Medium)
 *
 * <p>Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 * Implement the {@code LRUCache} class with {@code get} and {@code put} operations.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * LRUCache lRUCache = new LRUCache(2);
 * lRUCache.put(1, 1); // cache is {1=1}
 * lRUCache.put(2, 2); // cache is {1=1, 2=2}
 * lRUCache.get(1);    // return 1
 * lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
 * lRUCache.get(2);    // return -1 (not found)
 * lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {3=3, 4=4}
 * lRUCache.get(1);    // return -1 (not found)
 * lRUCache.get(3);    // return 3
 * lRUCache.get(4);    // return 4
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>1 <= capacity <= 3000</li>
 *   <li>0 <= key <= 10^4</li>
 *   <li>0 <= value <= 10^5</li>
 *   <li>At most 2 * 10^5 calls</li>
 * </ul>
 *
 * @see dev.omatheus.dsa.linkedlists.medium.LRUCacheTest
 */
public class LRUCache {

    /**
     * Initializes the LRU cache with the given capacity.
     *
     * @param capacity the maximum capacity
     */
    public LRUCache(int capacity) {
        throw new UnsupportedOperationException("Solve this problem!");
    }

    /**
     * Gets the value of the key if it exists, otherwise returns -1.
     *
     * @param key the key
     * @return the value or -1
     */
    public int get(int key) {
        throw new UnsupportedOperationException("Solve this problem!");
    }

    /**
     * Updates the value of the key. If the key doesn't exist, adds it.
     * If the cache exceeds capacity, evicts the least recently used key.
     *
     * @param key   the key
     * @param value the value
     */
    public void put(int key, int value) {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
