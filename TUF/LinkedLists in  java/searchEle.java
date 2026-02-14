public class searchEle {
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
            current = current.next;
        }
        System.out.println();
    }
    public static boolean searchEle(int value,Node head){
        Node temp = head;
        while(temp != null){
            if(temp.data == value){
                return true;
            }
            temp=temp.next;
        }
        return false;        
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        Node head = createLinkedList(arr);

        System.out.println("Linked List:");
        traversal(head);

        int target = 4;
        if (searchEle(target, head)) {
            System.out.println("Element " + target + " found in the linked list.");
        } else {
            System.out.println("Element " + target + " not found in the linked list.");
        }
    }

}