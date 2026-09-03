import java.util.Arrays;

public class countingBits338{
    public int[] Solution(int n){
        int [] arr = new int [n+1];
        for(int i=0;i<n+1;i++){
            if(i%2 != 0){
                arr[i] = arr[i/2] + 1;
            }
            else{
                arr[i] = arr[i/2];
            }
        }
        return arr;
    }
    public static void main(String [] args){
        int n =  5;
        countingBits338 obj = new countingBits338();
        int [] result = obj.Solution(n);
        System.out.println(Arrays.toString(result));
    }
}