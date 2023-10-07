package CodingSimplifiedSep2023.LinkedList.Problem60;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class SplitListAlternatively {


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


    public void splitListAlternatively(ListNode node) {

        if (node == null || node.next == null) {
            return;
        }


        ListNode list1 = new ListNode(-1);
        ListNode list2 = new ListNode(-2);

        ListNode current1 = list1;
        ListNode current2 = list2;

        ListNode current = node;

        int count = 0;

        while (current != null) {

            if (count % 2 == 0) {

                current1.next = current;
                current1 = current1.next;
            } else {

                current2.next = current;
                current2 = current2.next;
            }

            current = current.next;
            count++;

        }


        current1.next = null;
        current2.next = null;

        print(list1.next);
        System.out.println();
        print(list2.next);
    }

    public static void main(String[] args) {

        SplitListAlternatively splitListAlternatively = new SplitListAlternatively();

        ListNode root = null;

        root = splitListAlternatively.insert(root, 56);
        root = splitListAlternatively.insert(root, 7);
        root = splitListAlternatively.insert(root, 18);
        root = splitListAlternatively.insert(root, 27);
        root = splitListAlternatively.insert(root, 17);
        root = splitListAlternatively.insert(root, 78);
        root = splitListAlternatively.insert(root, 31);


        splitListAlternatively.print(root);

        System.out.println();

        splitListAlternatively.splitListAlternatively(root);
    }
}
