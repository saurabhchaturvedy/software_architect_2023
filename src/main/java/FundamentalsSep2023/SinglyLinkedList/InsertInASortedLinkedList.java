package FundamentalsSep2023.SinglyLinkedList;

public class InsertInASortedLinkedList {


    ListNode head;


    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public void insertInSorted(ListNode head, int data) {
        if (head == null) {
            return;
        }

        ListNode current = head;
        ListNode temp = null;

        while (current != null && current.data < data) {
            temp = current;
            current = current.next;
        }

        ListNode newNode = new ListNode(data);

        newNode.next = current;
        temp.next = newNode;
    }


    public void print(ListNode head) {
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


    public static void main(String[] args) {


        ListNode head = new ListNode(7);
        ListNode second = new ListNode(11);
        ListNode third = new ListNode(18);
        ListNode fourth = new ListNode(21);
        ListNode fifth = new ListNode(24);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        InsertInASortedLinkedList insertInASortedLinkedList = new InsertInASortedLinkedList();
        insertInASortedLinkedList.print(head);

        insertInASortedLinkedList.insertInSorted(head, 20);

        System.out.println();

        insertInASortedLinkedList.print(head);
    }
}
