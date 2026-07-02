public class productofArrayExceptSelf238 {
    // public int [] productOfArrayExceptSelf(int [] nums){
    //     int n = nums.length;
    //     int [] ans = new int[n];
    //     for(int i=0;i<n;i++){
    //         int prod = 1;
    //         for(int j=n-1;j>=0;j--){
    //             if(i != j){
    //                 prod *= nums[j];
    //             }
    //         }
    //         ans[i] = prod;
    //     }
    //     return ans;
    // }
    //  BRUTE FORCE APPROACH 
    

    // public int[] productOfArrayExceptSelf(int[] nums) {
    //     int n = nums.length;
    //     int[] ans = new int[n];
    //     int [] prefix = new int[n];
    //     int [] suffix = new int[n];
    //     prefix[0] = 1;
    //     suffix[n-1] = 1; 
    //     for(int i=1;i<n;i++){
    //         prefix[i] = prefix[i-1] * nums[i-1];
    //     }
    //     for(int i=n-2;i>=0;i--){
    //         suffix[i] = suffix[i+1] * nums[i+1];
    //     }
    //     for(int i=0;i<n;i++){
    //         ans[i] = suffix[i] * prefix[i];
    //     }
    //     return ans;
    // }
    //INTERMEDIATE APPROACH

    public int[] productOfArrayExceptSelf(int[] nums){
        int n = nums.length;
        int [] ans = new int[n];
        // int prefix = 1;
        int suffix = 1;
        ans[0] = 1;
        for(int i = 1; i < n; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        for(int i = n-2 ; i >= 0 ; i--){
            suffix *= nums[i+1];
            ans[i] = suffix;
        }
        return ans;
    }


    public static void main(String[] args) {
        productofArrayExceptSelf238 obj = new productofArrayExceptSelf238();
        int [] nums = {1,2,3,4};
        int[] ans = obj.productOfArrayExceptSelf(nums);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
