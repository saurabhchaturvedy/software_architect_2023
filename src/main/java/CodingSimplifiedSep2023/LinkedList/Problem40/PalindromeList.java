package CodingSimplifiedSep2023.LinkedList.Problem40;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class PalindromeList {


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

    public boolean isPalindrome(ListNode node) {

        if (node == null) {
            return false;
        }

        ListNode slowPtr = node;
        ListNode fastPtr = node;

        while (fastPtr != null && fastPtr.next != null && fastPtr.next.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        if (fastPtr != null) {
            slowPtr = slowPtr.next;
        }

        slowPtr = reverse(slowPtr);
        fastPtr = node;

        while (slowPtr != null) {
            if (slowPtr.data != fastPtr.data) {
                return false;
            }

            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }

        return true;
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

        PalindromeList palindromeList = new PalindromeList();

        ListNode head = null;

        head = palindromeList.insert(head, 1);
        head = palindromeList.insert(head, 2);
        head = palindromeList.insert(head, 3);
        head = palindromeList.insert(head, 66);
        head = palindromeList.insert(head, 3);
        head = palindromeList.insert(head, 2);
        head = palindromeList.insert(head, 1);

        palindromeList.print(head);

        System.out.println(" Is linked list a palindrome ?? :: " + palindromeList.isPalindrome(head));
    }
}
