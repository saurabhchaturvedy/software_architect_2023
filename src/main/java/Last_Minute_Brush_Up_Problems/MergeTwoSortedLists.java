package Last_Minute_Brush_Up_Problems;

import Fundamentals.Sorting.MergeSort;

public class MergeTwoSortedLists {


    public ListNode mergeSortedLists(ListNode first, ListNode second) {
        if (first == null) return second;
        if (second == null) return first;

        ListNode refPtr = new ListNode(Integer.MIN_VALUE);

        ListNode headNode = refPtr;

        while (first != null && second != null) {

            if (first.data <= second.data) {
                refPtr.next = first;
                first = first.next;
            } else {
                refPtr.next = second;
                second = second.next;
            }

            refPtr = refPtr.next;
        }

        if (first == null) refPtr.next = second;
        if (second == null) refPtr.next = first;

        return headNode.next;
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


    }


    public static void main(String[] args) {

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode first = new ListNode(5);
        ListNode second = new ListNode(18);
        ListNode third = new ListNode(23);

        first.next = second;
        second.next = third;

        ListNode fourth = new ListNode(9);
        ListNode fifth = new ListNode(21);
        ListNode sixth = new ListNode(27);

        fourth.next = fifth;
        fifth.next = sixth;


        ListNode listNode = mergeTwoSortedLists.mergeSortedLists(first, fourth);

        mergeTwoSortedLists.print(listNode);
    }
}
