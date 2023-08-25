package TechInt;

public class LRUCacheExecutor {
    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");

        System.out.println(cache.get(2)); // Output: Two

        cache.put(4, "Four");

        System.out.println(cache.get(1)); // Output: null (evicted)
        System.out.println(cache.get(2)); // Output: Two
        System.out.println(cache.get(3)); // Output: Three
        System.out.println(cache.get(4)); // Output: Four
    }
}