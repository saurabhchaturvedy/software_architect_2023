package CodingSimplifiedSep2023.LinkedList.Problem20;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class SortList {


    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Base case: 0 or 1 element is already sorted.
        }

        // Find the middle of the linked list.
        ListNode middle = findMiddle(head);
        ListNode secondHalf = middle.next;

        // Split the linked list into two halves.
        middle.next = null;

        // Recursively sort the two halves.
        ListNode left = sortList(head);
        ListNode right = sortList(secondHalf);

        // Merge the sorted halves.
        return merge(left, right);
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (left != null && right != null) {
            if (left.data < right.data) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if (left != null) {
            current.next = left;
        }

        if (right != null) {
            current.next = right;
        }

        return dummy.next;
    }


    public ListNode insert(ListNode node, int data) {
        if (node == null) {
            return new ListNode(data);
        } else {

            node.next = insert(node.next, data);
        }

        return node;
    }


    public void print(ListNode node) {

        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        print(node.next);
    }


    public static void main(String[] args) {

        SortList sortList = new SortList();

        ListNode head = null;

        head = sortList.insert(head, 4);
        head = sortList.insert(head, 2);
        head = sortList.insert(head, 1);
        head = sortList.insert(head, 3);

        sortList.print(head);

        ListNode sortedList = sortList.sortList(head);

        System.out.println();

        sortList.print(sortedList);
    }
}
