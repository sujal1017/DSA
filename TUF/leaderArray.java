
import java.util.ArrayList;
import java.util.Collections;

public class leaderArray {
    public int[] Solution(int[] nums){
        ArrayList <Integer> ans = new ArrayList<>();
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(nums[i]>maxi){
                ans.add(nums[i]);
                maxi=nums[i];
            }
        }
        Collections.reverse(ans);

        int [] result = new int [ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
        return result;

    }
    public static void main(String[] args) {
        int [] arr = {16,17,4,3,5,2};
        leaderArray obj = new leaderArray();
        int []newAns = obj.Solution(arr);
        for(int num : newAns){
            System.out.print(num + "  ");
        }
    }
    
}
