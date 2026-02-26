public class maximumSubarray53 {
    public int Solution(int [] nums){
        int sum=0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int [] arr = {1,5,-2,-5,7,9,1,-3,-1,2,4};
        maximumSubarray53 ans = new maximumSubarray53();
        int max = ans.Solution(arr);
        System.out.println(max);
    }
    
}
