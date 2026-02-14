public class bestTimeToBuySellStock121 {
    public int Solution(int[] prices) {
        int p = prices.length;
        int cost = 0;
        int profit = 0;
        int min = prices[0];

        for (int i = 0; i < p; i++) {
            cost = prices[i] - min;
            profit = Math.max(profit, cost);
            min = Math.min(min, prices[i]);
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        bestTimeToBuySellStock121 ans = new bestTimeToBuySellStock121();
        int best = ans.Solution(arr);
        System.out.println("The best profit you can get is: " + best);
    }
}
