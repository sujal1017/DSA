
import java.util.ArrayList;
import java.util.*;

public class unionIntersection2SortedArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,3,4,9};
        int [] arr2 = {2,6,7,7,8,9};

        int i=0;
        int j=0;
        List<Integer> result = new ArrayList<>();
        
        while(i<arr1.length || j<arr2.length){
            if(i>0 && arr1[i]==arr1[i-1] && i<arr1.length ){
                i++;
            }
            if(j>0 && arr2[j]==arr2[j-1] && j<arr2.length){
                j++;
            }
            if(i>arr1.length){
                result.add(arr2[j]);
                j++;
                continue;
            }
            if(j>arr2.length){
                result.add(arr1[i]);
                i++;
                continue;
            }

            if(arr1[i]<arr2[j]){
                result.add(arr1[i]);
                i++;
            }else if(arr2[j]<arr1[i]){
                result.add(arr2[j]);
                j++;
            }else{
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        for(int num : result){
            System.out.println(num);
        }
    }
    
}
