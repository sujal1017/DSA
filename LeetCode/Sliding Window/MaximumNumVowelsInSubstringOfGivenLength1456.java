public class MaximumNumVowelsInSubstringOfGivenLength1456 {
    public int Solution (String s, int k){
        int count = 0;
        for(int i=0;i<k;i++){
            count += isVowel(s.charAt(i));
        }
        int max = count;
        for(int i = 1; i <= s.length()-k; i++){
            count = count - isVowel(s.charAt(i-1)) + isVowel(s.charAt(i+k-1));
            if(count > max){
                max = count;
            }
        }
        return max;
    }    

    public int isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        MaximumNumVowelsInSubstringOfGivenLength1456 obj = new MaximumNumVowelsInSubstringOfGivenLength1456();
        String s = "leetcode";
        int k = 3;
        System.out.println(obj.Solution(s, k));
    }
}
