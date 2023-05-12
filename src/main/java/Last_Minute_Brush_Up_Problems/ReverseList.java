package Last_Minute_Brush_Up_Problems;

public class ReverseList {


    public ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
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


        ReverseList reverseList = new ReverseList();
        ListNode reverse = reverseList.reverse(one);
        reverseList.print(reverse);
    }
}
