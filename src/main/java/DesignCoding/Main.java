package DesignCoding;

class CustomHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private Entry<K, V>[] buckets;
    private int size;

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        buckets = new Entry[DEFAULT_CAPACITY];
        size = 0;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        Entry<K, V> newEntry = new Entry<>(key, value);

        if (buckets[index] == null) {
            buckets[index] = newEntry;
        } else {
            Entry<K, V> current = buckets[index];
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            if (current.key.equals(key)) {
                current.value = value;
            } else {
                current.next = newEntry;
            }
        }
        size++;

        // Resize if load factor exceeds a certain threshold
        if ((double) size / buckets.length > 0.75) {
            resize();
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        Entry<K, V> current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = getIndex(key);
        Entry<K, V> current = buckets[index];
        Entry<K, V> prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public int size() {
        return size;
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        Entry<K, V>[] newBuckets = new Entry[buckets.length * 2];
        for (Entry<K, V> entry : buckets) {
            Entry<K, V> current = entry;
            while (current != null) {
                int newIndex = Math.abs(current.key.hashCode()) % newBuckets.length;
                Entry<K, V> temp = current.next;
                current.next = newBuckets[newIndex];
                newBuckets[newIndex] = current;
                current = temp;
            }
        }
        buckets = newBuckets;
    }

    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> customMap = new CustomHashMap<>();

        customMap.put("one", 1);
        customMap.put("two", 2);
        customMap.put("three", 3);

        System.out.println(customMap.get("one"));    // Output: 1
        System.out.println(customMap.get("four"));   // Output: null

        customMap.remove("two");
        System.out.println(customMap.size());        // Output: 2
    }
}
