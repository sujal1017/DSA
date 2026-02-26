public class findFirstLastPositionOfSortedArray34 {
    public int first(int [] nums,int target){
        int n = nums.length;
        int low=0;
        int high=n-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high) / 2;
            if(nums[mid]==target){
                ans=mid;
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }

    public int last(int [] nums,int target){
        int n = nums.length;
        int low=0;
        int high=n-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high) / 2;
            if(nums[mid]==target){
                ans=mid;
                low=mid+1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,4,4,5,6};
        int n = 4;
        findFirstLastPositionOfSortedArray34 obj = new findFirstLastPositionOfSortedArray34();
        int firstind = obj.first(arr, n);
        int lastind = obj.last(arr, n);
        System.out.println(firstind + " " + lastind + " "); 
    }
    
}
