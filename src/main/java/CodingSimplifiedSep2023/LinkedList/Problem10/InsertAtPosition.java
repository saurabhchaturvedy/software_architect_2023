package CodingSimplifiedSep2023.LinkedList.Problem10;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class InsertAtPosition {


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

        node.next = insertAtPosition(node.next, position - 1, data);
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

        InsertAtPosition insertAtPosition = new InsertAtPosition();

        ListNode root = null;

        root = insertAtPosition.insertAtPosition(root, 1, 45);
        root = insertAtPosition.insertAtPosition(root, 2, 34);
        insertAtPosition.print(root);
    }
}
