
import java.util.HashMap;

public class largestSubArrayWithSumZero {
    public int Solution (int[] nums){
        HashMap<Integer,Integer> ans = new HashMap<>();
        int n=nums.length;
        int sum = 0;
        int maxi = 0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum == 0){
                maxi = i + 1;
            }
            if(ans.containsKey(sum)){
                maxi = Math.max(maxi, i-ans.get(sum));
            }else{
                ans.put(sum, i);
            }
        }

        return maxi;
    }
    public static void main(String[] args) {
        int [] arr = {-1,1,0,5,-4,1,2,1};
        largestSubArrayWithSumZero obj = new  largestSubArrayWithSumZero();
        System.out.println(obj.Solution(arr));
    }
    
}
