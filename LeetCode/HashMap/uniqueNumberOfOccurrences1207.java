import java.util.HashMap;
import java.util.HashSet;

public class uniqueNumberOfOccurrences1207 {
    public boolean Solution(int []arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            if(map.containsKey(num)){
                int count = map.get(num);
                map.put(num, count+1);
            }           
            else{
                map.put(num,1);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int count : map.values()){
            if(set.contains(count)){
                return false;
            }
            set.add(count);
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,2,1,1,3};
        uniqueNumberOfOccurrences1207 obj = new uniqueNumberOfOccurrences1207();
        System.out.println(obj.Solution(arr));
    }
}
