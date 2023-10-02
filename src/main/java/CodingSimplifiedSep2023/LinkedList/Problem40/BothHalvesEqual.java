package CodingSimplifiedSep2023.LinkedList.Problem40;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class BothHalvesEqual {


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


    public boolean bothHalvesEqual(ListNode node) {

        if (node == null) {
            return false;
        }

        ListNode slowPtr = node;
        ListNode fastPtr = node;
        ListNode prev = null;

        while (fastPtr != null && fastPtr.next != null && fastPtr.next.next != null) {
            prev = slowPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        ListNode secondHalf = slowPtr.next;

        while (secondHalf != null) {

            if (node.data != secondHalf.data) {
                return false;
            }

            node = node.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static void main(String[] args) {


        BothHalvesEqual bothHalvesEqual = new BothHalvesEqual();

        ListNode head = null;

        head = bothHalvesEqual.insert(head, 1);
        head = bothHalvesEqual.insert(head, 2);
        head = bothHalvesEqual.insert(head, 3);
        head = bothHalvesEqual.insert(head, 50);
        head = bothHalvesEqual.insert(head, 1);
        head = bothHalvesEqual.insert(head, 2);
        head = bothHalvesEqual.insert(head, 3);

        bothHalvesEqual.print(head);

        System.out.println("Are both halves equal ? :: " + bothHalvesEqual.bothHalvesEqual(head));
    }
}
