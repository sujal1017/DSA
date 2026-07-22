import java.util.LinkedList;
import java.util.Queue;

public class numberOfRecentCalls933 {
    Queue<Integer> queue;
    public numberOfRecentCalls933(){
        queue = new LinkedList<>();
    }
    public int ping(int t){
        queue.offer(t);
        while(!queue.isEmpty() && queue.peek()<t-3000){
            queue.poll();
        }
        return queue.size();
    }
    public static void main(String[] args) {
        numberOfRecentCalls933 obj = new numberOfRecentCalls933();

        System.out.println(obj.ping(1));      // 1
        System.out.println(obj.ping(100));    // 2
        System.out.println(obj.ping(3001));   // 3
        System.out.println(obj.ping(3002)); 
    }
}
