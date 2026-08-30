
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

public class mergeTwoSortedLists21{
    public ListNode Solution(ListNode list1,ListNode list2){
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val < list2.val){
            list1.next = Solution(list1.next, list2);
            return list1;
        }
        else{
            list2.next = Solution(list1, list2.next);
            return list2;
        }
    }

    public void printList(ListNode head){
        while(head != null){
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        mergeTwoSortedLists21 obj = new mergeTwoSortedLists21();

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // list2: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        ListNode result = obj.Solution(list1, list2);

        System.out.println("null");

    }
}