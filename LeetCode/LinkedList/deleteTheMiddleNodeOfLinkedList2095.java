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

public class deleteTheMiddleNodeOfLinkedList2095{
    public ListNode Solution(ListNode head){
        int count = 1;
        ListNode curr = head;
        if(head == null || head.next == null){
            return null;
        }
        while(curr.next != null){
            count++;
            curr = curr.next;
        }
        curr = head;
        int mid = count/2;
        for(int i=0;i<mid-1;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
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
        deleteTheMiddleNodeOfLinkedList2095 obj = new deleteTheMiddleNodeOfLinkedList2095();

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

        System.out.println("Linked List After Deleting the Middle Element:");
        obj.printList(head);
    }
}