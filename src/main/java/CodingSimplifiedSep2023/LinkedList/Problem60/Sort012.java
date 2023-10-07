package CodingSimplifiedSep2023.LinkedList.Problem60;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class Sort012 {


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


    public ListNode sort012(ListNode node) {

        if (node == null || node.next == null) {
            return node;
        }


        ListNode zeroDummy = new ListNode(-1);
        ListNode oneDummy = new ListNode(-1);
        ListNode twoDummy = new ListNode(-1);

        ListNode zeroTail = zeroDummy;
        ListNode oneTail = oneDummy;
        ListNode twoTail = twoDummy;

        ListNode current = node;

        while (current != null) {

            if (current.data == 0) {

                zeroTail.next = current;
                zeroTail = current;
            } else if (current.data == 1) {
                oneTail.next = current;
                oneTail = current;
            } else {

                twoTail.next = current;
                twoTail = current;
            }

            current = current.next;
        }


        zeroTail.next = oneDummy.next;
        oneTail.next = twoDummy.next;
        twoTail.next = null;

        return zeroDummy.next;
    }

    public static void main(String[] args) {

        Sort012 sort012 = new Sort012();

        ListNode root = null;

        root = sort012.insert(root, 2);
        root = sort012.insert(root, 1);
        root = sort012.insert(root, 0);
        root = sort012.insert(root, 0);
        root = sort012.insert(root, 2);
        root = sort012.insert(root, 1);
        root = sort012.insert(root, 0);
        root = sort012.insert(root, 1);

        sort012.print(root);

        ListNode listNode = sort012.sort012(root);

        System.out.println();


        sort012.print(listNode);
    }
}
