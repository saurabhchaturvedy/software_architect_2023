package CodingSimplifiedSep2023.LinkedList.Problem50;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class SwapNodesPairwise {


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


    public ListNode swapNodesPairwise(ListNode node) {
        ListNode dummy = new ListNode(-1);
        dummy.next = node;

        ListNode current = dummy;

        while (current.next != null && current.next.next != null) {

            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            second.next = first;
            current.next = second;
            current = current.next.next;
        }

        return dummy.next;
    }


    public static void main(String[] args) {

        SwapNodesPairwise swapNodesPairwise = new SwapNodesPairwise();

        ListNode root = null;

        root = swapNodesPairwise.insert(root, 34);
        root = swapNodesPairwise.insert(root, 18);
        root = swapNodesPairwise.insert(root, 52);
        root = swapNodesPairwise.insert(root, 71);
        root = swapNodesPairwise.insert(root, 63);
        root = swapNodesPairwise.insert(root, 49);

        swapNodesPairwise.print(root);

        ListNode listNode = swapNodesPairwise.swapNodesPairwise(root);

        System.out.println();

        swapNodesPairwise.print(listNode);


    }
}
