package CodingSimplifiedSep2023.LinkedList.Problem40;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class LinkedListRemoveLoop {


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


    public ListNode removeLinkedListLoop(ListNode node) {
        if (node == null) {
            return null;
        }

        ListNode slowPtr = node;
        ListNode fastPtr = node;

        while (fastPtr != null && fastPtr.next != null && fastPtr.next.next != null) {

            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if (slowPtr == fastPtr) {
                removeLoop(node, slowPtr, fastPtr);
                break;
            }
        }

        return null;
    }

    private void removeLoop(ListNode node, ListNode slowPtr, ListNode fastPtr) {

        if (fastPtr == node) {

            while (slowPtr.next != fastPtr) {

                slowPtr = slowPtr.next;
            }

            slowPtr.next = null;
        } else {

            slowPtr = node;

            while (slowPtr.next != fastPtr.next) {

                slowPtr = slowPtr.next;
            }

            fastPtr.next = null;
        }
    }

    public static void main(String[] args) {


        LinkedListRemoveLoop a = new LinkedListRemoveLoop();
        ListNode head = null;
        head = a.insert(head, 12);
        head = a.insert(head, 99);
        head = a.insert(head, 37);
        head = a.insert(head, 5);
        head = a.insert(head, 25);

        head.next.next.next.next.next = head.next;

        a.removeLinkedListLoop(head);

        a.print(head);

    }
}
