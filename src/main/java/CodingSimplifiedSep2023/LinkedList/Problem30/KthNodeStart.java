package CodingSimplifiedSep2023.LinkedList.Problem30;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class KthNodeStart {


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


    public ListNode kthNodeFromStart(ListNode node, int k) {

        if (node == null || k <= 0) {
            return node;
        }

        ListNode current = node;
        int count = 1;

        while (count < k) {
            current = current.next;
            count++;
        }

        return current;
    }


    public static void main(String[] args) {


        KthNodeStart kthNodeStart = new KthNodeStart();

        ListNode head = null;

        head = kthNodeStart.insert(head, 14);
        head = kthNodeStart.insert(head, 17);
        head = kthNodeStart.insert(head, 9);
        head = kthNodeStart.insert(head, 44);
        head = kthNodeStart.insert(head, 32);
        head = kthNodeStart.insert(head, 22);
        head = kthNodeStart.insert(head, 29);

        kthNodeStart.print(head);

        System.out.println(" Kth node from start is : " + kthNodeStart.kthNodeFromStart(head, 4).data);
    }
}
