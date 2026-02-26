public class binarySearch704 {
    public int Solution (int target, int [] nums){
        int n = nums.length;
        int low=0;
        int high = n-1;
        while(low<=high){
            int mid = (low + high) / 2;
            if(target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        binarySearch704 obj = new binarySearch704();
        System.out.println(obj.Solution(target, arr));
    }
    
}
