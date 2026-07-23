import java.util.LinkedList;
import java.util.Queue;

public class dota2Senate649 {

    public String predictPartyVictory(String senate) {

        int n = senate.length();

        Queue<Integer> d = new LinkedList<>();
        Queue<Integer> r = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                r.offer(i);
            } else {
                d.offer(i);
            }
        }

        while (!r.isEmpty() && !d.isEmpty()) {

            int ri = r.poll();
            int di = d.poll();

            if (ri < di) {
                r.offer(ri + n);
            } else {
                d.offer(di + n);
            }
        }

        return r.isEmpty() ? "Dire" : "Radiant";
    }

    public static void main(String[] args) {

        String senate = "RDD";
        dota2Senate649 obj = new dota2Senate649();

        System.out.println(obj.predictPartyVictory(senate));
    }
}