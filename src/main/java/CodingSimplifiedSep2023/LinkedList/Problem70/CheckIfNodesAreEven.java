package CodingSimplifiedSep2023.LinkedList.Problem70;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class CheckIfNodesAreEven {


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


    public boolean checkIfNodesEven(ListNode node) {

        if (node == null) {
            return true;
        }

        ListNode current = node;

        while (current.next != null && current.next.next != null) {

            current = current.next.next;
        }


        if (current.next == null) {
            return false;
        } else {

            return true;
        }
    }

    public static void main(String[] args) {


        CheckIfNodesAreEven checkIfNodesAreEven = new CheckIfNodesAreEven();

        ListNode root = null;

        root = checkIfNodesAreEven.insert(root, 12);
        root = checkIfNodesAreEven.insert(root, 8);
        root = checkIfNodesAreEven.insert(root, 22);
        root = checkIfNodesAreEven.insert(root, 52);
        root = checkIfNodesAreEven.insert(root, 42);
        //   root = checkIfNodesAreEven.insert(root, 192);

        checkIfNodesAreEven.print(root);
        System.out.println();

        boolean checkIfNodesEven = checkIfNodesAreEven.checkIfNodesEven(root);

        System.out.println(" is node count even ? ::: " + checkIfNodesEven);
    }
}
