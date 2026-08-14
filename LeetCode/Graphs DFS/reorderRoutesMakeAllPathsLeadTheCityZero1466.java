import java.util.ArrayList;

public class reorderRoutesMakeAllPathsLeadTheCityZero1466 {
    public int Solution(int n, int [][] connections){
        boolean [] visited = new boolean[n];
        ArrayList<int[]> [] graph = new ArrayList[n];
        for(int i =0; i<n; i++){
            graph[i] = new ArrayList<>();
        }
        for(int [] road : connections){
            int a = road[0];
            int b = road[1];
            graph[a].add(new int[]{b,1});
            graph[b].add(new int[]{a,0});
        }
        return dfs(0,visited,graph);
    }
    public int dfs(int city,boolean [] visited,ArrayList<int[]> [] graph){
        visited[city] = true;
        int count = 0;
        for(int [] edge : graph){
            int nextCity = edge[0];
            int cost = edge[1];
            if(!visited[nextCity]){
                count += cost;
                count += dfs(nextCity, visited, graph)
            }
        }
        return count;
    }
    public static void main(String[] args) {
        reorderRoutesMakeAllPathsLeadTheCityZero1466 obj = new reorderRoutesMakeAllPathsLeadTheCityZero1466();
        int n = 6;

        int[][] connections = {
                {0, 1},
                {1, 3},
                {2, 3},
                {4, 0},
                {4, 5}
        };

        int result = obj.Solution(n, connections);

        System.out.println("Minimum reversals: " + result);
    }
    
}
