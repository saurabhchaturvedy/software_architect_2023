package FundamentalsSep2023.SinglyLinkedList;

public class RemoveDuplicateFromSortedList {


    ListNode head;


    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public void removeDuplicate(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }


        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
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


        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(20);

        first.next = second;

        second.next = third;

        RemoveDuplicateFromSortedList removeDuplicateFromSortedList = new RemoveDuplicateFromSortedList();
        removeDuplicateFromSortedList.print(first);

        removeDuplicateFromSortedList.removeDuplicate(first);

        removeDuplicateFromSortedList.print(first);
    }
}
