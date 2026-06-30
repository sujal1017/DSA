public class reverseWordsInAString151 {
    public String reverseWordsInAString(String s){
        s = s.trim();
        String [] words = s.split("\\s+");
        int start = 0;
        StringBuilder ans = new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            ans.append(words[i]);
            if(i != 0){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
    
    public static void main(String[] args) {
        reverseWordsInAString151 obj = new reverseWordsInAString151();
        String s = "Leet Code";
        System.out.println(obj.reverseWordsInAString(s));
    }
}
