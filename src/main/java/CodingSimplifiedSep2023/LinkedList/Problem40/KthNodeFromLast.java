package CodingSimplifiedSep2023.LinkedList.Problem40;

import CodingSimplifiedSep2023.LinkedList.ListNode;

import java.util.NoSuchElementException;

public class KthNodeFromLast {


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


    public ListNode kthNodeFromLast(ListNode node, int k) {
        if (node == null || k <= 0) {
            return null;
        }

        int count = 0;

        ListNode refPtr = node;
        ListNode mainPtr = node;

        while (count < k) {
            if (refPtr == null) {
                throw new NoSuchElementException("No such elemnt");
            }

            refPtr = refPtr.next;
            count++;
        }


        while (refPtr != null) {

            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }

        return mainPtr;
    }


    public static void main(String[] args) {

        KthNodeFromLast kthNodeFromLast = new KthNodeFromLast();

        ListNode head = null;

        head = kthNodeFromLast.insert(head, 20);
        head = kthNodeFromLast.insert(head, 8);
        head = kthNodeFromLast.insert(head, 16);
        head = kthNodeFromLast.insert(head, 57);
        head = kthNodeFromLast.insert(head, 33);
        head = kthNodeFromLast.insert(head, 39);
        head = kthNodeFromLast.insert(head, 45);
        head = kthNodeFromLast.insert(head, 87);

        kthNodeFromLast.print(head);

        ListNode listNode = kthNodeFromLast.kthNodeFromLast(head, 1);

        System.out.println();

        System.out.println(" Kth node from last is : " + listNode.data);

    }
}
