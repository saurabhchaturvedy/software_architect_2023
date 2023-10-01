package CodingSimplifiedSep2023.LinkedList.Problem10;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class DeleteFrontNode {


    public ListNode deleteFrontNode(ListNode node) {

        if (node == null) {
            return node;
        }

        return node.next;
    }


    public static void main(String[] args) {

    }
}
