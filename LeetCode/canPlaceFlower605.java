public class canPlaceFlower605{
    public boolean canPlaceFlower(int [] flowerbed, int n){
        int m = flowerbed.length;
        for(int i=0;i<m;i++){
            if(n == 0){
                return true;
            }
            if(flowerbed[i] == 0){
                boolean left_khali = (i == 0) || flowerbed[i-1] == 0;
                boolean right_khali = (i == m-1) || flowerbed[i+1] == 0;

                if(left_khali && right_khali){
                    flowerbed[i] = 1;
                    n--;
                    if(n == 0){
                        return true;
                    }
                }

            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        canPlaceFlower605 obj = new canPlaceFlower605();
        int [] flowerbed = {1,0,0,0,1};
        int n = 1;
        System.out.println(obj.canPlaceFlower(flowerbed, n));
    }
}