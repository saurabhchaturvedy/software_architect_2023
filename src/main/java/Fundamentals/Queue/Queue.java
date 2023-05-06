package Fundamentals.Queue;

import java.util.List;

public class Queue {


    ListNode front;
    ListNode rear;
    int length;


    private class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }


    Queue() {

        front = null;
        rear = null;
        length = 0;
    }


    public int length() {
        return length;
    }


    public boolean isEmpty() {
        return length == 0;
    }


    public static void main(String[] args) {

    }
}
