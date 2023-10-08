package CodingSimplifiedSep2023.LinkedList.Problem70;

import CodingSimplifiedSep2023.LinkedList.ListNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedListIntersection {


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

    public ListNode linkedListIntersection(ListNode node1, ListNode node2) {
        if (node1 == null && node2 == null) {
            return null;
        }

        if (node1 == null) {
            return node2;
        }

        if (node2 == null) {
            return node1;
        }


        ListNode current = node1;
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        while (current != null) {


            set.add(current.data);

            current = current.next;
        }

        current = node2;

        while (current != null) {

            if (set.contains(current.data)) {
                list.add(current.data);
            }


            current = current.next;
        }

        ListNode dummy = new ListNode(-1);
        ListNode result = dummy;

        for (int t : list) {
            result.next = new ListNode(t);
            result = result.next;
        }


        return dummy.next;
    }

    public static void main(String[] args) {

        LinkedListIntersection linkedListIntersection = new LinkedListIntersection();

        ListNode head1 = null;

        head1 = linkedListIntersection.insert(head1, 22);
        head1 = linkedListIntersection.insert(head1, 3);
        head1 = linkedListIntersection.insert(head1, 10);
        head1 = linkedListIntersection.insert(head1, 3);
        head1 = linkedListIntersection.insert(head1, 13);


        linkedListIntersection.print(head1);
        System.out.println();

        ListNode head2 = null;

        head2 = linkedListIntersection.insert(head2, 2);
        head2 = linkedListIntersection.insert(head2, 3);
        head2 = linkedListIntersection.insert(head2, 10);
        head2 = linkedListIntersection.insert(head2, 27);
        head2 = linkedListIntersection.insert(head2, 36);

        linkedListIntersection.print(head2);

        ListNode listNode = linkedListIntersection.linkedListIntersection(head1, head2);

        System.out.println();
        linkedListIntersection.print(listNode);

    }

}