package CodingSimplifiedSep2023.LinkedList.Problem40;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class IdenticalLists {


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


    public boolean areIdentical(ListNode first, ListNode second) {

        while (first != null && second != null) {
            if (first.data != second.data) {
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return (first == null && second == null);
    }

    public static void main(String[] args) {


        IdenticalLists identicalLists = new IdenticalLists();

        ListNode head1 = null;

        head1 = identicalLists.insert(head1, 1);
        head1 = identicalLists.insert(head1, 2);
        head1 = identicalLists.insert(head1, 3);

        ListNode head2 = null;

        head2 = identicalLists.insert(head2, 1);
        head2 = identicalLists.insert(head2, 2);
        head2 = identicalLists.insert(head2, 3);

        System.out.println(" Are linked list identical ?? " + identicalLists.areIdentical(head1, head2));

    }
}
