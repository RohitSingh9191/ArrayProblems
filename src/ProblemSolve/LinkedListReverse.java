package ProblemSolve;

public class LinkedListReverse {

    // Make it static so we can access inside main
    static class ListNode {

        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // Reverse method
    public static ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;      // store next
            current.next = prev;     // reverse link
            prev = current;         // move prev
            current = next;        // move current
        }

        return prev;   // new head
    }

    public static void main(String[] args) {

        // Create linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        //     while (head != null) {
        //     System.out.print(head.value + " ");
        //     head = head.next;
        // }
        // Call reverse method (same class)
        ListNode newHead = reverse(head);\

        // Print reversed list
        while (newHead != null) {
            System.out.print(newHead.value + " ");
            newHead = newHead.next;
        }
    }
}