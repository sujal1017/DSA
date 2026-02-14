public class convertArr2Ll {
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
    Node mover = head;
    
    for(int i=1;i<arr.length;i++){
        Node temp = new Node(arr[i]);
        mover.next=temp;
        mover=temp;
    }
    return head;
}

public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,6};
    Node head = createLinkedList(arr);
    System.out.println(head.data);
}
}