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


    public ListNode reverse(ListNode node) {

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

        root = reverseLinkedList.insert(root, 12);
        root = reverseLinkedList.insert(root, 32);
        root = reverseLinkedList.insert(root, 27);
        root = reverseLinkedList.insert(root, 19);
        root = reverseLinkedList.insert(root, 56);
        root = reverseLinkedList.insert(root, 78);

        reverseLinkedList.print(root);

        ListNode reverse = reverseLinkedList.reverse(root);

        System.out.println();
        reverseLinkedList.print(reverse);
    }
}
