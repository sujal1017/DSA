import java.util.ArrayList;
import java.util.List;

public class combinationSumIII216{
    public List<List<Integer>> Solution(int k,int n){
        List<List<Integer>> ans = new ArrayList<>();
        backTrack(1,9,k,n,ans,new ArrayList<>());
        return ans;
    }
    public void backTrack(int start,int end,int k,int target, List<List<Integer>> ans,List<Integer> current){
        if(target == 0 && current.size() == k){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i=start;i<=end;i++){
            current.add(i);
            backTrack(i+1, end, k, target - i, ans, current);
            current.remove(current.size() - 1);
        }
    }
    public static void main(String[] args) {
        combinationSumIII216 obj = new combinationSumIII216();
        List<List<Integer>> ans = new ArrayList<>();
        int k = 3;
        int n = 7;
        ans = obj.Solution(k, n);
        System.out.println(ans);

    }
}