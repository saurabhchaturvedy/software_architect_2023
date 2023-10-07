package CodingSimplifiedSep2023.LinkedList.Problem60;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class AddOneToNumber {


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


    public ListNode addOneToNumber(ListNode node) {
        if (node == null) {
            return node;
        }

        node = reverse(node);

        ListNode current = node;
        int carry = 1;

        while (current != null) {
            int sum = current.data + carry;
            carry = sum / 10;
            current.data = sum % 10;
            current = current.next;
        }

        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            current.next = newNode;
        }

        node = reverse(node);

        return node;
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

    public static void main(String[] args) {

        AddOneToNumber addOneToNumber = new AddOneToNumber();

        ListNode root = null;

        root = addOneToNumber.insert(root, 1);
        root = addOneToNumber.insert(root, 9);
        root = addOneToNumber.insert(root, 9);
        root = addOneToNumber.insert(root, 9);

        addOneToNumber.print(root);

        System.out.println();

        ListNode listNode = addOneToNumber.addOneToNumber(root);

        addOneToNumber.print(listNode);
    }
}
