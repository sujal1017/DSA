public class printSumN {
    public void print(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        print(n-1, sum+n);
    }
    public static void main(String[] args) {
        printSumN obj = new printSumN();
        obj.print(5, 0);
    }
}
