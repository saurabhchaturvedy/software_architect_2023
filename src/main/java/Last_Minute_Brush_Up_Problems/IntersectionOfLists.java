package Last_Minute_Brush_Up_Problems;

import java.util.List;

public class IntersectionOfLists {


    public ListNode getIntersectionPoint(ListNode first, ListNode second) {
        if (first == null && second == null) {
            return null;
        }

        // find length of both linked lists
        int lenA = length(first);
        int lenB = length(second);

        // if first list is bigger , make it move forward to bring to same start point as B
        while (lenA > lenB) {
            lenA--;
            first = first.next;
        }

        // if second list is bigger , make it move forward to bring to same start point as A
        while (lenB > lenA) {
            lenB--;
            second = second.next;
        }

        // keep on moving both the pointers now till the pointers coincide on a same node , i.e intersection point
        while (first != second) {
            first = first.next;
            second = second.next;
        }

        // return the intersection point
        return first;
    }


    public int length(ListNode head) {
        ListNode current = head;
        int length = 0;

        while (current != null) {
            length++;
            current = current.next;
        }

        return length;
    }


    public static void main(String[] args) {


        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        ListNode eight = new ListNode(8);
        ListNode nine = new ListNode(9);
        ListNode ten = new ListNode(10);
        ListNode eleven = new ListNode(11);


        ListNode six = new ListNode(6);
        ListNode seven = new ListNode(7);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = eight;
        eight.next = nine;
        nine.next = ten;
        ten.next = eleven;

        six.next = seven;
        seven.next = eight;


        IntersectionOfLists intersectionOfLists = new IntersectionOfLists();
        ListNode intersectionPoint = intersectionOfLists.getIntersectionPoint(first, six);

        System.out.println("Intersection point is : " + intersectionPoint.data);


    }
}
