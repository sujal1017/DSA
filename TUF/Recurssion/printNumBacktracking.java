public class printNumBacktracking {
    public void print(int current,int n){
        if(current == 0){
            return;
        }
        print(current-1,n);
        System.out.println(current);

    }
    public static void main(String[] args) {
        printNumBacktracking obj = new printNumBacktracking();
        obj.print(5, 5);
    }
    
}
