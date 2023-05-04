package Fundamentals.SinglyLinkedList;

public class SinglyLinkedList {


    private ListNode head;

    private static class ListNode
    {
        int data;
        ListNode next;

        ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void print()
    {
        ListNode temp = head;
        while (temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int length()
    {
      ListNode temp = head;
      int count=0;
      while (temp!=null)
      {
          temp=temp.next;
          count++;
      }

      return count;
    }


    public void insertFirst(int data)
    {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int data)
    {
        ListNode newNode = new ListNode(data);
        if(head==null) {
            head = newNode;
            return;
        }

        ListNode temp = head;

        while (temp.next!=null)
        {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void insertAtPosition(int data,int position)
    {
        ListNode newNode = new ListNode(data);
        if(position==0)
        {
            newNode.next=head;
            head=newNode;
        }
        else {
            ListNode previous = head;
            int count=0;

            while (count<position-1)
            {
                previous=previous.next;
                count++;
            }

            ListNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;
        }
    }


    public void deleteFirst()
    {
        ListNode next = head.next;
        head.next = null;
        head = next;
    }

    public ListNode deleteLast()
    {
        if(head==null || head.next==null)
        {
            return head;
        }

            ListNode current = head;
            ListNode previous = null;

            while (current.next!=null)
            {
                previous=current;
                current=current.next;
            }

            previous.next=null;
            return current;
        }


    public void deleteAtPosition(int position)
    {

        if(position==0)
        {
            ListNode temp = head.next;
            head.next = null;
            head=temp;
        }
        else {
            ListNode previous=head;
            int count=0;

            while (count<position-1)
            {
                previous=previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = current.next;
            current.next = null;
        }
    }

    public boolean find(int data)
    {
        if(head==null)
        {
            return false;
        }

        ListNode temp = head;

        while (temp!=null)
        {
            if(temp.data==data)
            {
                return true;
            }
            temp=temp.next;
        }

        return false;
    }


    public ListNode reverse()
    {
        if(head==null)
        {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current!=null)
        {

            next=current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }


    public ListNode middleNode()
    {
        if(head==null)
        {
            return null;
        }

        ListNode fastPtr=head;
        ListNode slowPtr=head;

        while (fastPtr!=null && fastPtr.next!=null)

        {

            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
        }

        return slowPtr;
    }


    public ListNode nthNodeFromEnd(int n)
    {
        if(head==null)
        {
            return null;
        }

        if(n<=0)
        {
            throw new RuntimeException("n is not a valid input");
        }

        ListNode mainPtr = head;
        ListNode refPtr = head;

        int count=0;

        while (count<n)
        {
            if(refPtr==null)
            {
                throw new RuntimeException("n value is grater that length of linked list");

            }
            count++;
            refPtr = refPtr.next;

        }

        while (refPtr!=null)
        {
            refPtr=refPtr.next;
            mainPtr=mainPtr.next;
        }

        return mainPtr;
    }

    public void insertSorted(int data)
    {
        ListNode newNode = new ListNode(data);
        if(head==null)
        {
            return;
        }

        ListNode temp = head;
        while (temp!=null)
        {
            if(temp.data<=data && data<=temp.next.data)
            {

               ListNode tempRef = temp.next;
               temp.next = newNode;
               newNode.next = tempRef;
               tempRef=null;
            }
            temp=temp.next;
        }
    }


    public void removeKey(int data)
    {

        if(head==null)
        {
            return;
        }

        ListNode temp = head;

        while (temp.next!=null)
        {
            if(temp.next.data==data)
            {
                temp.next = temp.next.next;
            }

            temp=temp.next;
        }
    }

    public boolean containsLoop()
    {
        ListNode slowPtr=head;
        ListNode fastPtr=head;

        while (fastPtr!=null && fastPtr.next!=null)
        {
            fastPtr=fastPtr.next.next;
            slowPtr=slowPtr.next;

            if(slowPtr==fastPtr)
            {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);

        linkedList.head.next = second;
        second.next=third;

        linkedList.print();

        System.out.println("linked list size is : "+linkedList.length());

        linkedList.insertFirst(56);

        linkedList.print();

        linkedList.insertSorted(15);

        linkedList.print();
        linkedList.removeKey(20);
        linkedList.print();

        linkedList.insertLast(80);

        linkedList.print();

        linkedList.insertAtPosition(75,3);

        linkedList.print();

        linkedList.deleteFirst();

        linkedList.print();

        linkedList.deleteAtPosition(2);

        linkedList.print();

        System.out.println("Element is present ? : "+linkedList.find(35));


        ListNode reverse = linkedList.reverse();

        linkedList.head=reverse;

        linkedList.print();

        System.out.println("middle node is : "+linkedList.middleNode().data);

        System.out.println("3rd node from end is : "+linkedList.nthNodeFromEnd(3).data);
    }
}
