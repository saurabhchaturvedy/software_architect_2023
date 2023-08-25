package TechInt;

class CustomLinkedList<K, V> {
    private Node<K, V> head;
    private Node<K, V> tail;

    public CustomLinkedList() {
        head = new Node<>(null, null);
        tail = new Node<>(null, null);
        head.next = tail;
        tail.prev = head;
    }

    public void addToFront(Node<K, V> node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    public void remove(Node<K, V> node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public Node<K, V> removeLast() {
        if (tail.prev == head) {
            return null;
        }
        Node<K, V> last = tail.prev;
        remove(last);
        return last;
    }
}