package FundamentalsSep2023.Stack;

import java.util.EmptyStackException;

public class Stack<T> {


    ListNode<T> top;
    int length;


    Stack() {
        this.top = null;
        this.length = 0;
    }

    private static class ListNode<T> {
        T data;
        ListNode next;

        ListNode(T data) {
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


    public T pop() {

        if (isEmpty()) {
            throw new EmptyStackException();
        }

        T result = top.data;

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

        Stack<Integer> stack = new Stack<>();

        stack.push(13);
        stack.push(20);
        stack.push(8);

        stack.display();

        stack.pop();

        System.out.println();

        stack.display();
    }
}
