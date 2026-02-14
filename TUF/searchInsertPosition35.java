public class searchInsertPosition35{
    public int Solution(int [] nums, int target){
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = n;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid]>=target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,5};
        int n = 3;
        searchInsertPosition35 obj = new searchInsertPosition35();
        int ans = obj.Solution(arr, n);
        System.out.println(ans);
    }
    
}