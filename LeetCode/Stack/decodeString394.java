import java.util.Stack;

public class decodeString394{
    public String solution(String s){
        Stack <String> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != ']'){
                stack.push(String.valueOf(ch));
            }
            else{
                StringBuilder substr = new StringBuilder();
                while(!stack.peek().equals("[")){
                    substr.insert(0,stack.pop());
                }
                stack.pop();

                StringBuilder num = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))){
                    num.insert(0,stack.pop());
                }
                int k = Integer.parseInt(num.toString());
                StringBuilder repeated = new StringBuilder();
                for(int j=0;j<k;j++){
                    repeated.append(substr);                    
                }
                stack.push(repeated.toString());
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            ans.insert(0,stack.pop());
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "3[a2[c]]";
        decodeString394 obj = new decodeString394();
        String ans = obj.solution(s);
        System.out.println(ans);
        
    }
}