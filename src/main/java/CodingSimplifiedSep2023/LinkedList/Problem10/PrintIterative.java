package CodingSimplifiedSep2023.LinkedList.Problem10;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class PrintIterative {


    public void print(ListNode node) {
        if (node == null) {
            return;
        }

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


    public static void main(String[] args) {

    }
}
