public class findPivotIndex724{
    public int Solution(int [] nums){
        int n = nums.length;
        int left = 0;
        int total = 0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        for(int i=0;i<n;i++){
            if(left == total-left-nums[i]){
                return i;
            }
            else{
                left+=nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        findPivotIndex724 obj = new findPivotIndex724();
        int[] nums = {1,7,3,6,5,6};
        System.out.println(obj.Solution(nums));
    }
}