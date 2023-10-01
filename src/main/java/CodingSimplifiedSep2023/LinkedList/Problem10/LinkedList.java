package CodingSimplifiedSep2023.LinkedList.Problem10;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class LinkedList {


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


    public static void main(String[] args) {


        LinkedList linkedList = new LinkedList();
        ListNode root = null;
        root = linkedList.insert(root, 20);
        root = linkedList.insert(root, 30);
        root = linkedList.insert(root, 45);

        linkedList.print(root);
    }
}
