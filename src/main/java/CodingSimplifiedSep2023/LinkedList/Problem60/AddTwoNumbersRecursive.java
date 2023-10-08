package CodingSimplifiedSep2023.LinkedList.Problem60;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class AddTwoNumbersRecursive {


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


    public ListNode addTwoNumbersRecursive(ListNode first, ListNode second, int carry) {

        if (first == null && second == null) {

            if (carry > 0) {
                return new ListNode(carry);
            }

            return null;
        }


        int x = (first != null) ? first.data : 0;
        int y = (second != null) ? second.data : 0;

        int sum = x + y + carry;
        carry = sum/10;
        ListNode result = new ListNode(sum % 10);

        if (first != null) {
            first = first.next;
        }

        if (second != null) {
            second = second.next;
        }


        result.next = addTwoNumbersRecursive(first, second, carry);

        return result;
    }

    public static void main(String[] args) {


        AddTwoNumbersRecursive addTwoNumbersRecursive = new AddTwoNumbersRecursive();

        ListNode head1 = null;

        head1 = addTwoNumbersRecursive.insert(head1, 1);
        head1 = addTwoNumbersRecursive.insert(head1, 7);
        head1 = addTwoNumbersRecursive.insert(head1, 8);
        head1 = addTwoNumbersRecursive.insert(head1, 2);
        head1 = addTwoNumbersRecursive.insert(head1, 5);

        addTwoNumbersRecursive.print(head1);
        System.out.println();

        ListNode head2 = null;

        head2 = addTwoNumbersRecursive.insert(head2, 5);
        head2 = addTwoNumbersRecursive.insert(head2, 6);
        head2 = addTwoNumbersRecursive.insert(head2, 7);

        addTwoNumbersRecursive.print(head2);
        System.out.println();

        ListNode listNode = addTwoNumbersRecursive.addTwoNumbersRecursive(head1, head2, 0);

        addTwoNumbersRecursive.print(listNode);
    }
}
