package FundamentalsSep2023.DoublyLinkedList;

public class DoublyLinkedList {


    ListNode head;
    ListNode tail;

    int length = 0;


    private static class ListNode {
        int data;
        ListNode next;
        ListNode previous;

        ListNode(int data) {
            this.data = data;
        }
    }


    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }


    public static void main(String[] args) {

    }
}
