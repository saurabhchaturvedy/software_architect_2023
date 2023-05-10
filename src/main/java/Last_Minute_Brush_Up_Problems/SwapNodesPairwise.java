package Last_Minute_Brush_Up_Problems;

public class SwapNodesPairwise {


    public void print(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public ListNode swapNodes(ListNode head) {


        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode point = dummy;

        // 1 - 2 - 3 - 4
        while (point.next != null && point.next.next != null) {

            ListNode temp1 = point.next;
            ListNode temp2 = point.next.next;


            temp1.next = temp1.next.next;
            temp2.next = temp1;

            point.next = temp2;
            point = temp1;

        }

        return dummy.next;
    }


    public static void main(String[] args) {

        ListNode one = new ListNode(10);
        ListNode two = new ListNode(20);
        ListNode three = new ListNode(30);
        ListNode four = new ListNode(40);

        one.next = two;

        two.next = three;

      //  three.next = four;

        SwapNodesPairwise swapNodesPairwise = new SwapNodesPairwise();
        swapNodesPairwise.print(one);

        System.out.println("After Swapping of nodes :: ");

        ListNode swappedListNodes = swapNodesPairwise.swapNodes(one);
        swapNodesPairwise.print(swappedListNodes);
    }
}
