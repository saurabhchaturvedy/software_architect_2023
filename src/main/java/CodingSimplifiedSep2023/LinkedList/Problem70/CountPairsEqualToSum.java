package CodingSimplifiedSep2023.LinkedList.Problem70;

import CodingSimplifiedSep2023.LinkedList.ListNode;

import java.util.HashSet;
import java.util.Set;

public class CountPairsEqualToSum {


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


    public int countPairsEqualToSum(ListNode node1, ListNode node2, int sum) {
        if (node1 == null || node2 == null) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        int pairCount = 0;
        ListNode current = node1;

        while (current != null) {
            set.add(current.data);
            current = current.next;
        }

        current = node2;

        while (current != null) {
            if (set.contains(sum - current.data)) {
                pairCount++;
            }

            current = current.next;
        }

        return pairCount;
    }

    public static void main(String[] args) {


        CountPairsEqualToSum countPairsEqualToSum = new CountPairsEqualToSum();

        ListNode head1 = null;

        head1 = countPairsEqualToSum.insert(head1, 22);
        head1 = countPairsEqualToSum.insert(head1, 3);
        head1 = countPairsEqualToSum.insert(head1, 10);
        head1 = countPairsEqualToSum.insert(head1, 13);
        head1 = countPairsEqualToSum.insert(head1, 23);

        ListNode head2 = null;

        head2 = countPairsEqualToSum.insert(head2, 2);
        head2 = countPairsEqualToSum.insert(head2, 14);
        head2 = countPairsEqualToSum.insert(head2, 10);
        head2 = countPairsEqualToSum.insert(head2, 27);
        head2 = countPairsEqualToSum.insert(head2, 21);

        System.out.println();

        int i = countPairsEqualToSum.countPairsEqualToSum(head1, head2, 24);

        System.out.println(" Pairs equal to sum : " + i);
    }
}
