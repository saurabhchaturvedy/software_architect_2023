package Fundamentals.Queue;

import java.util.List;
import java.util.NoSuchElementException;

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


    public void enqueue(int data) {
        ListNode temp = new ListNode(data);

        if (isEmpty()) {
            front = temp;
        } else {
            rear.next = temp;
        }

        rear = temp;
        length++;
    }


    public void print() {

        if (isEmpty()) {
            return;
        }

        ListNode current = front;

        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }

        System.out.println("null");
    }


    public int dequeue() {

        if (isEmpty()) {
            throw new NoSuchElementException("Queue is already empty !!");
        }

        int result = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }

        length--;
        return result;
    }


    public static void main(String[] args) {


        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(25);

        queue.print();


        queue.dequeue();

        queue.print();
    }
}
