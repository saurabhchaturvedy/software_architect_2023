package CodingSimplifiedSep2023.LinkedList.Problem30;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class DeleteMNodesAfterNNodes {


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


    public ListNode deleteNNodesAfterMNodes(ListNode node, int n, int m) {

        if (node == null) {
            return node;
        }

        ListNode temp1 = node;
        ListNode temp2 = node;

        int i = 0;
        int j = 0;

        while (i < m - 1) {
            temp1 = temp1.next;
            i++;
        }

        temp2 = (m == 0) ? temp1 : temp1.next;


        while (j < n) {

            if (temp2 == null) {
                System.out.println("no nodes to delete : ");
                return null;
            }

            temp2 = temp2.next;
            j++;
        }


        if (m == 0) {
            return temp2;
        } else {

            temp1.next = temp2;
        }


        return node;
    }


    public static void main(String[] args) {


        DeleteMNodesAfterNNodes deleteMNodesAfterNNodes = new DeleteMNodesAfterNNodes();

        ListNode head = null;

        head = deleteMNodesAfterNNodes.insert(head, 12);
        head = deleteMNodesAfterNNodes.insert(head, 18);
        head = deleteMNodesAfterNNodes.insert(head, 24);
        head = deleteMNodesAfterNNodes.insert(head, 30);
        head = deleteMNodesAfterNNodes.insert(head, 36);
        head = deleteMNodesAfterNNodes.insert(head, 42);
        head = deleteMNodesAfterNNodes.insert(head, 48);
        head = deleteMNodesAfterNNodes.insert(head, 56);

        deleteMNodesAfterNNodes.print(head);

        System.out.println();

        ListNode listAfterRemovingNodes = deleteMNodesAfterNNodes.deleteNNodesAfterMNodes(head, 3, 4);

        System.out.println();

        deleteMNodesAfterNNodes.print(listAfterRemovingNodes);


    }
}
