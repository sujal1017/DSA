public class isPalindrome{
    public boolean Solution(String s,int l,int r){
        if(l>=r){
            return true;
        }
        if(s.charAt(l) != s.charAt(r)){
            return false;
        }
        return Solution(s, l+1, r-1);
    }
    public static void main(String[] args) {
        isPalindrome obj = new isPalindrome();
        String s = "madam";
        int l = 0;
        int r = s.length()-1;
        if(obj.Solution(s,l,r)){
            System.out.println("The String is Palindrome");
        }
        else{
            System.out.println("The String is not Palindrome");
        }
    }
}