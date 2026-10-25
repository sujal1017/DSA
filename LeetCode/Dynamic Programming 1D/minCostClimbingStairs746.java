public class minCostClimbingStairs746{
    public int Solution (int [] cost){
        int n = cost.length;
        int prev1 = cost[1];
        int prev2 = cost[0];
        for(int i=2;i<n;i++){
            int current = cost[i] + Math.min(prev1,prev2);
            prev2 = prev1;
            prev1 = current;
        }
        return Math.min(prev1, prev2);
    }
    public static void main(String[] args) {
        minCostClimbingStairs746 obj = new minCostClimbingStairs746();
        int [] cost = {10,15,20};
        int result = obj.Solution(cost);
        System.out.println(result);
    }
}