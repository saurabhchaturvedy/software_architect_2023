package CodingSimplifiedSep2023.LinkedList.Problem20;

import CodingSimplifiedSep2023.LinkedList.ListNode;

public class MergeList {


    public ListNode merge(ListNode a, ListNode b) {

        ListNode temp = new ListNode(-1);
        ListNode finalList = temp;

        while (a != null && b != null) {

            if (a.data < b.data) {

                temp.next = a;
                a = a.next;
            } else if (b.data < a.data) {

                temp.next = b;
                b = b.next;

            } else {

                temp.next = a;
                a = a.next;
                b = b.next;
            }

            temp = temp.next;
        }

        temp.next = (a == null) ? b : a;
        return finalList.next;
    }

    public static void main(String[] args) {

    }
}
