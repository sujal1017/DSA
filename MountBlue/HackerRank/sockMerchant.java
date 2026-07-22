
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sockMerchant{
    public int Solution(int n, List<Integer>sock){
        Collections.sort(sock);
        int count = 0;
        for(int i=0;i<n-1;){
            if(sock.get(i).equals(sock.get(i+1))){
                count++;
                i=i+2;
            }
            else{
                i++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<Integer> sock = new ArrayList<>();
        sock.add(1);
        sock.add(2);
        sock.add(1);
        sock.add(2);
        sock.add(1);
        sock.add(3);
        sock.add(2);        int n = 7;
        sockMerchant obj = new sockMerchant();
        System.out.println(obj.Solution(n, sock));
    }
}