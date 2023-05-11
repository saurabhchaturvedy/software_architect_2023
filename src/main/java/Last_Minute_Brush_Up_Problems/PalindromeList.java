package Last_Minute_Brush_Up_Problems;

public class PalindromeList {


    public boolean isPalindrome(ListNode head) {

        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        if (fastPtr != null) // handling odd number of nodes scenario
        {
            slowPtr = slowPtr.next;
        }


        slowPtr = reverse(slowPtr);
        fastPtr = head;

        while (slowPtr != null) {

            if (slowPtr.data != fastPtr.data) {
                return false;
            }

            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head) {


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

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(2);
        ListNode five = new ListNode(1);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        PalindromeList palindromeList = new PalindromeList();

        System.out.println(" is palindrome ?? " + palindromeList.isPalindrome(one));
    }
}
