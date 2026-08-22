
import java.util.LinkedList;
import java.util.Queue;

public class rottingOranges994 {
    public int Solution(int[][]grid){
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        int [][] dir = {
            {1,0},
            {0,1},
            {-1,0},
            {0,-1},
        };
        int minutes = 0;
        while(!q.isEmpty() && fresh>0){
            int size = q.size();
            for(int i=0;i<size;i++){
                int [] current = q.poll();
                int row = current[0];
                int col = current[1];
                for(int []d : dir){
                    int nrow = row + d[0];
                    int ncol = col + d[1];
                    if(nrow>=0 && ncol>=0 && ncol<n && nrow<m && grid[nrow][ncol] == 1){
                        grid[nrow][ncol] = 2;
                        fresh--;
                        q.offer(new int[]{nrow,ncol});
                    }
                }
            }
            minutes++;
        }
        if(fresh>0){
            return -1;
        }
        return minutes;
    }
    public static void main(String[] args) {
        rottingOranges994 obj = new rottingOranges994();
        int [][] grid = {
            {2,1,1},
            {1,1,0},
            {0,1,1},
        };
        int ans = obj.Solution(grid);
        System.out.println(ans);
    }
}
