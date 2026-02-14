public class insertNodeBeforeValue {
    static class Node{
        int data;
        Node next;
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node createLLNode(int [] arr){
        if(arr.length==0){
            return null;
        }
        Node head = new Node(arr[0]);
        Node current = head;
        for(int i=1;i<arr.length;i++){
            current.next=new Node (arr[i]);
            current=current.next;
        }
        
        return head;
    }
    public static void traversal(Node head){
        Node current = head;
        while(current != null){
            System.out.println(current.data + " ");
            current=current.next;
        }
        System.out.println( );
    }
    public static Node insertBeforeValue(int val, Node head, int ele) {
       if (head == null) return null;

       if (head.data == val) {
           return new Node(ele, head);
        }

       Node temp = head;
       while (temp != null && temp.next != null) {
           if (temp.next.data == val) {
               Node x = new Node(ele, temp.next);
               temp.next = x;
               break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,7};
        Node head = createLLNode(arr);
        System.out.println("Original Linked list");
        traversal(head);
        System.out.println("After inserting the k Node to the linked list ");
        head = insertBeforeValue(5, head, 4);
        traversal(head);
        

    }

    
}
