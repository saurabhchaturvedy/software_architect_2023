package Fundamentals.DoublyLinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {


    ListNode head;
    ListNode tail;

    int length;

    private static class ListNode
    {
        int data;
        ListNode prev;
        ListNode next;

        ListNode(int data)
        {
            this.data=data;
        }
    }

    public void printForward()
    {
        if(head==null)
        {
            return;
        }

        ListNode temp = head;

        while (temp!=null)
        {

            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }

    }

    public boolean isEmpty()
    {
        return length==0;
    }


    public void printBackward()
    {
        if(head==null)
        {
            return;
        }

        ListNode temp = tail;

        while (temp!=null)
        {

            System.out.print(temp.data+" -> ");
            temp=temp.prev;
        }

    }


    public void insertFirst(int data)
    {
        ListNode newNode = new ListNode(data);
        if(isEmpty())
        {
            tail = newNode;
        }
        else {
            head.prev = newNode;
        }

        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertEnd(int data)
    {
        ListNode newNode = new ListNode(data);

        if(isEmpty())
        {
            head = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
        }

        tail=newNode;
        length++;
    }

    public void insertAtIndex(int data,int index)
    {
        ListNode newNode = new ListNode(data);
        ListNode current = head;
        if(index==0)
        {
            insertFirst(data);
        } else if (index==length) {
            insertEnd(data);
        }
        else {
            for(int i=0; i<index; i++)
            {
                current=current.next;
            }

            current.next = newNode;
            current.prev.next = newNode;
            newNode.prev = current.prev;
            current.prev = newNode;
            length++;
        }
    }

    public ListNode deleteFirst()
    {

        if(isEmpty())
        {
            throw new NoSuchElementException();
        }

        ListNode temp = head;

        if(head==tail)
        {
            tail=null;
        }
        else {
            head.next.prev=null;
        }

        head = head.next;
        temp.next=null;
        length--;
        return temp;
    }


    public ListNode deleteLast()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }

        ListNode temp = tail;

        if(head==tail)
        {
            head=null;
        }
        else {
            tail.prev.next=null;
        }

        tail=tail.prev;
        temp.prev=null;
        length--;
        return temp;
    }

    public static void main(String[] args) {

        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.head = new ListNode(10);

        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        linkedList.head.next = second;
        second.prev = linkedList.head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        linkedList.tail = fourth;

        linkedList.printForward();

        System.out.println();
        linkedList.printBackward();

        linkedList.insertFirst(33);

        System.out.println();
        linkedList.printForward();

        System.out.println();
        //linkedList.insertEnd(76);
        System.out.println();

        linkedList.printForward();

        linkedList.deleteFirst();

        System.out.println();
        linkedList.printForward();

        linkedList.deleteLast();

        System.out.println();

        linkedList.printForward();
    }
}
