package FundamentalsSep2023.Stack;

import java.util.EmptyStackException;

public class Stack {


    ListNode top;
    int length;


    Stack() {
        this.top = null;
        this.length = 0;
    }

    private static class ListNode {
        int data;
        ListNode next;

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


    public void push(int data) {
        ListNode temp = new ListNode(data);

        temp.next = top;
        top = temp;
        length++;
    }


    public int pop() {

        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int result = top.data;

        top = top.next;
        length--;

        return result;
    }


    public void display() {

        if (top == null) {
            return;
        }

        ListNode current = top;

        while (current != null) {

            System.out.print(current.data + " ");
            current = current.next;
        }
    }


    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(13);
        stack.push(20);
        stack.push(8);

        stack.display();

        stack.pop();

        System.out.println();

        stack.display();
    }
}
