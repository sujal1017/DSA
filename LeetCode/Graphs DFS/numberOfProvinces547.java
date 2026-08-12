public class numberOfProvinces547{
    public int Solution(int [][] isConnected){
        int n = isConnected.length;
        boolean [] visited = new boolean[n];
        int provinces = 0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                provinces++;
                dfs(i,isConnected,visited);
            }
        }
        return provinces;
    }
    public void dfs(int city,int [][] isConnected, boolean [] visited){
        visited[city] = true;
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[city][j] == 1 && !visited[j]){
                dfs(j, isConnected, visited);
            }
        }
    }
    public static void main(String[] args) {
        numberOfProvinces547 obj = new numberOfProvinces547();
        int[][] isConnected = {
            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 1}
        };

        int answer = obj.Solution(isConnected);

        System.out.println("Number of Provinces: " + answer);

    }
}