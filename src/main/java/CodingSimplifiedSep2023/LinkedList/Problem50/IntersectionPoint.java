package CodingSimplifiedSep2023.LinkedList.Problem50;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class IntersectionPoint {


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


    public int getIntersectionPoint(ListNode first, ListNode second) {

        if (first == null || second == null) {
            return -1;
        }


        int firstListSize = size(first);
        int secondListSize = size(second);


        while (firstListSize > secondListSize) {

            firstListSize--;
            first = first.next;
        }

        while (secondListSize > firstListSize) {

            secondListSize--;
            second = second.next;
        }


        while (first.data != second.data) {

            first = first.next;
            second = second.next;
        }

        return first.data;

    }

    public static void main(String[] args) {

        IntersectionPoint intersectionPoint = new IntersectionPoint();

        ListNode root = null;

        root = intersectionPoint.insert(root, 1);
        root = intersectionPoint.insert(root, 3);
        root = intersectionPoint.insert(root, 1);
        root = intersectionPoint.insert(root, 2);
        root = intersectionPoint.insert(root, 4);

        ListNode root2 = null;

        root2 = intersectionPoint.insert(root2, 3);
        root2 = intersectionPoint.insert(root2, 2);
        root2 = intersectionPoint.insert(root2, 4);


        intersectionPoint.print(root);
        System.out.println();
        intersectionPoint.print(root2);

        System.out.println(" Intersection point is : " + intersectionPoint.getIntersectionPoint(root, root2));
    }
}
