package CodingSimplifiedSep2023.LinkedList.Problem20;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class RotateClockwise {


    public ListNode rotateClockwise(ListNode node, int k) {
        if (node == null || k < 0) {
            return node;
        }

        int size = size(node);
        k = k % size;

        if (k == 0) {
            return node;
        }

        ListNode current = node;
        int i = 1;
        while (i < size - k) {
            current = current.next;
            i++;
        }

        ListNode temp = current.next;
        ListNode head = temp;
        current.next = null;

        while (temp.next != null) {
            temp = temp.next;
        }


        temp.next = node;

        return head;

    }


    public int size(ListNode node) {
        if (node == null) {
            return 0;
        }

        return 1 + size(node.next);
    }


    public static void main(String[] args) {

    }
}
