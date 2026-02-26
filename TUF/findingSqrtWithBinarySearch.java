public class findingSqrtWithBinarySearch {
    public int Solution(int n){
        // int n = nums.length;
        int low=0;
        int high = n;
        int ans=-1;
        while(low<=high){
            int mid  = (low+high)/2;
            if (mid * mid == n) {
                return mid;   // perfect square
            }

            else if(mid*mid<=n){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // int [] arr = {1,2,3,4,5,6,7};
        int n = 78;
        findingSqrtWithBinarySearch obj = new findingSqrtWithBinarySearch();
        System.out.println("Sqrt of the num " + n + " = " + obj.Solution(n));
    }
}
