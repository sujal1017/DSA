import java.util.TreeSet;

public class smallestNumberInInfiniteSet2336 {
    TreeSet<Integer> set = new TreeSet<>();
    int i = 1;
    public smallestNumberInInfiniteSet2336(){

    }
    public int popSmallest(){
        if(!set.isEmpty()){
            return set.pollFirst();
        }
        return i++;
    }
    public void addBack(int num){
        if(num<i){
            set.add(num);
        }
    }
    public static void main(String[] args) {
        smallestNumberInInfiniteSet2336 obj = new smallestNumberInInfiniteSet2336();
        System.out.println(obj.popSmallest()); // 1
        System.out.println(obj.popSmallest()); // 2

        obj.addBack(1);

        System.out.println(obj.popSmallest()); // 1
        System.out.println(obj.popSmallest()); // 3

        obj.addBack(2);

        System.out.println(obj.popSmallest()); // 2
        System.out.println(obj.popSmallest()); // 4
    }
}
