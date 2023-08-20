package Brainstormed_Questions_Garage;

public class AddTwoNumbers {


    public ListNode addTwoNumbers(ListNode first, ListNode second) {

        ListNode fakeHead = new ListNode(0);
        ListNode p1 = first;
        ListNode p2 = second;
        ListNode current = fakeHead;
        int carry = 0;

        while (p1 != null || p2 != null) {

            int x = (p1 != null) ? p1.data : 0;
            int y = (p2 != null) ? p2.data : 0;

            int sum = x + y + carry;

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if (p1 != null) {
                p1 = p1.next;
            }

            if (p2 != null) {
                p2 = p2.next;
            }
        }

        if (carry == 1) {
            current.next = new ListNode(1);
        }

        return fakeHead.next;
    }


    public void printList(ListNode head) {
        if (head == null) {
            return;
        }

        ListNode current = head;

        while (current != null) {

            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }


    public static void main(String[] args) {

        ListNode head1 = new ListNode(2);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(3);

        head1.next = second;
        second.next = third;

        ListNode head2 = new ListNode(5);
        ListNode fourth = new ListNode(6);
        ListNode fifth = new ListNode(4);

        head2.next = fourth;
        fourth.next = fifth;

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode addedNumber = addTwoNumbers.addTwoNumbers(head1, head2);

        addTwoNumbers.printList(addedNumber);
    }
}
