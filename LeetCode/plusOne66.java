public class plusOne66{
    public int[] Solution(int[] digits){
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int [] num = new int [digits.length+1];
        num[0]=1;   
        return num;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,9};
        plusOne66 obj = new plusOne66();
        int [] result = obj.Solution(nums);
        
        for(int n:result){
            System.out.print(n + " ");
        }


    }

}