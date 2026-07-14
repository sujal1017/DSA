public class findTheHighestAltitude1732{
    public int Solution(int [] gain){
        int n = gain.length;
        int max = 0;
        int current = 0;
        for(int i=0;i<n;i++){
            current += gain[i];
            max = Math.max(max, current);
        }
        return max;
    }
    public static void main(String[] args) {
        findTheHighestAltitude1732 obj = new findTheHighestAltitude1732();
        int [] gain = {-5,1,5,0,-7};
        System.out.println(obj.Solution(gain));
    }
}