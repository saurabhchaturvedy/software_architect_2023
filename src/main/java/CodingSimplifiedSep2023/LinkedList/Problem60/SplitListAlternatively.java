package CodingSimplifiedSep2023.LinkedList.Problem60;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class SplitListAlternatively {


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


    public void splitListsAlternatively(ListNode node) {
        if (node == null || node.next == null) {
            return;
        }

        first = node;
        second = node.next;
        ListNode firstTemp = first;
        ListNode secondTemp = second;

        node = node.next.next;

        while (node != null && node.next != null) {

            firstTemp.next = node;
            secondTemp.next = node.next;

            firstTemp = firstTemp.next;
            secondTemp = secondTemp.next;
        }

        if (node != null) {
            firstTemp.next = node;
            firstTemp = firstTemp.next;
        }

        return;
    }

    public static void main(String[] args) {

        SplitListAlternatively splitListAlternatively = new SplitListAlternatively();

        ListNode root = null;

        root = splitListAlternatively.insert(root,23);
        root = splitListAlternatively.insert(root,18);
        root = splitListAlternatively.insert(root,52);
        root = splitListAlternatively.insert(root,36);
        root = splitListAlternatively.insert(root,66);
        root = splitListAlternatively.insert(root,82);
        root = splitListAlternatively.insert(root,27);

        splitListAlternatively.print(root);

        System.out.println();

        splitListAlternatively.splitListsAlternatively(root);

        splitListAlternatively.print(splitListAlternatively.first);
        System.out.println();
        splitListAlternatively.print(splitListAlternatively.second);
    }
}
