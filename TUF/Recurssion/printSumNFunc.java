public class printSumNFunc {
    public int function(int n) {
        if (n == 0) {
            return 0;
        }
        return n + function(n - 1);
    }
    public static void main(String[] args) {
        printSumNFunc obj = new printSumNFunc();
        System.out.println(obj.function(5));
    }
}