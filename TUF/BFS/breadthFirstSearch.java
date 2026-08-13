import java.util.LinkedList;
import java.util.Queue;

public class breadthFirstSearch{
    public void Solution(int [][]graph,int start){
        int n = graph.length;
        boolean [] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int node = q.poll();
            System.out.println(node + " ");
            for(int neighbout : graph[node]){
                if(!visited[neighbout]){
                    visited[neighbout] = true;
                    q.add(neighbout);
                }
            }
        }
    }
    public static void main(String[] args) {
        breadthFirstSearch obj = new breadthFirstSearch();
        int [][] graph ={
            {1,2},
            {0,3},
            {0,3},
            {1,2},
        };
        obj.Solution(graph,0);
        
    }
}