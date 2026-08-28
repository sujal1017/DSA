import java.util.PriorityQueue;

public class totalCostToHireKWorkers2462{
    public long Solution(int [] costs,int k,int candidates){
        int n = costs.length;
        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();
        int l = 0;
        int r = n - 1;
        for(int i=0;i<candidates && l <= r;i++){
            left.offer(costs[l]);
            l++;
        }
        for(int i=0;i<candidates && l <= r;i++){
            right.offer(costs[r]);
            r--;
        }       
        long ans = 0;
        for(int i=0;i<k;i++){
            if(right.isEmpty() || (!left.isEmpty() && left.peek()<=right.peek())){
                ans += left.poll();
                if(l<=r){
                    left.offer(costs[l]);
                    l++;
                }
            }
            else{
                ans += right.poll();
                if(l<=r){
                    right.offer(costs[r]);
                    r--;
                }
            }
        } 
        return ans;
    }
    public static void main(String[] args) {
        totalCostToHireKWorkers2462 obj = new totalCostToHireKWorkers2462();
        int [] costs = {17,12,10,2,7,2,11,20,8};
        int k = 3;
        int candidates = 4;
        long ans = obj.Solution(costs, k, candidates);
        System.out.println(ans);
    }
}