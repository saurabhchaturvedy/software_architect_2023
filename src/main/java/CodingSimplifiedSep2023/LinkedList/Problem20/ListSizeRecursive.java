package CodingSimplifiedSep2023.LinkedList.Problem20;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class ListSizeRecursive {


    public int size(ListNode node) {
        if (node == null) {
            return 0;
        }

        return 1 + size(node.next);
    }


    public static void main(String[] args) {

    }
}
