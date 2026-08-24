import java.util.Arrays;

public class KthLargestElementInAnArray215{
    public int Solution(int [] nums, int k){
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    public static void main(String[]args){
        KthLargestElementInAnArray215 obj = new KthLargestElementInAnArray215();
        int [] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(obj.Solution(nums, k));
    }
}