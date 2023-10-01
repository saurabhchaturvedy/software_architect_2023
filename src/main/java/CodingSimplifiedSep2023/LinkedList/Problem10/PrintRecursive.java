package CodingSimplifiedSep2023.LinkedList.Problem10;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class PrintRecursive {


    public void print(ListNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        print(node.next);
    }


    public static void main(String[] args) {

    }
}
