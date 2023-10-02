package CodingSimplifiedSep2023.LinkedList.Problem40;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class DeleteList {

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


    public ListNode deleteList(ListNode node) {
        node = null;
        return node;
    }


    public static void main(String[] args) {

        DeleteList deleteList = new DeleteList();

        ListNode head = null;

        head = deleteList.insert(head, 1);
        head = deleteList.insert(head, 2);
        head = deleteList.insert(head, 3);

        deleteList.print(head);

        ListNode deletedList = deleteList.deleteList(head);

        System.out.println();

        deleteList.print(deletedList);
    }
}
