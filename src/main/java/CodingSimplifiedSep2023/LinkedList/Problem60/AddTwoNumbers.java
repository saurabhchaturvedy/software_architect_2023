package CodingSimplifiedSep2023.LinkedList.Problem60;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class AddTwoNumbers {


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


    public ListNode addTwoNumbers(ListNode first, ListNode second) {
        ListNode dummyHead = new ListNode(-1);
        ListNode current = dummyHead;
        int carry = 0;

        first = reverse(first);
        second = reverse(second);
        while (first != null && second != null) {

            int x = (first != null) ? first.data : 0;
            int y = (second != null) ? second.data : 0;

            int sum = x + y + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if (first != null) {
                first = first.next;
            }

            if (second != null) {
                second = second.next;
            }

        }


        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            current.next = newNode;
        }


        return reverse(dummyHead.next);
    }

    public static void main(String[] args) {

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode head1 = null;

        head1 = addTwoNumbers.insert(head1, 5);
        head1 = addTwoNumbers.insert(head1, 6);
        head1 = addTwoNumbers.insert(head1, 3);

        addTwoNumbers.print(head1);
        System.out.println();

        ListNode head2 = null;

        head2 = addTwoNumbers.insert(head2, 8);
        head2 = addTwoNumbers.insert(head2, 4);
        head2 = addTwoNumbers.insert(head2, 2);

        addTwoNumbers.print(head2);

        ListNode listNode = addTwoNumbers.addTwoNumbers(head1, head2);

        System.out.println();

        System.out.print(" Sum is :");
        addTwoNumbers.print(listNode);

    }
}
