import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class findTheDifferenceOfTwoArrays2215 {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Store unique elements of nums1
        for (int num : nums1) {
            set1.add(num);
        }

        // Store unique elements of nums2
        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Elements present in nums1 but not in nums2
        for (int num : set1) {
            if (!set2.contains(num)) {
                list1.add(num);
            }
        }

        // Elements present in nums2 but not in nums1
        for (int num : set2) {
            if (!set1.contains(num)) {
                list2.add(num);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(list1);
        ans.add(list2);

        return ans;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};

        findTheDifferenceOfTwoArrays2215 obj = new findTheDifferenceOfTwoArrays2215();

        List<List<Integer>> result = obj.findDifference(nums1, nums2);

        System.out.println("Answer:");
        System.out.println(result);
    }
}