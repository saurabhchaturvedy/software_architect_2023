package Last_Minute_Brush_Up_Problems;

import java.util.Stack;

public class ReverseListStack {


    public ListNode reverse(ListNode head) {

        Stack<Integer> listNodeStack = new Stack<>();

        while (head != null) {
            listNodeStack.push(head.data);
            head = head.next;
        }

        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode ptr = dummy;

        while (!listNodeStack.isEmpty()) {
            ptr.next = new ListNode(listNodeStack.pop());
            ptr = ptr.next;
        }

        return dummy.next;
    }


    public void print(ListNode head) {
        if (head == null) {
            return;
        }

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);

        one.next = two;
        two.next = three;
        three.next = four;

        ReverseListStack reverseListStack = new ReverseListStack();
        reverseListStack.print(one);

        ListNode reverse = reverseListStack.reverse(one);

        System.out.println();

        reverseListStack.print(reverse);
    }
}
