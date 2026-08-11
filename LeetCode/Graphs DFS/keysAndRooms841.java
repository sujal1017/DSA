import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class keysAndRooms841{
    public boolean Solution(List<List<Integer>> rooms){
        int n = rooms.size();
        boolean [] visited = new boolean[n];
        dfs(0,rooms,visited);
        for(int i=0;i<n;i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;
    }
    public void dfs(int room, List<List<Integer>> rooms, boolean [] visited){
        if(visited[room]){
            return;
        }
        visited[room] = true;
        for(int keys : rooms.get(room)){
            dfs(keys,rooms,visited);
        }
    }
    public static void main(String[] args) {
        keysAndRooms841 obj = new keysAndRooms841();
        List<List<Integer>> rooms = new ArrayList<>();

        rooms.add(Arrays.asList(1));
        rooms.add(Arrays.asList(2));
        rooms.add(Arrays.asList(3));
        rooms.add(Arrays.asList());

        boolean result = obj.Solution(rooms);

        System.out.println(result);

    }
}