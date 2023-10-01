package CodingSimplifiedSep2023.LinkedList.Problem20;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class ReverseRecursive {


    public ListNode reverse(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        ListNode temp = reverse(node.next);
        node.next.next = node;
        temp.next = null;

        return temp;
    }


    public static void main(String[] args) {

    }
}
