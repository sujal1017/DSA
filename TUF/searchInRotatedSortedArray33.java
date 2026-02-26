public class searchInRotatedSortedArray33 {
    public int search(int [] nums,int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                return mid;
            }   
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int [] arr = {7,8,9,1,2,3,4,5,6};
        searchInRotatedSortedArray33 obj = new searchInRotatedSortedArray33();
        int target = 1;
        int result = obj.search(arr, target);
        if (result != -1) {
            System.out.println("Target " + target + " found at index: " + result);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }   
}