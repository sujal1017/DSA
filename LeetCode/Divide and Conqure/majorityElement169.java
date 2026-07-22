public class majorityElement169 {
    public int Solution(int [] nums){
        int candidate = nums[0];
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(i == candidate){
                count++;
            }
            else{
                count--;
                if(count == 0){
                    candidate = i;
                    count++;
                }
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        int [] nums = {2,2,1,1,1,2,2};
        majorityElement169 obj = new majorityElement169();
        System.out.println(obj.Solution(nums));
    }
}
