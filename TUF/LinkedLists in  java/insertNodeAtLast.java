public class insertNodeAtLast {
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
        while(current!=null){
            System.out.println(current.data + " ");
            current=current.next;
        }
        System.out.println( );
    }
    public static Node insertNode(Node head,int val){
        Node temp = head;
        if(head==null){
            return new Node(val);
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode = new Node(val);
        temp.next=newNode;
        return head;
        
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        Node head = createLLNode(arr);
        System.out.println("Original Linked list");
        traversal(head);

        System.out.println("After inserting the last Node to the linked list ");
        head = insertNode(head,7);
        traversal(head);
    }
    
}
