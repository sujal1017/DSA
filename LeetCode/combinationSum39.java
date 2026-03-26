import java.util.ArrayList;
import java.util.List;

public class combinationSum39 {
    public List<List<Integer>> combinationSum(int [] arr, int target){
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0,arr,target,ans,new ArrayList<>());
        return ans;
    }

    public void findCombinations(int ind,int[] arr,int target,List<List<Integer>> ans, List<Integer> ds){
        if(ind == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind]<=target){
            ds.add(arr[ind]);
            findCombinations(ind, arr, target-arr[ind], ans, ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(ind+1, arr, target, ans, ds);
    }
    public static void main(String[] args) {
        int [] array = {2,4,5};
        int target = 10;

        combinationSum39 obj = new combinationSum39();

        List<List<Integer>> result = obj.combinationSum(array, target);

        System.out.println(result);

    }
        
}
