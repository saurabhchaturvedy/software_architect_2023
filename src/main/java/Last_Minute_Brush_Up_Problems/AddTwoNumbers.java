package Last_Minute_Brush_Up_Problems;

public class AddTwoNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode ptr = dummy;

        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = 0 + carry;

            if (l1 != null) {
                sum = sum + l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum = sum + l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum = sum % 10;
            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }

        if (carry == 1) ptr.next = new ListNode(1);

        return dummy.next;
    }


    public void print(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }


    public static void main(String[] args) {

        ListNode one = new ListNode(2);
        ListNode two = new ListNode(4);
        ListNode three = new ListNode(3);

        ListNode four = new ListNode(5);
        ListNode five = new ListNode(6);
        ListNode six = new ListNode(4);

        one.next = two;
        two.next = three;

        four.next = five;
        five.next = six;

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode listNode = addTwoNumbers.addTwoNumbers(one, four);
        addTwoNumbers.print(listNode);
    }
}
