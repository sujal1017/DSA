public class sort012 {
    public void Solution(int [] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int []nums = {1,0,2,1,2,0,1,0,2,0,1,1,0,2};
        sort012 sort = new sort012();
        sort.Solution(nums);
        for(int i : nums){
        System.out.print(i + ",");
        }
    }
    
}
