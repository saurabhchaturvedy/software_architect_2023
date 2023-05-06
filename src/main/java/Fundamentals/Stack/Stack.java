package Fundamentals.Stack;

import java.util.EmptyStackException;
import java.util.List;

public class Stack {


    ListNode top;
    int length;

    private class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    Stack() {
        top = null;
        length = 0;
    }

    public int length() {
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
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return top.data;
    }


    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);


        System.out.println(" top element :: " + stack.peek());


        stack.pop();

        System.out.println(" top element after popping :: " + stack.peek());
    }

}
