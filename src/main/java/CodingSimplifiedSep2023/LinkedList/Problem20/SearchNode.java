package CodingSimplifiedSep2023.LinkedList.Problem20;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class SearchNode {


    public boolean search(ListNode node, int data) {

        if (node == null) {
            return false;
        }

        ListNode current = node;

        while (current != null) {

            if (current.data == data) {
                return true;
            }

            current = current.next;
        }

        return false;
    }


    public static void main(String[] args) {

    }
}
