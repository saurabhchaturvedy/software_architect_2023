package FundamentalsSep2023.SinglyLinkedList;

public class RemoveKeyFromLinkedList {


    ListNode head;


    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public void removeKey(ListNode head, int key) {
        if (head == null) {
            return;
        }

        if (head.data == key) {
            head = head.next;
            return;
        }

        ListNode current = head;
        ListNode temp = null;

        while (current != null && current.data != key) {
            temp = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        temp.next = current.next;
        return;
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

        System.out.print(" null ");
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

        RemoveKeyFromLinkedList removeKeyFromLinkedList = new RemoveKeyFromLinkedList();
        removeKeyFromLinkedList.print(head);


        removeKeyFromLinkedList.removeKey(head, 18);

        System.out.println();

        removeKeyFromLinkedList.print(head);
    }
}
