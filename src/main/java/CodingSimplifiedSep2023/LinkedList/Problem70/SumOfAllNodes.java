package CodingSimplifiedSep2023.LinkedList.Problem70;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class SumOfAllNodes {


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

    public static void main(String[] args) {

        SumOfAllNodes sumOfAllNodes = new SumOfAllNodes();

        ListNode root = null;

        root = sumOfAllNodes.insert(root, 15);
        root = sumOfAllNodes.insert(root, 10);
        root = sumOfAllNodes.insert(root, 8);
        root = sumOfAllNodes.insert(root, 65);
        root = sumOfAllNodes.insert(root, 45);
        root = sumOfAllNodes.insert(root, 115);
        root = sumOfAllNodes.insert(root, 3);

        sumOfAllNodes.print(root);
        System.out.println();


        int summedOfAllNodes = sumOfAllNodes.sumOfAllNodes(root);

        System.out.println(" Sum of all nodes : " + summedOfAllNodes);
    }
}
