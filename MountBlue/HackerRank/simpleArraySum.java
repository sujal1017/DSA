
import java.util.ArrayList;
import java.util.List;

public class simpleArraySum {
    public int Solution(List<Integer> ar){
        int sum = 0;
        for(int i=0;i<ar.size();i++){
            sum+=ar.get(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        simpleArraySum obj = new simpleArraySum();
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(7);
        System.out.println(obj.Solution(ar));
    }
}
