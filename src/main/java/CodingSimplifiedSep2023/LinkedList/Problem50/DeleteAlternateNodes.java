package CodingSimplifiedSep2023.LinkedList.Problem50;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class DeleteAlternateNodes {


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


    public ListNode deleteAlternateNodes(ListNode node) {

        if (node == null && node.next == null) {
            return node;
        }

        ListNode current = node;

        while (current != null && current.next != null) {

            current.next = current.next.next;
            current = current.next;
        }

        return node;
    }

    public static void main(String[] args) {


        DeleteAlternateNodes deleteAlternateNodes = new DeleteAlternateNodes();

        ListNode root = null;

        root = deleteAlternateNodes.insert(root, 23);
        root = deleteAlternateNodes.insert(root, 47);
        root = deleteAlternateNodes.insert(root, 11);
        root = deleteAlternateNodes.insert(root, 9);
        root = deleteAlternateNodes.insert(root, 66);
        root = deleteAlternateNodes.insert(root, 81);

        deleteAlternateNodes.print(root);

        ListNode listNode = deleteAlternateNodes.deleteAlternateNodes(root);

        System.out.println();
        deleteAlternateNodes.print(listNode);
    }
}
