package TechInt.LRUCacheImpl;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {


    int capacity;
    Map<Integer, Node> cache = new HashMap<>();
    Node head;
    Node tail;


    LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.head = new Node(-1, -1);
        this.tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;
    }


    public void put(int key, int value) {

        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            removeNode(node);
            moveToListHead(node);
            return;
        } else {

            if (cache.size() == capacity) {
                cache.remove(tail.prev.key);
                tail.prev = tail.prev.prev;
                tail.prev.next = tail;
            } else {

                Node node = new Node(key, value);
                cache.put(key, node);
                moveToListHead(node);
            }
        }
    }


    public Node get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);

            removeNode(node);
            moveToListHead(node);
            return node;
        }

        return null;
    }


    public void removeNode(Node node) {

        node.prev.next = node.next;
        node.next.prev = node.prev;
    }


    public void moveToListHead(Node node) {

        node.prev = head;
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
    }


    public static void main(String[] args) {

        LRUCache lruCache = new LRUCache(3);
        lruCache.put(1, 50);
        lruCache.put(2, 60);
        lruCache.put(3, 70);
        lruCache.put(4, 90);


        System.out.println(lruCache.cache.size());


        lruCache.cache.forEach((k, v) -> System.out.println(k + " " + v.value));


        System.out.println(lruCache.get(1).value);
    }
}
