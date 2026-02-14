import java.util.HashSet;
import java.util.Set;

public class longestConsecutive {
    public int Solution(int [] nums){
        int n=nums.length;
        if(n==0){
            return 0;
        }
        Set <Integer> ans = new HashSet<>();
        for(int num : nums){
            ans.add(num);
        }
        int longest=1;
        for(int num :ans){
            if(!ans.contains(num-1)){
                int currentNum=num;
                int currentLength=1;

                while(ans.contains(currentNum+1)){
                    currentLength++;
                    currentNum++;
                }
                longest=Math.max(longest,currentLength);
            }

        }
        return longest;
    }
    public static void main(String[] args) {
        int [] arr = {1,4,2,3,5,100,102,101,103};
        longestConsecutive obj = new longestConsecutive();
        int newAns = obj.Solution(arr);
        System.out.println(newAns);
    }
    
}
