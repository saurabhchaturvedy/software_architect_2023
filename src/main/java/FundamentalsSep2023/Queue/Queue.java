package FundamentalsSep2023.Queue;

import java.util.NoSuchElementException;

public class Queue {


    ListNode front;
    ListNode rear;
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


    public int dequeue() {

        if (isEmpty()) {
            throw new NoSuchElementException("No element present !!");
        }

        int result = front.data;

        front = front.next;

        if (front == null) {
            rear = null;
        }

        return result;
    }


    public void print() {
        if (front == null) {
            return;
        }

        ListNode temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.enqueue(34);
        queue.enqueue(13);
        queue.enqueue(12);
        queue.enqueue(88);


        queue.print();

        System.out.println();

        queue.dequeue();

        queue.print();


    }
}
