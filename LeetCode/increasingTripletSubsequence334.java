public class increasingTripletSubsequence334 {
    public boolean increasingTripletSubsequence(int [] nums){

        if(nums == null || nums.length < 3){
            return false;
        }

        int n = nums.length;
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i = 0;i < n;i++){
            if(nums[i] <= first){
                first = nums[i];
            }
            else if(nums[i] <= second){
                second = nums[i];
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        increasingTripletSubsequence334 obj = new increasingTripletSubsequence334();
        int [] nums = {2,1,5,0,4,6};
        System.out.println(obj.increasingTripletSubsequence(nums));
    }
    
}
