package CodingSimplifiedSep2023.LinkedList.Problem70;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class CountRotations {


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


    public int getRotationCount(ListNode node) {

        ListNode current = node;
        int rotationCount = 0;

        while (current != null) {

            if (current.data <= current.next.data) {
                rotationCount++;
            } else {
                break;
            }

            current = current.next;
        }


        if (current.next == null) {
            return 0;
        } else {
            return rotationCount + 1;
        }
    }

    public static void main(String[] args) {

        CountRotations countRotations = new CountRotations();

        ListNode root = null;

        root = countRotations.insert(root, 22);
        root = countRotations.insert(root, 38);
        root = countRotations.insert(root, 1);
        root = countRotations.insert(root, 7);
        root = countRotations.insert(root, 13);

        countRotations.print(root);
        System.out.println();

        int rotationCount = countRotations.getRotationCount(root);

        System.out.println(" Rotation count is : " + rotationCount);

    }
}
