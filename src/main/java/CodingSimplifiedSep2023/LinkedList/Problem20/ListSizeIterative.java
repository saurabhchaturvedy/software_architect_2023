package CodingSimplifiedSep2023.LinkedList.Problem20;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class ListSizeIterative {


    public int size(ListNode node) {

        if (node == null) {
            return 0;
        }

        int count = 0;

        ListNode current = node;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }


    public static void main(String[] args) {

    }
}
