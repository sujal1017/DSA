public class printNum{
    public void print(int current, int n){
        if(current>n){
            return;
        }
        System.out.println(current);
        print(current + 1, n);
    }
    public static void main(String [] args){
        printNum obj = new printNum();
        obj.print(1, 5);
    }
}