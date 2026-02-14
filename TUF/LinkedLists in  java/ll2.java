public class ll2 {
    public static void main(String[] args){
        int [] arr = {5,3,6,1};
        Node x = new Node(arr[0]);
        System.out.println(x.data);
    }

    static class Node {  // must be static
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}
