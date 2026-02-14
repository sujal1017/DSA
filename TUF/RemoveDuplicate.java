public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 5, 5};

        if (nums.length == 0) {
            System.out.println("Empty array");
            return;
        }

        int x = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[x]) {
                x++;
                nums[x] = nums[i];
            }
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i <= x; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
