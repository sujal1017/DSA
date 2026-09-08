public class fibonacci {
    public int Solution(int n){
        if(n<=1){
            return n;
        }
        return Solution(n-1) + Solution(n-2);
    }    
    public static void main(String[]args){
        fibonacci obj = new fibonacci();
        int n = 7;
        System.out.println(obj.Solution(n));
    }
}
