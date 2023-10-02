package CodingSimplifiedSep2023.LinkedList.Problem40;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class DeleteNodesGreaterOnRight {


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


    public ListNode deleteNodesHavingGreaterOnRight(ListNode node) {
        if (node == null) {
            return null;
        }


        ListNode temp = reverse(node);
        int max = temp.data;

        while (temp.next != null) {
            if (temp.next.data > max) {
                max = temp.next.data;
                temp = temp.next;
            } else {

                temp = temp.next.next;
            }
        }

        temp = reverse(temp);

        return temp;
    }


    private ListNode reverse(ListNode node) {

        if (node == null || node.next == null) {
            return node;
        }

        ListNode current = node;
        ListNode next = null;
        ListNode previous = null;

        while (current != null) {

            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public static void main(String[] args) {


        DeleteNodesGreaterOnRight deleteNodesGreaterOnRight = new DeleteNodesGreaterOnRight();

        ListNode head = null;

        head = deleteNodesGreaterOnRight.insert(head, 12);
        head = deleteNodesGreaterOnRight.insert(head, 99);
        head = deleteNodesGreaterOnRight.insert(head, 8);
        head = deleteNodesGreaterOnRight.insert(head, 39);
        head = deleteNodesGreaterOnRight.insert(head, 5);

        deleteNodesGreaterOnRight.print(head);

        ListNode listNode = deleteNodesGreaterOnRight.deleteNodesHavingGreaterOnRight(head);

        deleteNodesGreaterOnRight.print(listNode);
    }
}
