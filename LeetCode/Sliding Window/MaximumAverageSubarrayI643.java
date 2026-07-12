public class MaximumAverageSubarrayI643{
    public double slidingWindow(int [] nums, int k){
        int n = nums.length;
        int current = 0;
        for(int i=0;i<k;i++){
            current += nums[i];
        }
        int max = current;
        for(int i=1;i<n-k;i++){
            current = current - nums[i-1] + nums[i+k-1];
            if(current > max){
                max = current;
            }
        }
        return (double)max/4;
    }
    public static void main(String[] args) {
        MaximumAverageSubarrayI643 obj = new MaximumAverageSubarrayI643();
        int [] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(obj.slidingWindow(nums, k));
    }   
}
