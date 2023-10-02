package CodingSimplifiedSep2023.LinkedList.Problem30;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class MergeSortedList {


    public ListNode mergeSortedList(ListNode a, ListNode b) {

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


        MergeSortedList mergeSortedList = new MergeSortedList();

        ListNode root = null;

        root = mergeSortedList.insert(root, 10);
        root = mergeSortedList.insert(root, 20);
        root = mergeSortedList.insert(root, 30);


        mergeSortedList.print(root);

        ListNode root2 = null;

        root2 = mergeSortedList.insert(root2, 9);
        root2 = mergeSortedList.insert(root2, 18);
        root2 = mergeSortedList.insert(root2, 22);

        System.out.println();

        mergeSortedList.print(root2);

        ListNode mergedList = mergeSortedList.mergeSortedList(root, root2);

        System.out.println();
        mergeSortedList.print(mergedList);
    }
}
