package CodingSimplifiedSep2023.LinkedList.Problem50;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class CountOccurence {


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


    public int countOccurence(ListNode node, int data) {
        if (node == null) {
            return -1;
        }

        ListNode current = node;
        int count = 0;

        while (current != null) {

            if (current.data == data) {
                count++;
            }

            current = current.next;
        }

        return count;
    }

    public static void main(String[] args) {


        CountOccurence countOccurence = new CountOccurence();

        ListNode root = null;

        root = countOccurence.insert(root, 34);
        root = countOccurence.insert(root, 18);
        root = countOccurence.insert(root, 45);
        root = countOccurence.insert(root, 18);
        root = countOccurence.insert(root, 66);
        root = countOccurence.insert(root, 18);

        countOccurence.print(root);

        System.out.println();

        System.out.println("Occurence count of 18 is : " + countOccurence.countOccurence(root, 18));
    }
}
