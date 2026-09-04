public class minimumFlipsToMakeAORBEqualToC1318{
    public int Solutions(int a,int b,int c){
        int x,y,z,count = 0;
        for(int i=0;i<32;i++){
            x = a & (1 << i);
            y = b & (1 << i);
            z = c & (1 << i);

            if(x == 0 && y !=0 && z == 0){
                count += 1;
            }
            else if(x != 0 && y != 0 && z == 0){
                count += 2;
            }
            else if(x != 0 && y == 0 && z == 0){
                count += 1;
            }
            else if(x == 0 && y == 0 && z != 0){
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        minimumFlipsToMakeAORBEqualToC1318 obj = new minimumFlipsToMakeAORBEqualToC1318();
        int a = 2;
        int b = 6;
        int c = 5;
        System.out.println(obj.Solutions(a, b, c));
    }
}