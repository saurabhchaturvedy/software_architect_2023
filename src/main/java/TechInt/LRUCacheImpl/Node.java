package TechInt.LRUCacheImpl;

public class Node {


    int key;

    int value;

    Node prev;

    Node next;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
