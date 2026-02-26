public class subArraySumEqualsK560 {
    public int Solution(int [] nums,int k){
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int []arr = {1,2,3};
        int k=3;
        subArraySumEqualsK560 obj = new subArraySumEqualsK560();
        int ans = obj.Solution(arr, k);
        System.out.println(ans);
    }
    
}
