public class deleteKEle{
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
        
        public static Node createLinkedList(int [] arr){
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
        public static void traversal(Node head) {
            Node current = head;
            while(current != null){
            System.out.println(current.data + " ");
            current=current.next;
            }
            System.out.println( );  
        }

        public static Node deleteKEle(int k,Node head){
            
            if(head == null){
                return head;
            }
            if(k == 1){
                Node current = head;
                return head;
            }
            int count = 0;
            Node prev = null;
            Node current = head;
           while (current != null && count < k) {

            prev = current;
            current = current.next;
            count++;
            }

            // If k is greater than the length of the list
            if (current == null) {
                System.out.println("k is larger than the length of the list.");
                return head;
            }

            // Delete the k-th node
            prev.next = current.next;

            return head;
            }

        public static void main(String[] args) {
            int [] arr = {1,2,3,4,5};
            Node head = createLinkedList(arr);
            
            System.out.println("Original linked list");
            traversal(head);
            int k=2;
            
            System.out.println("After deleting the k element");
            head = deleteKEle(k, head);
            traversal(head);
        }

    
}