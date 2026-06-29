public class greatestCommonDivisorOfString1071 {
    public String gcdOfStrings(String str1, String str2){
        int m = str1.length();
        int n = str2.length();
        if((str1+str2).equals(str2+str1)){
            return str1.substring(0,gcd(m,n));
        }
        else{
            return "";
        }
    }    
    public int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    public static void main(String[] args){
        greatestCommonDivisorOfString1071 obj = new greatestCommonDivisorOfString1071();
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(obj.gcdOfStrings(str1,str2));
    }
}
