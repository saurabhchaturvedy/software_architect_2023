package CodingSimplifiedSep2023.LinkedList.Problem50;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class SeparateEvenOddNodes {


    public ListNode insert(ListNode node, int data) {

        if (node == null) {
            return new ListNode(data);
        } else {

            node.next = insert(node.next, data);
        }

        return node;
    }


    public void print(ListNode node) {

        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        print(node.next);
    }


    public int size(ListNode node) {

        if (node == null) {
            return 0;
        }

        ListNode current = node;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }


    public ListNode separateEvenOddNodes(ListNode node) {

        if (node == null && node.next == null) {
            return node;
        }

        ListNode current = node;
        ListNode evenStartNode = null;
        ListNode evenEndNode = null;
        ListNode oddStartNode = null;
        ListNode oddEndNode = null;

        while (current != null) {

            if (current.data % 2 == 0) {
                if (evenStartNode == null) {
                    evenStartNode = current;
                    evenEndNode = evenStartNode;
                } else {

                    evenEndNode.next = current;
                    evenEndNode = evenEndNode.next;
                }
            } else {

                if (oddStartNode == null) {
                    oddStartNode = current;
                    oddEndNode = oddStartNode;
                } else {

                    oddEndNode.next = current;
                    oddEndNode = oddEndNode.next;
                }
            }

            current = current.next;
        }

        evenEndNode.next = oddStartNode;
        oddEndNode.next = null;
        return evenStartNode;
    }


    public static void main(String[] args) {


        SeparateEvenOddNodes separateEvenOddNodes = new SeparateEvenOddNodes();

        ListNode root = null;

        root = separateEvenOddNodes.insert(root, 12);
        root = separateEvenOddNodes.insert(root, 19);
        root = separateEvenOddNodes.insert(root, 13);
        root = separateEvenOddNodes.insert(root, 22);
        root = separateEvenOddNodes.insert(root, 34);
        root = separateEvenOddNodes.insert(root, 67);
        root = separateEvenOddNodes.insert(root, 23);

        separateEvenOddNodes.print(root);


        ListNode listNode = separateEvenOddNodes.separateEvenOddNodes(root);

        System.out.println();


        separateEvenOddNodes.print(listNode);
    }
}
