package CodingSimplifiedSep2023.LinkedList.Problem70;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class MergeKSortedLists {


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


    public ListNode mergeTwoSortedLists(ListNode first, ListNode second) {
        ListNode temp = new ListNode(-1);
        ListNode finalList = temp;

        while (first != null && second != null) {
            if (first.data <= second.data) {
                temp.next = first;
                first = first.next;
            } else {

                temp.next = second;
                second = second.next;
            }

            temp = temp.next;
        }

        if (first != null) {
            temp.next = first;
        }

        if (second != null) {
            temp.next = second;
        }

        return finalList.next;
    }


    public ListNode mergeKSortedLists(ListNode[] sortedLists, int k) {

        while (k != 0) {

            int i = 0;
            int j = k;
            while (i < j) {
                sortedLists[i] = mergeTwoSortedLists(sortedLists[i], sortedLists[j]);
                i++;
                j--;

                if (i >= j) {
                    k = j;
                    break;
                }

            }

        }

        return sortedLists[0];
    }

    public static void main(String[] args) {


        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();

        ListNode head1 = null;

        head1 = mergeKSortedLists.insert(head1, 1);
        head1 = mergeKSortedLists.insert(head1, 3);
        head1 = mergeKSortedLists.insert(head1, 5);
        head1 = mergeKSortedLists.insert(head1, 7);

        ListNode head2 = null;

        head2 = mergeKSortedLists.insert(head2, 2);
        head2 = mergeKSortedLists.insert(head2, 4);
        head2 = mergeKSortedLists.insert(head2, 6);
        head2 = mergeKSortedLists.insert(head2, 8);

        ListNode head3 = null;

        head3 = mergeKSortedLists.insert(head3, 0);
        head3 = mergeKSortedLists.insert(head3, 9);
        head3 = mergeKSortedLists.insert(head3, 10);
        head3 = mergeKSortedLists.insert(head3, 11);

        ListNode head4 = null;

        head2 = mergeKSortedLists.insert(head4, 12);
        head2 = mergeKSortedLists.insert(head4, 14);
        head2 = mergeKSortedLists.insert(head4, 16);
        head2 = mergeKSortedLists.insert(head4, 18);

        ListNode head5 = null;

        head5 = mergeKSortedLists.insert(head5, 0);
        head5 = mergeKSortedLists.insert(head5, 19);
        head5 = mergeKSortedLists.insert(head5, 20);
        head5 = mergeKSortedLists.insert(head5, 21);

        ListNode[] sortedLists = new ListNode[3];
        sortedLists[0] = head1;
        sortedLists[1] = head2;
        sortedLists[2] = head3;
      //  sortedLists[3] = head4;
      //  sortedLists[4] = head5;

        ListNode listNode = mergeKSortedLists.mergeKSortedLists(sortedLists, sortedLists.length - 1);

        System.out.println();
        mergeKSortedLists.print(listNode);
    }
}


