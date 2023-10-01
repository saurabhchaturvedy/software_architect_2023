package CodingSimplifiedSep2023.LinkedList.Problem10;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class DeleteLastNode {


    public ListNode deleteLastNode(ListNode node) {
        if (node == null && node.next == null) {
            return node;
        }


        ListNode temp = node;

        while (temp.next.next != null) {

            temp = temp.next;
        }

        temp.next = null;

        return node;
    }


    public static void main(String[] args) {

    }
}
