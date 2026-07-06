import java.util.Arrays;
public class MaxNumberOfKSumPairs1679 {
    public int Solution(int [] nums, int k){
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        int left = 0;
        int right = n-1;
        while(left<right){
            if(nums[left] + nums[right] < k){
                left++;
            }
            else if(nums[left] + nums[right] > k){
                right--;
            }
            else{
                left++;
                right--;
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        MaxNumberOfKSumPairs1679 obj = new MaxNumberOfKSumPairs1679();
        int [] nums = {2,1,4,3,5,1,3};
        int k = 6;
        System.out.println(obj.Solution(nums, k));
    }
}
