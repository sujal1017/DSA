import java.util.ArrayList;
import java.util.List;

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

public class maximumTwinSumOfLinkedList2130 {
    public int Solution(ListNode head){
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        int sum = 0;
        int n = list.size();
        for(int i=0;i<n/2;i++){
            sum = Math.max(sum,list.get(i) + list.get(n-1-i));
        }
        return sum;
    }

    public void printList(ListNode head){
        while(head != null){
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");

    }   
    
    public static void main(String[] args) {
        maximumTwinSumOfLinkedList2130 obj = new maximumTwinSumOfLinkedList2130();
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        // Connect the nodes
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        // Head of the linked list
        ListNode head = first;

        System.out.println("Original Linked List:");
        obj.printList(head);

        // Find maximum twin sum
        int answer = obj.Solution(head);

        System.out.println("Maximum Twin Sum: " + answer);
    }
    
}
