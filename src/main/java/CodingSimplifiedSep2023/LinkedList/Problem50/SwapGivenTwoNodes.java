package CodingSimplifiedSep2023.LinkedList.Problem50;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class SwapGivenTwoNodes {


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


    public ListNode swapGivenTwoNodes(ListNode node, int val1, int val2) {

        if (node == null && node.next == null) {
            return node;
        }


        ListNode prev1 = null;
        ListNode prev2 = null;
        ListNode t1 = null;
        ListNode t2 = null;


        ListNode current = node;

        while (current != null) {

            if (current.data == val1) {
                t1 = current;
                break;
            }

            prev1 = current;
            current = current.next;
        }

        current = node;

        while (current != null) {
            if (current.data == val2) {
                t2 = current;
                break;
            }

            prev2 = current;
            current = current.next;
        }


        if (t1 == null || t2 == null) {
            return node;
        }

        if (prev1 != null) {
            prev1.next = t2;
        } else {

            node = t2;
        }

        if (prev2 != null) {
            prev2.next = t1;
        } else {
            node = t1;
        }

        ListNode temp = t1.next;
        t1.next = t2.next;
        t2.next = temp;

        return node;
    }

    public static void main(String[] args) {


        SwapGivenTwoNodes swapGivenTwoNodes = new SwapGivenTwoNodes();

        ListNode root = null;

        root = swapGivenTwoNodes.insert(root, 34);
        root = swapGivenTwoNodes.insert(root, 52);
        root = swapGivenTwoNodes.insert(root, 78);
        root = swapGivenTwoNodes.insert(root, 15);
        root = swapGivenTwoNodes.insert(root, 63);
        root = swapGivenTwoNodes.insert(root, 99);

        swapGivenTwoNodes.print(root);

        ListNode listNode = swapGivenTwoNodes.swapGivenTwoNodes(root, 52, 63);

        System.out.println();

        swapGivenTwoNodes.print(listNode);
    }
}
