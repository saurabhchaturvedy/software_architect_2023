package CodingSimplifiedSep2023.LinkedList.Problem10;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class InsertIterative {


    public ListNode insert(ListNode node, int data) {
        if (node == null) {
            return new ListNode(data);
        }

        ListNode head = node;

        while (node.next != null) {
            node = node.next;
        }


        node.next = new ListNode(data);

        return head;
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


        InsertIterative insertIterative = new InsertIterative();

        ListNode root = null;

        root = insertIterative.insert(root, 10);
        root = insertIterative.insert(root, 15);
        root = insertIterative.insert(root, 33);

        insertIterative.print(root);
    }
}
