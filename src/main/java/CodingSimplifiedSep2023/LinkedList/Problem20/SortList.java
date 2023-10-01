package CodingSimplifiedSep2023.LinkedList.Problem20;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class SortList {


    public ListNode middle(ListNode node) {
        if (node == null) {
            return node;
        }

        ListNode slow = node;
        ListNode fast = node;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    public ListNode mergeSort(ListNode node) {

        if (node == null || node.next == null) {
            return node;
        }

        ListNode middle = middle(node);
        ListNode secondHalf = middle.next;
        middle.next = null;

        return merge(mergeSort(node), mergeSort(secondHalf));
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

        temp.next = (a == null) ? b : a;

        return finalList.next;
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


        SortList sortList = new SortList();

        ListNode root = null;

        root = sortList.insert(root, 18);
        root = sortList.insert(root, 12);
        root = sortList.insert(root, 9);
        root = sortList.insert(root, 15);
        root = sortList.insert(root, 3);

        sortList.print(root);

        sortList.mergeSort(root);

        System.out.println();

        sortList.print(root);
    }
}
