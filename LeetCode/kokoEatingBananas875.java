public class kokoEatingBananas875{
    public int solution(int [] piles, int h){
        int left = 1;
        int right = 0;
        for(int pile : piles){
            if(pile>right){
                right = pile;
            }
        }
        while(left<right){
            int mid = left + (right - left) / 2;
            int hour = 0;
            for(int pile : piles){
                hour += (pile + mid - 1) / mid;
            }
            if(hour<=h){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int [] piles = {3,6,7,11};
        int h = 8;
        kokoEatingBananas875 obj = new kokoEatingBananas875();
        System.out.println(obj.solution(piles, h));
    }
}