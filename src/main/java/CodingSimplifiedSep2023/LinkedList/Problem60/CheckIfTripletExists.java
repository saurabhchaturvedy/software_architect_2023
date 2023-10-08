package CodingSimplifiedSep2023.LinkedList.Problem60;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class CheckIfTripletExists {


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


    public boolean isTripletExists(ListNode node1, ListNode node2, ListNode node3, int targetSum) {

        ListNode head2 = node2;
        ListNode head3 = node3;

        while (node1 != null) {

            while (node2 != null && node3 != null) {

                int sum = node1.data + node2.data + node3.data;

                if (sum == targetSum) {
                    return true;
                } else if (sum > targetSum) {
                    node3 = node3.next;
                } else {

                    node2 = node2.next;
                }
            }

            node1 = node1.next;
            node2 = head2;
            node3 = head3;
        }

        return false;
    }

    public static void main(String[] args) {


        CheckIfTripletExists checkIfTripletExists = new CheckIfTripletExists();

        ListNode head1 = null;

        head1 = checkIfTripletExists.insert(head1, 5);
        head1 = checkIfTripletExists.insert(head1, 2);
        head1 = checkIfTripletExists.insert(head1, 9);

        checkIfTripletExists.print(head1);
        System.out.println();
        ListNode head2 = null;

        head2 = checkIfTripletExists.insert(head2, 3);
        head2 = checkIfTripletExists.insert(head2, 2);
        head2 = checkIfTripletExists.insert(head2, 7);

        checkIfTripletExists.print(head2);
        System.out.println();
        ListNode head3 = null;


        head3 = checkIfTripletExists.insert(head3, 12);
        head3 = checkIfTripletExists.insert(head3, 8);
        head3 = checkIfTripletExists.insert(head3, 4);

        System.out.println();
        checkIfTripletExists.print(head3);


        boolean tripletExists = checkIfTripletExists.isTripletExists(head1, head2, head3, 13);


        System.out.println(" Is triplet exists ? ::: " + tripletExists);


    }
}
