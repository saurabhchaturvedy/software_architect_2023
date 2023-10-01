package CodingSimplifiedSep2023.LinkedList.Problem10;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class DeleteAtPosition {


    public ListNode deleteAtPosition(ListNode node, int position) {

        if (position < 1) {
            return node;
        }

        if (node == null && position > 1) {
            return node;
        }

        if (position == 1) {
            return node.next;
        }

        node.next = deleteAtPosition(node.next, position - 1);
        return node;
    }


    public static void main(String[] args) {

    }
}
