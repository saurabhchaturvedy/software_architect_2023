package Fundamentals.CircularLinkedList;

import java.util.NoSuchElementException;

public class CircularLinkedList {


    ListNode last;
    int length;

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }


    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void createCircularLinkedList() {
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);


        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = first;

        last = fifth;
    }


    public void display() {
        if (last == null) {
            return;
        }

        ListNode first = last.next;

        while (first != last) {
            System.out.print(first.data + " --> ");
            first = first.next;
        }
        System.out.println(first.data);
    }

    public int size() {
        if (last == null) {
            return 0;
        }

        int length = 1;
        ListNode first = last.next;

        while (first != last) {
            first = first.next;
            length++;
        }

        return length;
    }

    public void insertFirst(int data) {
        ListNode temp = new ListNode(data);

        if (last == null) {
            last = temp;
        } else {
            temp.next = last.next;
        }

        last.next = temp;
        length++;

    }


    public void insertLast(int data) {
        ListNode temp = new ListNode(data);

        if (last == null) {
            last = temp;
            last.next = temp;
        } else {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
    }


    public ListNode removeFirst() {

        if (isEmpty()) {
            throw new NoSuchElementException("no node in the list");
        }

        ListNode temp = last.next;
        if (last.next == last) {
            last = null;
        } else {

            last.next = temp.next;

        }

        temp.next = null;
        length--;


        return temp;
    }


    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.createCircularLinkedList();
        circularLinkedList.display();


        System.out.println("size of circular linked list is : " + circularLinkedList.size());

        circularLinkedList.insertFirst(78);
        circularLinkedList.display();
    }
}
