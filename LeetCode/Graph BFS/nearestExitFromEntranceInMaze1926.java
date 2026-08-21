import java.util.LinkedList;
import java.util.Queue;

public class nearestExitFromEntranceInMaze1926 {
    public int Solution(char[][]maze,int [] entrance){
        int rows = maze.length;
        int cols = maze[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{entrance[0],entrance[1],0});
        maze[entrance[0]][entrance[1]] = '+';
        int [][]dir = {
            {0,1},
            {1,0},
            {-1,0},
            {0,-1},
        };
        while(!q.isEmpty()){
            int [] current = q.poll();
            int row = current[0];
            int col = current[1];
            int dist = current[2];
        
            for(int [] d : dir){
                int nr = row + d[0];
                int nc = col + d[1];
                if(nr>=0 && nr<rows && nc>=0 && nc<rows && maze[nr][nc] == '.'){
                    if(nr == 0 || nr == rows-1 || nc == 0 || nc == cols-1){
                        return dist + 1;
                    }
                    maze[nr][nc] = '+';
                    q.offer(new int[]{nr,nc,dist + 1});
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        nearestExitFromEntranceInMaze1926 obj = new nearestExitFromEntranceInMaze1926();
        char[][]maze = {
            {'+', '+', '.', '+'},
            {'.', '.', '.', '+'},
            {'+', '+', '+', '.'},
        };
        int [] entrance = {1,2};
        int ans = obj.Solution(maze, entrance);
        System.err.println(ans);
    }
}
