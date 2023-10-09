package CodingSimplifiedSep2023.LinkedList.Problem70;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class DeleteEveryKthNode {


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


    public int size(ListNode node) {

        if (node == null) {
            return 0;
        }

        ListNode current = node;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }


    public ListNode deleteEveryKthNode(ListNode node, int k) {
        if (node == null && k <= 1) {
            return null;
        }

        if (node.next == null && k > 1) {
            System.out.println("Invalid K value");
            return node;
        }

        ListNode current = node;
        int i = 1;

        while (current != null && current.next != null) {

            if (i % (k - 1) == 0) {
                current.next = current.next.next;
            }

            current = current.next;
            i++;
        }

        return node;
    }

    public static void main(String[] args) {


        DeleteEveryKthNode deleteEveryKthNode = new DeleteEveryKthNode();

        ListNode root = null;

        root = deleteEveryKthNode.insert(root, 11);
        root = deleteEveryKthNode.insert(root, 18);
        root = deleteEveryKthNode.insert(root, 71);
        root = deleteEveryKthNode.insert(root, 9);
        root = deleteEveryKthNode.insert(root, 88);
        root = deleteEveryKthNode.insert(root, 5);

        deleteEveryKthNode.print(root);
        System.out.println();

        ListNode listNode = deleteEveryKthNode.deleteEveryKthNode(root, 2);

        System.out.println();
        deleteEveryKthNode.print(listNode);
    }
}
