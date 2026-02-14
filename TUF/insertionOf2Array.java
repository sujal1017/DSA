import java.util.ArrayList;
import java.util.HashSet;

public class insertionOf2Array {
    public static void main(String[] args){
        int [] nums1 = {1,1,2,2,3,5,5,6};
        int [] nums2 = {1,2,2,3,3,4,5,5};

        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                ans.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int [] arr = new int [ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i] = ans.get(i);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    
}
