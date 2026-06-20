package dev.omatheus.dsa.binary_search.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeBasedKeyValueStoreTest {

    @Test
    void basicSetGet() {
        TimeBasedKeyValueStore store = new TimeBasedKeyValueStore();
        store.set("foo", "bar", 1);
        assertEquals("bar", store.get("foo", 1));
    }

    @Test
    void multipleValues() {
        TimeBasedKeyValueStore store = new TimeBasedKeyValueStore();
        store.set("foo", "bar", 1);
        store.set("foo", "bar2", 4);
        assertEquals("bar", store.get("foo", 1));
        assertEquals("bar2", store.get("foo", 4));
    }

    @Test
    void timestampNotFound() {
        TimeBasedKeyValueStore store = new TimeBasedKeyValueStore();
        store.set("foo", "bar", 1);
        assertEquals("bar", store.get("foo", 3));
    }

    @Test
    void sameTimestamp() {
        TimeBasedKeyValueStore store = new TimeBasedKeyValueStore();
        store.set("foo", "bar1", 1);
        store.set("foo", "bar2", 1);
        assertEquals("bar2", store.get("foo", 1));
    }

    @Test
    void differentKeys() {
        TimeBasedKeyValueStore store = new TimeBasedKeyValueStore();
        store.set("foo", "bar", 1);
        store.set("baz", "qux", 2);
        assertEquals("bar", store.get("foo", 1));
        assertEquals("qux", store.get("baz", 2));
    }

    @Test
    void largeTimestamps() {
        TimeBasedKeyValueStore store = new TimeBasedKeyValueStore();
        store.set("key", "value", 10000000);
        assertEquals("value", store.get("key", 10000000));
    }
}
