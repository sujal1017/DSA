public class floorAndCeilinSortedArray {
    public int floor(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= target) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public int ceil(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int target = 3;
        floorAndCeilinSortedArray obj = new floorAndCeilinSortedArray();

        int floorIndex = obj.floor(arr, target);
        int ceilIndex = obj.ceil(arr, target);

        System.out.println("Floor index: " + floorIndex + 
                           (floorIndex != -1 ? " -> " + arr[floorIndex] : " (No floor)"));
        System.out.println("Ceil index: " + ceilIndex + 
                           (ceilIndex != -1 ? " -> " + arr[ceilIndex] : " (No ceil)"));
    }
}
