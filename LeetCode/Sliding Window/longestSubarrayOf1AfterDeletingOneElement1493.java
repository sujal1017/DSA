public class longestSubarrayOf1AfterDeletingOneElement1493{
    public int Solution(int [] nums){
        int n = nums.length;
        int prev = 0;
        int current = 0;
        int ans = 0;
        for(int i = 0;i < n;i++){
            if(nums[i] == 1){
                current++;
            }
            else{
                ans = Math.max(ans,prev+current);
                prev = current;
                current = 0;
            }
            if(ans == n){
                return n-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {0,1,1,1,0,1,1,0,1};
        longestSubarrayOf1AfterDeletingOneElement1493 obj = new longestSubarrayOf1AfterDeletingOneElement1493();
        System.out.println(obj.Solution(nums));
    }
}