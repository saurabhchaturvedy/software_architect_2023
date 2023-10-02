package CodingSimplifiedSep2023.LinkedList.Problem30;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class RemoveDuplicatesUnsorted {


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


    public ListNode getMiddleNode(ListNode node) {

        if (node == null) {
            return node;
        }

        ListNode fastPtr = node;
        ListNode slowPtr = node;

        while (fastPtr != null && fastPtr.next != null && fastPtr.next.next != null) {

            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }


        return slowPtr;
    }


    public ListNode merge(ListNode a, ListNode b) {
        ListNode temp = new ListNode(-1);
        ListNode finalList = temp;

        while (a != null && b != null) {

            if (a.data < b.data) {

                temp.next = a;
                a = a.next;
            } else {

                temp.next = b;
                b = b.next;
            }

            temp = temp.next;
        }

        if (a != null) {

            temp.next = a;
        }

        if (b != null) {

            temp.next = b;

        }
        return finalList.next;
    }


    public ListNode mergeSort(ListNode node) {

        if (node == null || node.next == null) {
            return node;
        }

        ListNode middle = getMiddleNode(node);
        ListNode secondHalf = middle.next;
        middle.next = null;

        return merge(mergeSort(node), mergeSort(secondHalf));
    }


    public ListNode removeDuplicatesSorted(ListNode node) {

        if (node == null || node.next == null) {
            return node;
        }

        if (node.data == node.next.data) {
            node.next = node.next.next;
            removeDuplicatesSorted(node);
        } else {

            removeDuplicatesSorted(node.next);
        }

        return node;
    }


    public static void main(String[] args) {


        RemoveDuplicatesUnsorted removeDuplicatesUnsorted = new RemoveDuplicatesUnsorted();

        ListNode head = null;

        head = removeDuplicatesUnsorted.insert(head, 17);
        head = removeDuplicatesUnsorted.insert(head, 51);
        head = removeDuplicatesUnsorted.insert(head, 28);
        head = removeDuplicatesUnsorted.insert(head, 47);
        head = removeDuplicatesUnsorted.insert(head, 68);
        head = removeDuplicatesUnsorted.insert(head, 28);

        removeDuplicatesUnsorted.print(head);

        System.out.println();

        ListNode sortedList = removeDuplicatesUnsorted.mergeSort(head);
        ListNode sortedListWithoutDuplicates = removeDuplicatesUnsorted.removeDuplicatesSorted(sortedList);

        removeDuplicatesUnsorted.print(sortedListWithoutDuplicates);


    }
}
