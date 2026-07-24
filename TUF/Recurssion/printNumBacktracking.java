public class printNumBacktracking {
    public void print(int current){
        if(current == 0){
            return;
        }
        print(current-1);
        System.out.println(current);

    }
    public static void main(String[] args) {
        printNumBacktracking obj = new printNumBacktracking();
        obj.print(5);
    }
    
}
