package CodingSimplifiedSep2023.LinkedList.Problem30;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class FlattenMultiLevelSortedList {


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

        finalList.next.right = null;
        return finalList.next;
    }


    public ListNode flatten(ListNode node) {

        if (node == null || node.right == null) {
            return node;
        }

        return merge(node, flatten(node.right));
    }


    public static void main(String[] args) {


        FlattenMultiLevelSortedList flattenMultiLevelSortedList = new FlattenMultiLevelSortedList();

        ListNode head1 = null;

        head1 = flattenMultiLevelSortedList.insert(head1, 20);
        head1 = flattenMultiLevelSortedList.insert(head1, 22);
        head1 = flattenMultiLevelSortedList.insert(head1, 25);
        head1 = flattenMultiLevelSortedList.insert(head1, 65);
        head1 = flattenMultiLevelSortedList.insert(head1, 70);

        ListNode head2 = null;

        head2 = flattenMultiLevelSortedList.insert(head2, 7);
        head2 = flattenMultiLevelSortedList.insert(head2, 12);
        head2 = flattenMultiLevelSortedList.insert(head2, 23);
        head2 = flattenMultiLevelSortedList.insert(head2, 34);

        ListNode head3 = null;

        head3 = flattenMultiLevelSortedList.insert(head3, 10);
        head3 = flattenMultiLevelSortedList.insert(head3, 15);
        head3 = flattenMultiLevelSortedList.insert(head3, 17);
        head3 = flattenMultiLevelSortedList.insert(head3, 18);
        head3 = flattenMultiLevelSortedList.insert(head3, 21);
        head3 = flattenMultiLevelSortedList.insert(head3, 33);

        ListNode head4 = null;

        head4 = flattenMultiLevelSortedList.insert(head4, 32);
        head4 = flattenMultiLevelSortedList.insert(head4, 39);
        head4 = flattenMultiLevelSortedList.insert(head4, 40);


        head1.right = head2;
        head2.right = head3;
        head3.right = head4;


        ListNode flattenedList = flattenMultiLevelSortedList.flatten(head1);

        flattenMultiLevelSortedList.print(flattenedList);

    }
}
