public class containerWithMostWater11 {
    public int maxArea(int [] height){
        int maxwater = 0;
        int lp = 0;
        int rp = height.length-1;
        
        while(lp<rp){
            int width = rp-lp;
            int ht = Math.min(height[lp],height[rp]);
            int currwater = width * ht;
            maxwater = Math.max(maxwater,currwater);
             if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        int [] arr = {1,8,6,2,5,4,8,3,7};
        containerWithMostWater11 ans = new containerWithMostWater11();
        int result = ans.maxArea(arr);
        System.out.println(result);
    }
    
}
