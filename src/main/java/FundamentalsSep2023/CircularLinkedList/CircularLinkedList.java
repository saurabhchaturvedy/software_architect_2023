package FundamentalsSep2023.CircularLinkedList;

public class CircularLinkedList {


    ListNode last;


    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }


    public void print() {
        if (last == null) {
            return;
        }

        ListNode first = last.next;

        while (first != last) {
            System.out.print(first.data + " -> ");
            first = first.next;
        }
        System.out.print(first.data);
    }


    public int length() {
        if (last == null) {
            return 0;
        }

        ListNode first = last.next;
        int count = 1;

        while (first != last) {
            count++;
            first = first.next;
        }

        return count;
    }

    public void createCircularLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }


    public void addAtFront(int data) {
        ListNode newNode = new ListNode(data);
        if (last == null) {
            last = newNode;
        } else {

            ListNode temp = last.next;
            last.next = newNode;
            newNode.next = temp;
        }
    }

    public void addAtLast(int data) {
        ListNode newNode = new ListNode(data);

        if (last == null) {
            last = newNode;
            last.next = last;
        } else {

            ListNode first = last.next;
            last.next = newNode;
            newNode.next = first;
            last = newNode;
        }
    }


    public static void main(String[] args) {


        CircularLinkedList circularLinkedList = new CircularLinkedList();

        circularLinkedList.createCircularLinkedList();

        circularLinkedList.print();

        System.out.println();

        System.out.println("Length of circular linked list is :::: " + circularLinkedList.length());

        System.out.println();

        circularLinkedList.addAtFront(56);

        circularLinkedList.print();

        System.out.println();

        circularLinkedList.addAtLast(33);

        circularLinkedList.print();
    }
}
