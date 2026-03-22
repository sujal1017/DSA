public class lengthOfLastWord58 {
    public int Solution(String s){
        int count = 0;
        String str = s.trim();
        for(int i = str.length()-1;i>=0;i--){
            if(str.charAt(i) != ' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        lengthOfLastWord58 obj = new lengthOfLastWord58();

        String s = "Hello World";

        int result = obj.Solution(s);
        System.out.println("The lenght of the last word is: " + result);

    }
    
}
