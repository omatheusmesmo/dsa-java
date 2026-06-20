package dev.omatheus.dsa.binary_search.medium;

/**
 * <a href="https://leetcode.com/problems/time-based-key-value-store/">981. Time Based Key-Value Store</a> (Medium)
 *
 * <p>Design a time-based key-value data structure that can store multiple values for the same key
 * at different time stamps and retrieve the key's value at a certain timestamp.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * TimeMap timeMap = new TimeMap();
 * timeMap.set("foo", "bar", 1);
 * timeMap.get("foo", 1);  // returns "bar"
 * timeMap.get("foo", 3);  // returns "bar"
 * timeMap.set("foo", "bar2", 4);
 * timeMap.get("foo", 4);  // returns "bar2"
 * timeMap.get("foo", 5);  // returns "bar2"
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>1 <= key.length, value.length <= 100</li>
 *   <li>key and value consist of lowercase English letters and digits</li>
 *   <li>1 <= timestamp <= 10^7</li>
 *   <li>All the timestamps timestamp of set are strictly increasing</li>
 * </ul>
 *
 * @see TimeBasedKeyValueStoreTest
 */
public class TimeBasedKeyValueStore {

    /**
     * Initializes the time-based key-value store.
     */
    public TimeBasedKeyValueStore() {
    }

    /**
     * Stores the key with the value at the given timestamp.
     *
     * @param key the key
     * @param value the value
     * @param timestamp the timestamp
     */
    public void set(String key, String value, int timestamp) {
        throw new UnsupportedOperationException("Solve this problem!");
    }

    /**
     * Returns a value such that set(key, value, prev_timestamp) was called previously
     * with prev_timestamp <= timestamp. If there are multiple such values, it returns the
     * one with the largest prev_timestamp. If there is no value, it returns "".
     *
     * @param key the key
     * @param timestamp the timestamp
     * @return the value or empty string
     */
    public String get(String key, int timestamp) {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
