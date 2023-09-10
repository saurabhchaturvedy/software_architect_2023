package FundamentalsSep2023.DoublyLinkedList;

public class DoublyLinkedList {


    ListNode head;
    ListNode tail;

    int length = 0;


    private static class ListNode {
        int data;
        ListNode next;
        ListNode previous;

        ListNode(int data) {
            this.data = data;
        }
    }


    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }


    public void printForward(ListNode head) {
        if (head == null) {
            return;
        }


        ListNode current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.print(" -> ");
    }


    public void printBackward(ListNode head) {
        if (head == null) {
            return;
        }


        ListNode current = tail;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.previous;
        }

        System.out.print(" -> ");
    }


    public void addToFront(int data) {
        ListNode newNode = new ListNode(data);

        if (isEmpty()) {
            tail = newNode;
        } else {

            head.previous = newNode;
        }

        newNode.next = head;
        head = newNode;
        length++;
    }


    public static void main(String[] args) {


        ListNode head = new ListNode(7);
        ListNode second = new ListNode(11);
        ListNode third = new ListNode(18);
        ListNode fourth = new ListNode(21);
        ListNode fifth = new ListNode(24);


        head.next = second;
        second.previous = head;

        second.next = third;
        third.previous = second;

        third.next = fourth;
        fourth.previous = third;

        fourth.next = fifth;
        fifth.previous = fourth;


        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.printForward(head);

        doublyLinkedList.tail = fifth;
        System.out.println();
        doublyLinkedList.printBackward(fifth);

        System.out.println();

        doublyLinkedList.addToFront(89);

        System.out.println();

        doublyLinkedList.printForward(head);
    }
}
