
public class twoSum {

    public static int[] Solution(int [] nums, int target){
        int [] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                }
            }

        }
        return arr;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9};
        int target=8 ;
        int [] result=Solution(nums, target);
        System.out.println("Indices: " + result[0] + "," + result[1]);
        
    
    }
    
}
