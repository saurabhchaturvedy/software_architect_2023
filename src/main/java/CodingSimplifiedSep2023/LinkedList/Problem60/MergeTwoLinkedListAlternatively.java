package CodingSimplifiedSep2023.LinkedList.Problem60;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class MergeTwoLinkedListAlternatively {


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


    public ListNode mergeTwoLinkedListAlternatively(ListNode node1, ListNode node2) {

        if (node1 == null) {
            return node2;
        }

        if (node2 == null) {
            return node1;
        }


        ListNode mergedHead = new ListNode(-1);
        ListNode current = mergedHead;
        boolean useList = true;

        while (node1 != null && node2 != null) {
            if (useList) {
                current.next = node1;
                node1 = node1.next;
            } else {

                current.next = node2;
                node2 = node2.next;
            }

            current = current.next;
            useList = !useList;
        }

        if (node1 != null) {
            current.next = node1;
        }

        if (node2 != null) {
            current.next = node2;
        }

        return mergedHead.next;
    }

    public static void main(String[] args) {

        MergeTwoLinkedListAlternatively mergeTwoLinkedListAlternatively = new MergeTwoLinkedListAlternatively();

        ListNode head1 = null;

        head1 = mergeTwoLinkedListAlternatively.insert(head1, 12);
        head1 = mergeTwoLinkedListAlternatively.insert(head1, 99);
        head1 = mergeTwoLinkedListAlternatively.insert(head1, 8);
        head1 = mergeTwoLinkedListAlternatively.insert(head1, 39);

        mergeTwoLinkedListAlternatively.print(head1);
        System.out.println();

        ListNode head2 = null;

        head2 = mergeTwoLinkedListAlternatively.insert(head2, 5);
        head2 = mergeTwoLinkedListAlternatively.insert(head2, 70);

        mergeTwoLinkedListAlternatively.print(head2);

        ListNode listNode = mergeTwoLinkedListAlternatively.mergeTwoLinkedListAlternatively(head1, head2);

        System.out.println();

        mergeTwoLinkedListAlternatively.print(listNode);
    }
}
