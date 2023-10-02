package CodingSimplifiedSep2023.LinkedList.Problem30;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class ListUnion {


    public ListNode middle(ListNode node) {

        ListNode fast = node;
        ListNode slow = node;

        while (fast != null && fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
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

        ListNode middle = middle(node);
        ListNode nextToMiddle = middle.next;
        middle.next = null;

        return merge(mergeSort(node), mergeSort(nextToMiddle));
    }


    public ListNode unionMerge(ListNode a, ListNode b) {

        ListNode temp = new ListNode(-1);
        ListNode finalList = temp;

        while (a != null && b != null) {

            if (a.data < b.data) {

                temp.next = a;
                a = a.next;
            } else if (b.data < a.data) {

                temp.next = b;
                b = b.next;
            } else {

                temp.next = a;
                a = a.next;
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


    public ListNode union(ListNode a, ListNode b) {

        ListNode first = mergeSort(a);
        ListNode second = mergeSort(b);

        return unionMerge(first, second);
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


        ListUnion listUnion = new ListUnion();

        ListNode head1 = null;

        head1 = listUnion.insert(head1, 13);
        head1 = listUnion.insert(head1, 8);
        head1 = listUnion.insert(head1, 7);
        head1 = listUnion.insert(head1, 18);


        listUnion.print(head1);
        ListNode head2 = null;
        System.out.println();
        head2 = listUnion.insert(head2, 45);
        head2 = listUnion.insert(head2, 8);
        head2 = listUnion.insert(head2, 7);
        head2 = listUnion.insert(head2, 33);
        head2 = listUnion.insert(head2, 63);

        listUnion.print(head2);

        ListNode union = listUnion.union(head1, head2);

        System.out.println();
        listUnion.print(union);


    }
}
