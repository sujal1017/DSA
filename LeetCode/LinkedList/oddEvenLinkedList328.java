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

public class oddEvenLinkedList328 {
    public ListNode Solution(ListNode head){
        if(head == null){
            return null;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = even.next;

            even.next = odd.next;
            even = odd.next;
        }
        odd.next = evenHead;
        return head;
    }

    public void printList(ListNode head){
        while(head != null){
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        oddEvenLinkedList328 obj = new oddEvenLinkedList328();

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

        System.out.println("Odd Even Linked List:");
        obj.printList(head);
    }
    
}
