public class stringCompression443{
    public int compression(char[] chars){
        int i = 1;
        int count = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(chars[0]);
        while(i<chars.length){
            if(chars[i] == chars[i-1]){
                count++;
            }
            else{
                if(count>1){
                    sb.append(count);
                }
                sb.append(chars[i]);
                count = 1;
            }
            i++;
        }
        if(count>1){
            sb.append(count);
        }
        for(int k = 0;k<sb.length();k++){
            chars[k] = sb.charAt(k);
        }
        return sb.length();
    }
    public static void main(String[] args){
        stringCompression443 obj = new stringCompression443();
        char [] chars = {'a','b','b','b','c','c'};
        int len = obj.compression(chars);
        System.out.println("Length = " + len);
        for (int i = 0; i < len; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}