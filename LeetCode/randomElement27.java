public class randomElement27 {

    public int removeElement(int[] nums, int val) {
        int k = 0; // position to place valid elements
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i]; // store valid element
                k++;
            }
        }
        
        return k;
    }

    public static void main(String[] args) {
        randomElement27 obj = new randomElement27();

        int[] nums = {0,1,2,2,3,0,4,2};
        int val =1;

        int k = obj.removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.print("Updated array (first k elements): ");

        for(int i = 0; i < k; i++){
            System.out.print(nums[i] + " ");
        }
    }
}