package Brainstormed_Questions_Garage;

public class AddTwoNumbersNormal {


    public ListNode addTwoNumbers(ListNode first, ListNode second) {

        ListNode fakeHead = new ListNode(0);
        ListNode p1 = reverse(first);
        ListNode p2 = reverse(second);
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

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return reverse(fakeHead.next);
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


    public ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
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

    public static void main(String[] args) {

        ListNode head1 = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);

        head1.next = second;
        second.next = third;

        ListNode head2 = new ListNode(5);
        ListNode fourth = new ListNode(9);
        ListNode fifth = new ListNode(1);

        head2.next = fourth;
        fourth.next = fifth;

        AddTwoNumbersNormal addTwoNumbersNormal = new AddTwoNumbersNormal();
        ListNode addedNumber = addTwoNumbersNormal.addTwoNumbers(head1, head2);

        addTwoNumbersNormal.printList(addedNumber);
    }
}
