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


    public void printForward() {
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


    public void printBackward() {
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

        if (head == null) {
            tail = newNode;
        } else {

            head.previous = newNode;
        }

        newNode.next = head;
        head = newNode;
        length++;
    }


    public void addToLast(int data) {
        ListNode newNode = new ListNode(data);

        if (tail == null) {
            head = newNode;
        } else {

            tail.next = newNode;
            newNode.previous = tail;
        }

        tail = newNode;
    }


    public void insertAtIndex(int index, int data) {

        if (index < 0 || index > length) {
            return;
        }

        if (index == 0) {
            addToFront(data);
        }

        if (index == length) {
            addToLast(data);
        }

        ListNode current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        ListNode newNode = new ListNode(data);
        ListNode temp = current.next;
        current.next = newNode;
        newNode.previous = current;
        newNode.next = temp;
        temp.previous = newNode;
    }


    public void deleteFirst() {

        if (head == null) {
            return;
        }


        if (head == tail) {
            tail = null;
        } else {

            head.next.previous = null;
        }

        head = head.next;
        length--;

    }


    public void deleteLast() {

        if (head == null) {
            return;
        }


        if (head == tail) {
            head = null;
        } else {

            tail.previous.next = null;
        }

        tail = tail.previous;
        length--;
    }


    public void deleteAtIndex(int index) {

        if (index < 0 || index > length) {
            return;
        }

        if (index == 0) {
            deleteFirst();
        }

        if (index == length) {
            deleteLast();
        }

        ListNode current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        ListNode temp = current.next.next;
        current.next = temp;
        temp.previous = current;
    }


    public static void main(String[] args) {


        ListNode head = new ListNode(7);
        ListNode second = new ListNode(11);
        ListNode third = new ListNode(18);
        ListNode fourth = new ListNode(21);
        ListNode fifth = new ListNode(24);


//        head.next = second;
//        second.previous = head;
//
//        second.next = third;
//        third.previous = second;
//
//        third.next = fourth;
//        fourth.previous = third;
//
//        fourth.next = fifth;
//        fifth.previous = fourth;


        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        //doublyLinkedList.printForward(head);

        doublyLinkedList.addToFront(10);
        doublyLinkedList.addToFront(20);
        System.out.println();
        doublyLinkedList.printBackward();

        System.out.println();

        doublyLinkedList.addToFront(89);

        System.out.println();

        doublyLinkedList.printForward();

        System.out.println();

        doublyLinkedList.addToLast(8889);

        System.out.println();

        doublyLinkedList.printForward();

        doublyLinkedList.insertAtIndex(2, 400);

        System.out.println();

        doublyLinkedList.printForward();

        System.out.println();

        doublyLinkedList.deleteFirst();

        doublyLinkedList.printForward();

        System.out.println();

        doublyLinkedList.deleteLast();

        doublyLinkedList.printForward();


        doublyLinkedList.addToFront(35);
        doublyLinkedList.addToFront(66);

        System.out.println();
        doublyLinkedList.printForward();

        doublyLinkedList.deleteAtIndex(3);

        System.out.println();

        doublyLinkedList.printForward();

    }
}
