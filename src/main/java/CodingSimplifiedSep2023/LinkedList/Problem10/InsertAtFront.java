package CodingSimplifiedSep2023.LinkedList.Problem10;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class InsertAtFront {


    public ListNode insertFront(ListNode node, int data) {
        if (node == null) {
            return new ListNode(data);
        } else {

            ListNode newNode = new ListNode(data);
            newNode.next = node;
            return newNode;
        }
    }


    public void print(ListNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        print(node.next);
    }


    public static void main(String[] args) {

        InsertAtFront insertAtFront = new InsertAtFront();

        ListNode root = null;

        root = insertAtFront.insertFront(root, 12);
        root = insertAtFront.insertFront(root, 23);
        root = insertAtFront.insertFront(root, 47);

        insertAtFront.print(root);
    }
}
