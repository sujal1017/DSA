
import java.util.Arrays;

public class threeSumClosest16 {
    public int Solution(int [] nums,int target){
        int n = nums.length;
        int mindiff = Integer.MAX_VALUE;
        int closestsum = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);

        for(int k=0;k<n;k++){
            int i=k+1;
            int j=n-1;
            while(i<j){
            int sum = nums[i] + nums[j] + nums[k];
            if(sum == target){
                return sum;
            }else if(sum < target){
                i++;
            }else{
                j--;
            }
            int difftotarget = Math.abs(sum - target);
            if(difftotarget<mindiff){
                mindiff = difftotarget;
                closestsum = sum;
            }
        }
    }
        return closestsum;
    }
    public static void main(String[] args) {
        int [] arr = {-1,2,1,-4};
        int target = 1;
        threeSumClosest16 obj = new threeSumClosest16();
        int result = obj.Solution(arr, target);
        System.out.println(result);
    }
}
