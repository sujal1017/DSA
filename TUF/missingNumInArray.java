public class missingNumInArray{
    public int Solution(int [] nums){
        int n = nums.length;
        int sum=(n*(n+1))/2;
        int sum2=0;
        for (int i = 0; i < n; i++) {
            sum2+=nums[i];
        }
        return sum-sum2;
    }
    public static void main(String[] args) {
        missingNumInArray Miss = new missingNumInArray();
        int [] arr = {0,1,2,4,5};
        int missing = Miss.Solution(arr);
        System.out.println("Missing number is " + missing);

    }
    
}

