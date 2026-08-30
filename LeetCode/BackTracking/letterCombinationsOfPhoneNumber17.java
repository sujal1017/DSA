import java.util.*;

public class letterCombinationsOfPhoneNumber17{
    public List<String> Solution(String digits){
        List<String> ans = new ArrayList<>();
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");            
        map.put('4',"ghi");            
        map.put('5',"jkl");            
        map.put('6',"mno");            
        map.put('7',"pqrs");            
        map.put('8',"tuv");            
        map.put('9',"wxyz");
        backTrack(ans,0,new StringBuilder(),map,digits);
        return ans;
    }
    public void backTrack(List<String>ans, int i,StringBuilder sb, HashMap<Character,String> map, String digits){
        if(i == digits.length()){
            ans.add(sb.toString());
            return;
        }
        String curr = map.get(digits.charAt(i));
        for(int k=0;k<curr.length();k++){
            sb.append(curr.charAt(k));
            backTrack(ans,i+1,sb,map,digits);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public static void main(String[] args) {
        String digits = "23";
        letterCombinationsOfPhoneNumber17 obj = new letterCombinationsOfPhoneNumber17();
        System.out.println(obj.Solution(digits));
    }
}