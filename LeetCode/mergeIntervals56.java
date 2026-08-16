
import java.util.ArrayList;
import java.util.Arrays;

public class mergeIntervals56{
    public int [][] Solution(int [][] intervals){
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        int n = intervals.length;
        ArrayList<int[]> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(ans.isEmpty()){
                ans.add(intervals[i]);
            }
            else{
                int [] last = ans.get(ans.size() -1);
                if(intervals[i][0] <= last[1]){
                    last[1] = Math.max(last[1],intervals[i][1]);
                }
                else{
                    ans.add(intervals[i]);
                }
            }
        }
        return ans.toArray(new int [ans.size()][]);
    }
    public static void main(String[] args) {
        mergeIntervals56 obj = new mergeIntervals56();
        int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int [][]ans = obj.Solution(intervals);
        System.out.println(Arrays.deepToString(ans));
    }
}