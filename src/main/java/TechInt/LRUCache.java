package TechInt;

import java.util.HashMap;
import java.util.Map;

class LRUCache<K, V> {
    private final int capacity;
    private final Map<K, Node<K, V>> cache;
    private final CustomLinkedList<K, V> lruOrder;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.lruOrder = new CustomLinkedList<>();
    }

    public V get(K key) {
        if (cache.containsKey(key)) {
            Node<K, V> node = cache.get(key);
            lruOrder.remove(node);
            lruOrder.addToFront(node);
            return node.value;
        }
        return null;
    }

    public void put(K key, V value) {
        if (cache.size() >= capacity) {
            Node<K, V> lruNode = lruOrder.removeLast();
            if (lruNode != null) {
                cache.remove(lruNode.key);
            }
        }

        Node<K, V> newNode = new Node<>(key, value);
        cache.put(key, newNode);
        lruOrder.addToFront(newNode);
    }
}