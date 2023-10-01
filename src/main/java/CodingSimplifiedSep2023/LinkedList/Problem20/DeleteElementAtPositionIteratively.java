package CodingSimplifiedSep2023.LinkedList.Problem20;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class DeleteElementAtPositionIteratively {


    public ListNode deleteNodeAtPosition(ListNode node, int position) {

        if (position < 1) {
            return node;
        }

        if (node == null && position > 1) {
            return node;
        }

        if (position == 1) {
            return node.next;
        }


        ListNode head = node;
        ListNode prev = null;

        while (node != null && position > 1) {
            prev = node;
            node = node.next;
            position--;
        }


        if (position != 1) {
            return head;
        }

        prev.next = node.next;

        return head;
    }


    public static void main(String[] args) {

    }
}
