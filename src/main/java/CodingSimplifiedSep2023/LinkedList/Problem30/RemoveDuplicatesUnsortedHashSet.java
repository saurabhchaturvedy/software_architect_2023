package CodingSimplifiedSep2023.LinkedList.Problem30;

import CodingSimplifiedSep2023.LinkedList.ListNode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesUnsortedHashSet {


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


    public ListNode removeDuplicates(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        Set<Integer> set = new HashSet<>();
        ListNode current = node;
        ListNode prev = null;
        while (current != null) {

            if (!set.contains(current.data)) {

                set.add(current.data);
                prev = current;
                current = current.next;

            } else {

                prev.next = current.next;
                current = current.next;
            }
        }

        return node;
    }


    public static void main(String[] args) {


        RemoveDuplicatesUnsortedHashSet removeDuplicatesUnsortedHashSet = new RemoveDuplicatesUnsortedHashSet();

        ListNode head = null;

        head = removeDuplicatesUnsortedHashSet.insert(head, 13);
        head = removeDuplicatesUnsortedHashSet.insert(head, 27);
        head = removeDuplicatesUnsortedHashSet.insert(head, 13);
        head = removeDuplicatesUnsortedHashSet.insert(head, 55);
        head = removeDuplicatesUnsortedHashSet.insert(head, 81);
        head = removeDuplicatesUnsortedHashSet.insert(head, 77);
        head = removeDuplicatesUnsortedHashSet.insert(head, 95);


        removeDuplicatesUnsortedHashSet.print(head);

        System.out.println();

        ListNode listWithoutDuplicates = removeDuplicatesUnsortedHashSet.removeDuplicates(head);

        System.out.println();

        removeDuplicatesUnsortedHashSet.print(listWithoutDuplicates);

    }
}
