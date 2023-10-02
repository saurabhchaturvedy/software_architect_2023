package CodingSimplifiedSep2023.LinkedList.Problem30;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class LowestCommonIntersection {


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


    public ListNode getLowestCommonIntersection(ListNode a, ListNode b) {

        ListNode temp = new ListNode(-1);
        ListNode finalList = temp;

        a = mergeSort(a);
        b = mergeSort(b);

        while (a != null && b != null) {

            if (a.data < b.data) {
                a = a.next;
            } else if (b.data < a.data) {
                b = b.next;
            } else {

                temp = a;
                temp.next = null;
                return temp;
            }
        }

        return null;
    }


    public ListNode insert(ListNode node, int data) {

        if (node == null) {
            return new ListNode(data);
        } else {

            node.next = insert(node.next, data);
        }

        return node;
    }


    public static void main(String[] args) {


        LowestCommonIntersection lowestCommonIntersection = new LowestCommonIntersection();

        ListNode head1 = null;

        head1 = lowestCommonIntersection.insert(head1, 10);
        head1 = lowestCommonIntersection.insert(head1, 20);
        head1 = lowestCommonIntersection.insert(head1, 30);
        head1 = lowestCommonIntersection.insert(head1, 45);

        ListNode head2 = null;

        head2 = lowestCommonIntersection.insert(head2, 17);
        head2 = lowestCommonIntersection.insert(head2, 30);
        head2 = lowestCommonIntersection.insert(head2, 20);
        head2 = lowestCommonIntersection.insert(head2, 45);

        ListNode lowestCommonIntersect = lowestCommonIntersection.getLowestCommonIntersection(head1, head2);

        System.out.println(" Lowest common intersection is : " + lowestCommonIntersect.data);
    }
}
