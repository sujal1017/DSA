public class deleteHead {
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

    public static Node createLinkNode(int [] arr){
        if(arr.length == 0){
            return null;
        }
        Node head = new Node(arr[0]);
        Node current = head;

        for(int i=1;i<arr.length;i++){
            current.next=new Node(arr[i]);
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
    public static Node removeHead(Node head){
        if(head == null){
            return head;
        }
        head = head.next;
        return head;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        Node head = createLinkNode(arr);

        System.out.println("Original Linked List:");
        traversal(head);

        head = removeHead(head);   // ✅ update head

        System.out.println("After deleting head:");
        traversal(head);
    }
}
