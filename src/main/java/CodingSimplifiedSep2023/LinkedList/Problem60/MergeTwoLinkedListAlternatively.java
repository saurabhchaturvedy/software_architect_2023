package CodingSimplifiedSep2023.LinkedList.Problem60;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class MergeTwoLinkedListAlternatively {


    ListNode first;
    ListNode second;

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


    public void mergeTwoLinkedListAlternatively(ListNode node1, ListNode node2) {

        first = node1;
        second = node2;

        ListNode node1next = null;
        ListNode node2next = null;

        while (node1 != null && node2 != null) {

            node1next = node1.next;
            node1.next = node2;
            node1 = node1next;

            node2next = node2.next;
            node2.next = node1next;
            node2 = node2next;
        }


        second = node2;

    }

    public static void main(String[] args) {


        MergeTwoLinkedListAlternatively mergeTwoLinkedListAlternatively = new MergeTwoLinkedListAlternatively();

        ListNode node1 = null;

        node1 = mergeTwoLinkedListAlternatively.insert(node1, 12);
        node1 = mergeTwoLinkedListAlternatively.insert(node1, 99);
        node1 = mergeTwoLinkedListAlternatively.insert(node1, 8);
        node1 = mergeTwoLinkedListAlternatively.insert(node1, 39);

        ListNode node2 = null;

        node2 = mergeTwoLinkedListAlternatively.insert(node2, 5);
        node2 = mergeTwoLinkedListAlternatively.insert(node2, 70);

        mergeTwoLinkedListAlternatively.print(node1);
        System.out.println();
        mergeTwoLinkedListAlternatively.print(node2);

        mergeTwoLinkedListAlternatively.mergeTwoLinkedListAlternatively(node1, node2);

        System.out.println();
        mergeTwoLinkedListAlternatively.print(mergeTwoLinkedListAlternatively.first);
        mergeTwoLinkedListAlternatively.print(mergeTwoLinkedListAlternatively.second);
    }
}
