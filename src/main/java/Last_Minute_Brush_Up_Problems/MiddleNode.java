package Last_Minute_Brush_Up_Problems;

public class MiddleNode {


    public ListNode middleNode(ListNode head) {

        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        return slowPtr;
    }


    public static void main(String[] args) {

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        MiddleNode middleNode = new MiddleNode();
        System.out.println(" middle node is :: " + middleNode.middleNode(one).data);

        ListNode onex = new ListNode(1);
        ListNode twox = new ListNode(2);
        ListNode threex = new ListNode(3);
        ListNode fourx = new ListNode(4);
        ListNode fivex = new ListNode(5);
        ListNode sixx = new ListNode(6);


        onex.next = twox;
        twox.next = threex;
        threex.next = fourx;
        fourx.next = fivex;
        fivex.next = sixx;

        System.out.println(" middle node is :: " + middleNode.middleNode(onex).data);
    }
}
