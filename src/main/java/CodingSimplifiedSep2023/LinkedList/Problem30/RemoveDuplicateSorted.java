package CodingSimplifiedSep2023.LinkedList.Problem30;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class RemoveDuplicateSorted {


    public ListNode insert(ListNode node, int data) {

        if (node == null) {
            return new ListNode(data);
        } else {

            node.next = insert(node.next, data);
        }

        return node;
    }


    public ListNode deleteFromSorted(ListNode node) {

        if (node == null || node.next == null) {
            return node;
        }

        if (node.data == node.next.data) {
            node.next = node.next.next;
            deleteFromSorted(node);
        } else {

            deleteFromSorted(node.next);
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


    public static void main(String[] args) {


        RemoveDuplicateSorted removeDuplicateSorted = new RemoveDuplicateSorted();

        ListNode head1 = null;

        head1 = removeDuplicateSorted.insert(head1, 23);
        head1 = removeDuplicateSorted.insert(head1, 29);
        head1 = removeDuplicateSorted.insert(head1, 31);
        head1 = removeDuplicateSorted.insert(head1, 31);
        head1 = removeDuplicateSorted.insert(head1, 47);
        head1 = removeDuplicateSorted.insert(head1, 55);

        removeDuplicateSorted.print(head1);

        System.out.println();

        removeDuplicateSorted.deleteFromSorted(head1);

        removeDuplicateSorted.print(head1);
    }
}
