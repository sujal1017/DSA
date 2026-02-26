public class maxConsicativeOnes {
    public int Solution(int [] arr){
        int count=0;
        int maxi=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                count++;
                maxi=Math.max(count,maxi);
            }else{
                count=0;
            }
            
        }
        return maxi;
    }
    public static void main(String[] args) {
        maxConsicativeOnes ans = new maxConsicativeOnes();
        int [] arr = {1,1,0,0,1,0,1,1,1,0,1,1};
        int result = ans.Solution(arr);
        System.out.println("The maximum consicutive one's are " + result);
        
    }
    
}
