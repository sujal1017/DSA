
import java.util.HashMap;

public class equalRowAndColumnPairs2352 {
    public int Solution(int[][] grid){
        int count = 0;
        int n = grid.length;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(grid[i][j]).append(",");
            }
            String row = sb.toString();
            if(map.containsKey(row)){
                map.put(row,map.get(row)+1);
            }
            else{
                map.put(row,1);
            }
        }
        for(int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(grid[j][i]).append(",");
            }
            String col = sb.toString();
            if(map.containsKey(col)){
                count+=map.get(col);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        equalRowAndColumnPairs2352 obj = new equalRowAndColumnPairs2352();
        int [][] grid = {{3,2,1},{1,7,6},{2,7,7}};
        System.out.println(obj.Solution(grid));
    }
}
