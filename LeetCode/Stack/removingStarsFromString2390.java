import java.util.Stack;

public class removingStarsFromString2390 {
    public String Solution (String s){
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '*'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "leet**cod*e";
        removingStarsFromString2390 obj = new removingStarsFromString2390();
        String ans = obj.Solution(s);
        System.out.println(ans);
    
    }
}
