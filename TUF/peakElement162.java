public class peakElement162 {
    public int Solution(int [] nums){
        int n = nums.length;
        int low=0;
        int high=n-1;
        while(low<high){
            int mid = (low+high)/2;
            if(nums[mid]>nums[mid+1]){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 4, 2};
        peakElement162 obj = new peakElement162();
        int result = obj.Solution(arr);
        System.out.println("The peak element is " + arr[result] + " at index " + result);
    }
}
