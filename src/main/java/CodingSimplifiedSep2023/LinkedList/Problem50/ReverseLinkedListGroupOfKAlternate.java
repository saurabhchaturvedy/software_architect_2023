package CodingSimplifiedSep2023.LinkedList.Problem50;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class ReverseLinkedListGroupOfKAlternate {

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


    public ListNode reverseLinkedListGroupKAlternatively(ListNode node, int k) {

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

        i = 0;
        if (next != null) {

            node.next = next;
            current = next;


            while (current != null && i < k - 1) {
                current = current.next;
                i++;
            }

            if (current != null) {
                current.next = reverseLinkedListGroupKAlternatively(current.next, k);
            }
        }

        return previous;
    }

    public static void main(String[] args) {

        ReverseLinkedListGroupOfKAlternate reverseLinkedListGroupOfK = new ReverseLinkedListGroupOfKAlternate();

        ListNode root = null;

        root = reverseLinkedListGroupOfK.insert(root, 12);
        root = reverseLinkedListGroupOfK.insert(root, 49);
        root = reverseLinkedListGroupOfK.insert(root, 33);
        root = reverseLinkedListGroupOfK.insert(root, 67);
        root = reverseLinkedListGroupOfK.insert(root, 65);
        root = reverseLinkedListGroupOfK.insert(root, 25);

        reverseLinkedListGroupOfK.print(root);

        ListNode listNode = reverseLinkedListGroupOfK.reverseLinkedListGroupKAlternatively(root, 2);

        System.out.println();

        reverseLinkedListGroupOfK.print(listNode);
    }
}
