package CodingSimplifiedSep2023.LinkedList.Problem70;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class InsertNodeIntoMiddle {


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


    public ListNode insertNodeIntoMiddle(ListNode node, int data) {
        ListNode fast = node;
        ListNode slow = node;

        while (fast != null && fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newNode = new ListNode(data);
        ListNode temp = slow.next;
        slow.next = newNode;
        newNode.next = temp;

        return node;
    }

    public static void main(String[] args) {


        InsertNodeIntoMiddle insertNodeIntoMiddle = new InsertNodeIntoMiddle();

        ListNode root = null;

        root = insertNodeIntoMiddle.insert(root, 12);
        root = insertNodeIntoMiddle.insert(root, 7);
        root = insertNodeIntoMiddle.insert(root, 13);
        root = insertNodeIntoMiddle.insert(root, 22);
        root = insertNodeIntoMiddle.insert(root, 8);

        insertNodeIntoMiddle.print(root);
        System.out.println();

        ListNode listNode = insertNodeIntoMiddle.insertNodeIntoMiddle(root, 100);

        insertNodeIntoMiddle.print(listNode);
    }
}
