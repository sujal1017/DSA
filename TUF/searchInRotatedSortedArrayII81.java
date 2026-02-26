public class searchInRotatedSortedArrayII81{
    public boolean search(int []nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high) / 2;
            if(nums[mid] == target) return true;

            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {2,5,6,0,0,1,2};
        int target = 0;
        searchInRotatedSortedArrayII81 obj = new searchInRotatedSortedArrayII81();
        boolean result=obj.search(arr,target);
        System.out.println("Target found ?\n" + result);

    }
}