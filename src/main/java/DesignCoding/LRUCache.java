package DesignCoding;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {


    int capacity;
    Map<Integer, Node> cache;
    Node head;
    Node tail;

    LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.head = new Node(-1,-1);
        this.tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }


    public void put(int key, int value) {
        if (this.cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;

            node.prev.next = node.next;
            node.next.prev = node.prev;
            moveToHead(node);
            return;
        }


        if (cache.size() == this.capacity) {
            cache.remove(tail.prev.key);
            tail.prev = tail.prev.prev;
            tail.prev.next = tail;
        }

        Node node = new Node(key, value);
        cache.put(key, node);

        moveToHead(node);
    }


    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }

        Node node = cache.get(key);
        node.prev.next = node.next;
        node.next.prev = node.prev;

        moveToHead(node);

        return node.value;
    }


    public void moveToHead(Node node) {
        node.prev = head;
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
    }
}
