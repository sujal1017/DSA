public class moveZeros283{
    public void moveZeros(int [] nums){
        int n = nums.length;
        int i=0;
        for(int j=0;j<n;j++){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        moveZeros283 obj = new moveZeros283();
        int [] nums = {0,0,1,2,3};
        obj.moveZeros(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}