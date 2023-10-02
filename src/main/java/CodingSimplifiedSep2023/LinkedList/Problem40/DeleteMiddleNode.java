package CodingSimplifiedSep2023.LinkedList.Problem40;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class DeleteMiddleNode {


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


    public ListNode deleteMiddle(ListNode node) {

        if (node == null) {
            return node;
        }

        ListNode slowPtr = node;
        ListNode fastPtr = node;
        ListNode prev = null;

        while (fastPtr != null && fastPtr.next != null && fastPtr.next.next != null) {
            prev = slowPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        prev.next = prev.next.next;
        return node;
    }


    public static void main(String[] args) {


        DeleteMiddleNode deleteMiddleNode = new DeleteMiddleNode();

        ListNode head = null;

        head = deleteMiddleNode.insert(head, 45);
        head = deleteMiddleNode.insert(head, 18);
        head = deleteMiddleNode.insert(head, 32);
        head = deleteMiddleNode.insert(head, 67);
        head = deleteMiddleNode.insert(head, 77);
        head = deleteMiddleNode.insert(head, 80);

        deleteMiddleNode.print(head);

        System.out.println();

        deleteMiddleNode.deleteMiddle(head);

        deleteMiddleNode.print(head);

    }
}
