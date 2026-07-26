
import java.util.Arrays;
import java.util.HashMap;

public class twoSum1{
    public int[] Solution(int [] nums,int target){
        int n = nums.length;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int compliment = target - nums[i];
            if(map.containsKey(compliment)){
                return new int []{map.get(compliment),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        twoSum1 obj = new twoSum1();
        System.out.println(Arrays.toString(obj.Solution(nums, target)));
    }
}