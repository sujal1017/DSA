public class printReverse{
    public void print(int current,int n){
        if(current>n){
            return;
        }
        print(current+1,n);
        System.out.println(current);
    }
    public static void main(String[] args) {
        printReverse obj = new printReverse();
        obj.print(1, 5);
    }
}