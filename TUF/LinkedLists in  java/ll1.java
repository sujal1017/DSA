public class ll1 {
    public static void main(String[] args){
        int [] arr = {5,3,6,1};
        Node obj = new Node(arr[0]);
        System.out.println(obj.data);
    }
    
}

class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data=data;
        this.next=next;
    }

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
