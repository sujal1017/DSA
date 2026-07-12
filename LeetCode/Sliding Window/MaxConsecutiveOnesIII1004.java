public class MaxConsecutiveOnesIII1004 {
    public int Solution(int [] nums, int k){
        int n = nums.length;
        int max = 0;
        int left = 0;
        int right = 0;
        int count = 0;
        while(right<n){
            if(nums[right] == 0){
                count++;
            }
            while(count>k){
                if(nums[left] == 0){
                    count--;
                }
                left++;
            }

            max = Math.max(max,right-left+1);
            right++;
        }
        return max;
    }   
    public static void main(String[] args) {
        MaxConsecutiveOnesIII1004 obj = new MaxConsecutiveOnesIII1004();
        int [] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(obj.Solution(nums, k));
    }
}
