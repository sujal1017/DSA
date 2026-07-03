public class subSequence392{
    public boolean subSequence(String s, String t){
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
    public static void main(String[] args) {
        String s = "ABC";
        String t = "ADBEC";
        subSequence392 obj = new subSequence392();
        System.out.println(obj.subSequence(s, t));
    }
}