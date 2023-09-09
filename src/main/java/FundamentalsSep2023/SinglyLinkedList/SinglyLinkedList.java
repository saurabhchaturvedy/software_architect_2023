package FundamentalsSep2023.SinglyLinkedList;

public class SinglyLinkedList {


    public void print(ListNode head) {
        if (head == null) {
            return;
        }

        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }


    public int length(ListNode head) {
        if (head == null) {
            return 0;
        }

        ListNode current = head;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }


    public ListNode addToHead(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
        return head;
    }


    public ListNode addToLast(ListNode head, int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head = newNode;
            return head;
        }

        ListNode current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        return head;
    }


    public static void main(String[] args) {

        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);

        head.next = second;
        second.next = third;

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.print(head);

        System.out.println();

        System.out.println("Length of the linked list is ::: " + singlyLinkedList.length(head));

        ListNode newHead = singlyLinkedList.addToHead(head, 75);

        singlyLinkedList.print(newHead);

        ListNode lastNode = singlyLinkedList.addToLast(newHead, 15);

        System.out.println();
        singlyLinkedList.print(lastNode);
    }
}
