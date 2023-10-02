package CodingSimplifiedSep2023.LinkedList.Problem30;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class ListIntersection {


    public ListNode getMiddleNode(ListNode node) {
        if (node == null) {
            return node;
        }


        ListNode slowPtr = node;
        ListNode fastPtr = node;

        while (fastPtr != null && fastPtr.next != null && fastPtr.next.next != null) {

            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        return slowPtr;
    }


    public ListNode mergeWithIntersection(ListNode a, ListNode b) {

        ListNode temp = new ListNode(-1);
        ListNode finalList = temp;

        while (a != null && b != null) {

            if (a.data < b.data) {

                a = a.next;
            } else if (b.data < a.data) {

                b = b.next;
            } else {

                temp.next = a;
                temp = temp.next;
                a = a.next;
                b = b.next;
            }


        }

        temp.next = null;
        return finalList.next;
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


    public ListNode listIntersection(ListNode a, ListNode b) {

        ListNode first = mergeSort(a);
        ListNode second = mergeSort(b);

        return mergeWithIntersection(first, second);
    }


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


    public static void main(String[] args) {


        ListIntersection listIntersection = new ListIntersection();

        ListNode head1 = null;

        head1 = listIntersection.insert(head1, 15);
        head1 = listIntersection.insert(head1, 8);
        head1 = listIntersection.insert(head1, 19);
        head1 = listIntersection.insert(head1, 25);

        listIntersection.print(head1);
        System.out.println();
        ListNode head2 = null;

        head2 = listIntersection.insert(head2, 78);
        head2 = listIntersection.insert(head2, 8);
        head2 = listIntersection.insert(head2, 19);
        head2 = listIntersection.insert(head2, 78);

        listIntersection.print(head2);
        System.out.println();


        ListNode listIntersecti = listIntersection.listIntersection(head1, head2);

        System.out.println();
        listIntersection.print(listIntersecti);


    }
}
