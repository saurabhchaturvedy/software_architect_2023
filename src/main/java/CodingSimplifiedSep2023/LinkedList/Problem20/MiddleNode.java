package CodingSimplifiedSep2023.LinkedList.Problem20;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class MiddleNode {


    public ListNode middle(ListNode node) {

        if (node == null) {
            return node;
        }

        ListNode fast = node;
        ListNode slow = node;

        while (fast != null && fast.next != null && fast.next.next!=null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
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

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


    public static void main(String[] args) {


        MiddleNode middleNode = new MiddleNode();

        ListNode root = null;

        root = middleNode.insert(root,14);
        root = middleNode.insert(root,19);
        root = middleNode.insert(root,23);

        middleNode.print(root);

        System.out.println(" Middle node is : "+middleNode.middle(root).data);
    }
}
