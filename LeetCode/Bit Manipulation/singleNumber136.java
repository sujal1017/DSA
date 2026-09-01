public class singleNumber136{
    public int Solution(int [] nums){
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans ^= nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        singleNumber136 obj = new singleNumber136();
        int [] nums = {1,2,3,2,1,};
        System.out.println(obj.Solution(nums));
    }
}