import java.util.Arrays;
public class successfulPairsOfSpellsAndPotions2300 {
    public int[] position(int [] spells,int [] potions, long success){
        int n = spells.length;
        int m = potions.length;
        int [] ans = new int[n];
        Arrays.sort(potions);
        
        for(int i=0;i<n;i++){
            int left = 0;
            int right = m-1;
            int index = m;
            while(left<=right){
                int mid = left + (right-left) / 2;
                long position = (long)spells[i] * potions[mid];
                if(position >= success){
                    index = mid;
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            ans[i] = m-index;
        }
        return ans;
    }
    public static void main(String[] args) {
        successfulPairsOfSpellsAndPotions2300 obj = new successfulPairsOfSpellsAndPotions2300();
        int [] spells = {5,1,3};
        int [] potions = {5,1,4,2,3};
        int success = 7;
        int[] ans = obj.position(spells, potions, success);
        for(int num: ans){
            System.out.print(num + " ");
        }
    }
    
}
