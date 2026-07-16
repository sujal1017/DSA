import java.util.HashSet;
public class hashing{
    public static void main(String[] args) {
        //Creating HashSet
        HashSet<Integer> set = new HashSet<>();

        //Adding elements in the set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);


        //Print the val 
        if(set.contains(1)){
            System.out.println("The set contains the value 1");
        }

        //Deleting element in the set
        set.remove(2);

        System.out.println("Size of the set is " + set.size());

        System.out.println(set);

    }
}