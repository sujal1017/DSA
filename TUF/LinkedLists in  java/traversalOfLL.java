public class traversalOfLL {
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
        current = current .next;
    }
    return head;
}
public static void traversal(Node head){
    Node current = head;
    while(current!=null){
        System.out.println(current.data + " ");
        current=current.next;
    }
}
public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,6};
    Node head = createLinkedList(arr);
    traversal(head);
}
}

