package CodingSimplifiedSep2023.LinkedList.Problem10;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class InsertAtPositionIterative {


    public ListNode insertAtPosition(ListNode node, int position, int data) {
        if (position < 1) {
            return null;
        }

        if (node == null && position > 1) {
            return node;
        }

        if (node == null && position == 1) {
            return new ListNode(data);
        }

        if (position == 1) {
            ListNode newNode = new ListNode(data);
            newNode.next = node;
            return newNode;
        }


        ListNode head = node;
        ListNode prev = null;

        while (node != null && position > 1) {

            prev = node;
            node = node.next;
            position--;
        }

        if (position != 1) {
            return head;
        }

        ListNode newNode = new ListNode(data);
        newNode.next = node;
        return newNode;
    }


    public void print(ListNode node) {

        if (node == null) {
            return;
        }

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


    public static void main(String[] args) {

        InsertAtPositionIterative insertAtPositionIterative = new InsertAtPositionIterative();

        ListNode root = null;

        root = insertAtPositionIterative.insertAtPosition(root, 1, 23);
        root = insertAtPositionIterative.insertAtPosition(root, 2, 72);
        root = insertAtPositionIterative.insertAtPosition(root, 3, 33);

        insertAtPositionIterative.print(root);
    }
}
