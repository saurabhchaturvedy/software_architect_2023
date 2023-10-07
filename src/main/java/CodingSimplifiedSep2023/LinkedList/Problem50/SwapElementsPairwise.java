package CodingSimplifiedSep2023.LinkedList.Problem50;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class SwapElementsPairwise {


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


    public ListNode swapElementsPairwise(ListNode node) {

        if (node == null && node.next == null) {
            return node;
        }


        ListNode current = node;

        while (current != null && current.next != null) {

            int temp = current.data;
            current.data = current.next.data;
            current.next.data = temp;

            current = current.next.next;
        }

        return node;
    }


    public static void main(String[] args) {

        SwapElementsPairwise swapElementsPairwise = new SwapElementsPairwise();

        ListNode root = null;

        root = swapElementsPairwise.insert(root, 12);
        root = swapElementsPairwise.insert(root, 27);
        root = swapElementsPairwise.insert(root, 16);
        root = swapElementsPairwise.insert(root, 31);
        root = swapElementsPairwise.insert(root, 10);
        root = swapElementsPairwise.insert(root, 8);

        swapElementsPairwise.print(root);

        ListNode listNode = swapElementsPairwise.swapElementsPairwise(root);

        System.out.println();
        swapElementsPairwise.print(listNode);
    }
}
