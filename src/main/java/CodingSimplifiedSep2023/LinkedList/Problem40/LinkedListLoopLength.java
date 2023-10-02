package CodingSimplifiedSep2023.LinkedList.Problem40;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class LinkedListLoopLength {


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


    public int loopLength(ListNode node) {
        if (node == null) {
            return -1;
        }

        ListNode slowPtr = node;
        ListNode fastPtr = node;

        int length = 0;

        while (fastPtr != null && fastPtr.next != null && fastPtr.next.next != null) {

            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if (slowPtr == fastPtr) {
                length = getLoopLength(slowPtr, fastPtr);
                break;
            }
        }

        return length;
    }

    private int getLoopLength(ListNode slowPtr, ListNode fastPtr) {

        int count = 0;

        while (slowPtr.next != fastPtr) {

            slowPtr = slowPtr.next;
            count++;
        }

        return count;
    }


    public static void main(String[] args) {

        ListNode head = null;

        LinkedListLoopLength linkedListLoopLength = new LinkedListLoopLength();

        head = linkedListLoopLength.insert(head, 23);
        head = linkedListLoopLength.insert(head, 73);
        head = linkedListLoopLength.insert(head, 55);
        head = linkedListLoopLength.insert(head, 80);
        head = linkedListLoopLength.insert(head, 19);

        head.next.next.next.next.next = head.next;

        System.out.print(" Length of the loop : " + linkedListLoopLength.loopLength(head));
    }
}
