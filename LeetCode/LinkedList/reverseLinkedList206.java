class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class reverseLinkedList206{
    public ListNode Solution(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        ListNode front;
        while(temp != null){
            front = temp.next ;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }
    public static void main(String[] args) {

        reverseLinkedList206 obj = new reverseLinkedList206();

        // Create nodes
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        // Connect the nodes
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Head of the linked list
        ListNode head = first;

        System.out.println("Original Linked List:");
        obj.printList(head);

        // Reverse the list
        head = obj.Solution(head);

        System.out.println("Reversed Linked List:");
        obj.printList(head);
    }
}