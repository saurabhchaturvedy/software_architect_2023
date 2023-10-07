package CodingSimplifiedSep2023.LinkedList.Problem50;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class ReverseLinkedListGroupOfK {


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


    public ListNode reverseNodesInGroupOfK(ListNode node, int k) {
        int size = size(node);

        if (size < k) {
            return node;
        }

        ListNode current = node;
        ListNode previous = null;
        ListNode next = null;

        int i = 0;

        while (current != null && i < k) {

            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            i++;
        }

        if (next != null) {

            if (size(next) >= k) {
                node.next = reverseNodesInGroupOfK(next, k);
            } else {

                node.next = next;
            }
        }

        return previous;
    }

    public static void main(String[] args) {

        ReverseLinkedListGroupOfK reverseLinkedListGroupOfK = new ReverseLinkedListGroupOfK();

        ListNode root = null;

        root = reverseLinkedListGroupOfK.insert(root, 1);
        root = reverseLinkedListGroupOfK.insert(root, 2);
        root = reverseLinkedListGroupOfK.insert(root, 3);
        root = reverseLinkedListGroupOfK.insert(root, 4);
        root = reverseLinkedListGroupOfK.insert(root, 5);

        reverseLinkedListGroupOfK.print(root);


        ListNode listNode = reverseLinkedListGroupOfK.reverseNodesInGroupOfK(root, 2);

        System.out.println();

        reverseLinkedListGroupOfK.print(listNode);
    }
}
