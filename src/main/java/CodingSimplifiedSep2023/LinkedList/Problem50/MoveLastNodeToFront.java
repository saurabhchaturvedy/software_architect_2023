package CodingSimplifiedSep2023.LinkedList.Problem50;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class MoveLastNodeToFront {


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


    public ListNode moveLastNodeToFront(ListNode node) {

        if (node == null && node.next == null) {
            return node;
        }

        ListNode current = node;

        while (current.next.next != null) {
            current = current.next;
        }


        current.next.next = node;
        node = current.next;


        current.next = null;

        return node;
    }

    public static void main(String[] args) {


        MoveLastNodeToFront moveLastNodeToFront = new MoveLastNodeToFront();

        ListNode root = null;

        root = moveLastNodeToFront.insert(root, 13);
        root = moveLastNodeToFront.insert(root, 18);
        root = moveLastNodeToFront.insert(root, 21);
        root = moveLastNodeToFront.insert(root, 27);
        root = moveLastNodeToFront.insert(root, 88);
        root = moveLastNodeToFront.insert(root, 56);

        moveLastNodeToFront.print(root);

        ListNode listNode = moveLastNodeToFront.moveLastNodeToFront(root);

        System.out.println();

        moveLastNodeToFront.print(listNode);
    }
}
