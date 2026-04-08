public class sortColors75 {
    public void Solution(int [] nums){
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid<=high){
            if(nums[mid] == 0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
    public void swap(int [] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int [] arr = {1,0,2,1,2,2,0,1,1,2,0,2,1,0,2};

        sortColors75 obj = new sortColors75();
        obj.Solution(arr);
        for(int k:arr){
            System.out.print(k + " ");
        }
    }
    
}
