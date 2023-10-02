package CodingSimplifiedSep2023.LinkedList.Problem40;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class LinkedListLoop {


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


    public boolean hasLoop(ListNode node) {
        if (node == null) {
            return false;
        }

        ListNode slowPtr = node;
        ListNode fastPtr = node;

        while (fastPtr != null && fastPtr.next != null && fastPtr.next.next != null) {

            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if (slowPtr == fastPtr) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {


        LinkedListLoop linkedListLoop = new LinkedListLoop();

        ListNode head = null;

        head = linkedListLoop.insert(head, 23);
        head = linkedListLoop.insert(head, 73);
        head = linkedListLoop.insert(head, 55);
        head = linkedListLoop.insert(head, 80);
        head = linkedListLoop.insert(head, 19);

        head.next.next.next.next.next = head.next;

        System.out.println("Linked list has loop ? : " + linkedListLoop.hasLoop(head));

    }
}
