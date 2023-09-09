package FundamentalsSep2023.SinglyLinkedList;

public class SinglyLinkedList {


    public void print(ListNode head) {
        if (head == null) {
            return;
        }

        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }


    public int length(ListNode head) {
        if (head == null) {
            return 0;
        }

        ListNode current = head;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }


    public ListNode addToHead(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
        return head;
    }


    public ListNode addToLast(ListNode head, int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head = newNode;
            return head;
        }

        ListNode current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        return head;
    }


    public ListNode insertAtPosition(ListNode head, int position, int data) {

        ListNode newNode = new ListNode(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        ListNode current = head;
        int count = 1;

        while (count < position - 1) {
            count++;
            current = current.next;
        }

        ListNode temp = current.next;
        newNode.next = temp;
        current.next = newNode;


        return head;
    }


    public ListNode deleteFirst(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode temp = head;
        head = head.next;
        temp.next = null;

        return head;
    }


    public ListNode deleteLast(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        previous.next = null;
        return head;
    }


    public ListNode deleteFromPosition(ListNode head, int position) {
        if (position == 0 && (head == null || head.next == null)) {
            return head;
        }

        if (position == 0) {
            ListNode temp = head;
            head = head.next;
            temp.next = null;
            return head;
        }

        ListNode current = head;
        ListNode previous = null;
        int count = 0;

        while (count < position - 1) {
            count++;
            previous = current;
            current = current.next;
        }

        ListNode temp = current.next;
        previous.next = temp;
        temp.next = null;
        return head;
    }


    public boolean search(ListNode head, int data) {
        if (head == null) {
            return false;
        }

        ListNode current = head;

        while (current != null) {
            if (current.data == data) {
                return true;
            }

            current = current.next;
        }

        return false;
    }


    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }


    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        return slowPtr;
    }


    public static void main(String[] args) {

        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);

        head.next = second;
        second.next = third;

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.print(head);
        System.out.println("Middle node is = " + singlyLinkedList.middleNode(head).data);
        System.out.println();

        System.out.println("Length of the linked list is ::: " + singlyLinkedList.length(head));

        ListNode newHead = singlyLinkedList.addToHead(head, 75);

        singlyLinkedList.print(newHead);

        ListNode lastNode = singlyLinkedList.addToLast(newHead, 15);

        System.out.println();
        singlyLinkedList.print(lastNode);

        System.out.println();

        ListNode nodeInBetween = singlyLinkedList.insertAtPosition(lastNode, 4, 4000);

        singlyLinkedList.print(nodeInBetween);

        ListNode deletedFirstNode = singlyLinkedList.deleteFirst(nodeInBetween);

        System.out.println();

        System.out.println("Linked list after deletion ::::");
        singlyLinkedList.print(deletedFirstNode);


        singlyLinkedList.deleteLast(deletedFirstNode);

        System.out.println();

        singlyLinkedList.print(deletedFirstNode);


        ListNode deletedFromPosition = singlyLinkedList.deleteFromPosition(deletedFirstNode, 3);

        System.out.println();

        singlyLinkedList.print(deletedFromPosition);


        System.out.println(" Is element present ? :::: " + singlyLinkedList.search(deletedFirstNode, 20));


        ListNode reverse = singlyLinkedList.reverse(head);

        System.out.println();

        System.out.println("Linked list after reversing ::: ");

        singlyLinkedList.print(reverse);

        System.out.println();


    }
}
