package CodingSimplifiedSep2023.LinkedList.Problem70;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class SumOfLastNNodes {


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


    public int sumOfAllNodes(ListNode node) {
        if (node == null) {
            return 0;
        }

        int sum = 0;

        ListNode current = node;

        while (current != null) {
            sum = sum + current.data;
            current = current.next;
        }

        return sum;
    }


    public int sumOfLastNNodes(ListNode node, int n) {

        if (node == null || n <= 0) {
            return 0;
        }

        int sum = 0;

        ListNode refPtr = node;
        ListNode mainPtr = node;

        int count = 0;

        while (count < n) {

            refPtr = refPtr.next;
            count++;
        }


        while (refPtr != null) {

            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }

        ListNode current = mainPtr;

        while (current != null) {

            sum = sum + current.data;
            current = current.next;
        }

        return sum;
    }

    public static void main(String[] args) {


        SumOfLastNNodes sumOfLastNNodes = new SumOfLastNNodes();

        ListNode root = null;

        root = sumOfLastNNodes.insert(root, 12);
        root = sumOfLastNNodes.insert(root, 8);
        root = sumOfLastNNodes.insert(root, 32);
        root = sumOfLastNNodes.insert(root, 17);
        root = sumOfLastNNodes.insert(root, 3);
        root = sumOfLastNNodes.insert(root, 11);
        root = sumOfLastNNodes.insert(root, 21);

        sumOfLastNNodes.print(root);
        System.out.println();

        int summed = sumOfLastNNodes.sumOfLastNNodes(root, 3);

        System.out.println(" Sum of last N nodes :: " + summed);
    }
}
