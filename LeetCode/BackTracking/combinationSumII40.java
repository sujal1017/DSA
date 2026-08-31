
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSumII40{
    public List<List<Integer>> Solution(int[] candidates,int target){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(candidates,target,ans,new ArrayList<>(),0);
        return ans;
    }
    public void backTrack(int [] candidates,int target,List<List<Integer>> ans,List<Integer> current,int ind){
        if(target == 0){
            ans.add(new ArrayList<>(current));
        }
        for(int i=ind;i<candidates.length;i++){
            if(i>ind && candidates[i] == candidates[i-1]){
            continue;
            }
            if(candidates[i]>target){
                break;
            }
            current.add(candidates[i]);
            backTrack(candidates, target-candidates[i], ans, current, i + 1);
            current.remove(current.size() - 1);
        }
    }
    public static void main(String[] args) {
        combinationSumII40 obj = new combinationSumII40();
        int [] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> result = new ArrayList<>();
        result = obj.Solution(candidates, target);
        System.out.println(result);
    }
}