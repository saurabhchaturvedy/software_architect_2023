package CodingSimplifiedSep2023.LinkedList.Problem50;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class ReverseLinkedList {


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


    public ListNode reverse(ListNode node, int k) {

        if (node == null && node.next == null) {
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


        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        ListNode root = null;

        root = reverseLinkedList.insert(root, 1);
        root = reverseLinkedList.insert(root, 2);
        root = reverseLinkedList.insert(root, 3);
        root = reverseLinkedList.insert(root, 4);
        root = reverseLinkedList.insert(root, 5);

        reverseLinkedList.print(root);

        ListNode reverse = reverseLinkedList.reverse(root, 2);

        System.out.println();
        reverseLinkedList.print(reverse);
    }
}
