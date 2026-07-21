import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class breakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int min = scores.get(0);
        int max = scores.get(0);
        int maxcount = 0;
        int mincount = 0;
        for(int i=0;i<scores.size();i++){
            if(scores.get(i)>max){
                max = scores.get(i);
                maxcount+=1;
            }
        }
        for(int i=0;i<scores.size();i++){
            if(scores.get(i)<min){
                min = scores.get(i);
                mincount+=1;
            }
        }
        List<Integer> ans = new ArrayList<>();
        ans.add(maxcount);
        ans.add(mincount);
        
        return ans;

    }

    public static void main(String[] args) {
        breakingTheRecords obj = new breakingTheRecords();
        List<Integer> scores = Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1);
        System.out.println(obj.breakingRecords(scores));

    }

}
