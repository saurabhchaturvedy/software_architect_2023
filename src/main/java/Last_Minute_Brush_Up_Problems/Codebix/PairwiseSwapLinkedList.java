package Last_Minute_Brush_Up_Problems.Codebix;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class PairwiseSwapLinkedList {
    public static ListNode pairwiseSwap(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode newHead = head.next;
        ListNode prev = null;
        
        while (head != null && head.next != null) {
            ListNode nextNode = head.next.next;
            head.next.next = head;
            
            if (prev != null) {
                prev.next = head.next;
            }
            
            head.next = nextNode;
            prev = head;
            head = nextNode;
        }
        
        return newHead;
    }
    
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        System.out.println("Original linked list:");
        printLinkedList(head);
        
        ListNode newHead = pairwiseSwap(head);
        System.out.println("Linked list after pairwise swap:");
        printLinkedList(newHead);
    }
}
