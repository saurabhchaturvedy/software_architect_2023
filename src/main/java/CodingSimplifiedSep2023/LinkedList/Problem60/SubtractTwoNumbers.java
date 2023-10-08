package CodingSimplifiedSep2023.LinkedList.Problem60;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class SubtractTwoNumbers {

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


    public int size(ListNode node) {

        if (node == null) {
            return 0;
        }

        ListNode current = node;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public ListNode reverse(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }


        ListNode current = node;
        ListNode previous = null;
        ListNode next = null;

        while (current != null) {

            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public ListNode subtractTwoNumbers(ListNode first, ListNode second) {

        ListNode dummyNode = new ListNode(-1);
        ListNode current = dummyNode;

        int borrow = 0;
        first = reverse(first);
        second = reverse(second);
        while (first != null || second != null) {

            int x = first != null ? first.data - borrow : 0;
            int y = second != null ? second.data : 0;

            if (x < y) {
                x = x + 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            int diff = x - y;
            current.next = new ListNode(diff);
            current = current.next;

            if (first != null) {
                first = first.next;
            }

            if (second != null) {
                second = second.next;
            }

        }

        if (first != null) {
            current.next = first;
        }
        ListNode result = dummyNode.next;

        // remove trailing zeroes from the subtraction result
        while (result != null && result.data == 0) {
            result = result.next;
        }


        return reverse(result);

    }


    public static void main(String[] args) {


        SubtractTwoNumbers subtractTwoNumbers = new SubtractTwoNumbers();

        ListNode head1 = null;

        head1 = subtractTwoNumbers.insert(head1, 1);
        head1 = subtractTwoNumbers.insert(head1, 4);
        head1 = subtractTwoNumbers.insert(head1, 8);


        subtractTwoNumbers.print(head1);
        System.out.println();

        ListNode head2 = null;

        head2 = subtractTwoNumbers.insert(head2, 5);
        head2 = subtractTwoNumbers.insert(head2, 6);


        subtractTwoNumbers.print(head2);
        System.out.println();

        ListNode listNode = subtractTwoNumbers.subtractTwoNumbers(head1, head2);
        System.out.println();
        subtractTwoNumbers.print(listNode);
    }
}
