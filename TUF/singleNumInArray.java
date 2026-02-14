public class singleNumInArray {
    public int Solution(int [] arr){
        int result=0;
        for(int num : arr){
            result^=num;
        }
        return result;
    }

    public static void main(String[] args) {
        singleNumInArray ans = new singleNumInArray();  
        int [] arr = {1,1,2,2,3,4,4,5,5};
        int singlenum= ans.Solution(arr);
        System.out.println("The single number is " + singlenum);
    }
    
}
