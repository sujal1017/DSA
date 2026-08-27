import java.util.Arrays;
import java.util.PriorityQueue;

public class maximumSubsequenceScore2542{
    public long Solution(int[]nums1,int[] nums2,int k){
        int n = nums1.length;
        int [][]arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = nums1[i];
            arr[i][1] = nums2[i];
        }
        Arrays.sort(arr,(a,b) -> b[1] - a[1]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long ans = 0;
        long sum = 0;
        for(int i=0;i<n;i++){ 
            int num1 = arr[i][0];
            int num2 = arr[i][1];

            pq.offer(num1);
            sum += num1;

            if(pq.size()>k){
                sum -= pq.poll();
            }
            if(pq.size() == k){
                ans = Math.max(ans, sum * num2);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        maximumSubsequenceScore2542 obj = new maximumSubsequenceScore2542();
        int [] nums1 = {1,3,3,2};
        int [] nums2 = {2,1,3,4};
        int k = 3;
        long ans = obj.Solution(nums1, nums2, k);
        System.out.println(ans);
    }
}