package DesignCoding;

import java.util.HashMap;

public class HasshMap<K, V> {


    public static final int DEFAULT_CAPACITY = 16;
    Entry<K, V>[] buckets;
    int size = 0;

    HasshMap() {
        this.buckets = new Entry[DEFAULT_CAPACITY];
        this.size = 0;
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

    private void resize() {

        Entry<K, V>[] newBuckets = new Entry[buckets.length * 2];

        for (Entry<K, V> bucket : buckets) {
            Entry<K, V> current = bucket;

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

    private int getIndex(K key) {

        return Math.abs(key.hashCode()) % buckets.length;
    }

    private int size() {
        return size;
    }


    public static class Entry<K, V> {

        K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }


    public static void main(String[] args) {
        HasshMap<String, Integer> map = new HasshMap<>();


        map.put("apple", 6);
        map.put("hat", 11);
        map.put("lampoon", 18);

        System.out.println("size of map : " + map.size());


        map.remove("hat");

        System.out.println("size of map : " + map.size());


        System.out.println("value of key : " + map.get("lampoon"));
    }
}
