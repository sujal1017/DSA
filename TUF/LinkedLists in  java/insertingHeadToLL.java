public class insertingHeadToLL {
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
        Node current=head;

        for(int i=1;i<arr.length;i++){
            current.next=new Node(arr[i]);
            current=current.next;
        }
        return head;
    }
    public static void traversal(Node head){
        Node current = head;
        while(current!=null){
            System.out.println(current.data + " ");
            current=current.next;
        }
        System.out.println( );
    }
    public static Node insertHead(Node head,int val){
        Node temp = new Node(val,head);
        return temp;
    }

    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7};
        Node head =createLLNode(arr);

        System.out.println("Original Linked list");
        traversal(head);

        System.out.println("After inserting the head to the linked list ");
        head = insertHead(head,1);
        traversal(head);
    }
    
}
