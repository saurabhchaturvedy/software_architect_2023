package CodingSimplifiedSep2023.LinkedList.Problem60;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class PairwiseSwapListNodes {


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


    public ListNode pairwiseSwapListNodes(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        ListNode current = node;
        ListNode previous = null;
        ListNode next = null;
        int i = 0;
        while (current != null && i < 2) {

            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            i++;
        }

        if (next != null) {

            if (size(next) >= 2) {
                node.next = pairwiseSwapListNodes(next);
            } else {
                node.next = next;
            }

        }

        return previous;
    }

    public static void main(String[] args) {


        PairwiseSwapListNodes pairwiseSwapListNodes = new PairwiseSwapListNodes();

        ListNode root = null;

        root = pairwiseSwapListNodes.insert(root, 12);
        root = pairwiseSwapListNodes.insert(root, 33);
        root = pairwiseSwapListNodes.insert(root, 9);
        root = pairwiseSwapListNodes.insert(root, 59);
        root = pairwiseSwapListNodes.insert(root, 42);
        root = pairwiseSwapListNodes.insert(root, 3);

        pairwiseSwapListNodes.print(root);

        System.out.println();

        ListNode listNode = pairwiseSwapListNodes.pairwiseSwapListNodes(root);

        System.out.println();

        pairwiseSwapListNodes.print(listNode);
    }
}
