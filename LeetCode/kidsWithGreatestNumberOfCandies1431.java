
import java.util.ArrayList;
import java.util.List;

public class kidsWithGreatestNumberOfCandies1431 {
    public List<Boolean> kidsWithCandies(int [] candies,int extraCandies){
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        int m = candies.length;
        for(int i=0;i<m;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(int i=0;i<m;i++){
            if(candies[i] + extraCandies >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        kidsWithGreatestNumberOfCandies1431 obj = new kidsWithGreatestNumberOfCandies1431();
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;

        List<Boolean> answer = obj.kidsWithCandies(candies, extraCandies);

        System.out.println(answer);
    }
    
}
