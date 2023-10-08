package CodingSimplifiedSep2023.LinkedList.Problem60;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class MakeMiddleNodeHead {


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


    public int size(ListNode node) {

        if (node == null) {
            return 0;
        }

        ListNode current = node;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }


    public ListNode makeMiddleNodeHead(ListNode node) {

        if (node == null && node.next == null) {
            return node;
        }

        ListNode fast = node;
        ListNode slow = node;
        ListNode prev = null;

        while (fast != null && fast.next != null && fast.next.next != null) {

            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;
        slow.next = node;
        node = slow;

        return node;
    }

    public static void main(String[] args) {


        MakeMiddleNodeHead makeMiddleNodeHead = new MakeMiddleNodeHead();

        ListNode root = null;

        root = makeMiddleNodeHead.insert(root, 23);
        root = makeMiddleNodeHead.insert(root, 8);
        root = makeMiddleNodeHead.insert(root, 15);
        root = makeMiddleNodeHead.insert(root, 39);
        root = makeMiddleNodeHead.insert(root, 32);
        root = makeMiddleNodeHead.insert(root, 1);
        root = makeMiddleNodeHead.insert(root, 98);


        makeMiddleNodeHead.print(root);


        ListNode listNode = makeMiddleNodeHead.makeMiddleNodeHead(root);

        System.out.println();

        makeMiddleNodeHead.print(listNode);
    }
}
