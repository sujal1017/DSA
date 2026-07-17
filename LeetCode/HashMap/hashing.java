import java.util.HashMap;

public class hashing {
    public static void main(String[] args) {

        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("India", 135);
        map.put("China", 130);
        map.put("USA", 120);

        System.out.println("Original HashMap:");
        System.out.println(map);

        // Get value
        System.out.println("\nPopulation of India:");
        System.out.println(map.get("India"));

        // Check if key exists
        System.out.println("\nDoes China exist?");
        System.out.println(map.containsKey("China"));

        // Check if value exists
        System.out.println("\nDoes value 120 exist?");
        System.out.println(map.containsValue(120));

        // Update value
        map.put("India", 140);
        System.out.println("\nAfter updating India:");
        System.out.println(map);

        // Remove a key
        map.remove("China");
        System.out.println("\nAfter removing China:");
        System.out.println(map);

        // Size of HashMap
        System.out.println("\nSize of HashMap:");
        System.out.println(map.size());

        // Is HashMap empty?
        System.out.println("\nIs HashMap empty?");
        System.out.println(map.isEmpty());

        // Print all keys
        System.out.println("\nKeys:");
        System.out.println(map.keySet());

        // Print all values
        System.out.println("\nValues:");
        System.out.println(map.values());

        // Print all key-value pairs
        System.out.println("\nEntry Set:");
        System.out.println(map.entrySet());

        // Traversing using keySet()
        System.out.println("\nTraversing using keySet():");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // Traversing using entrySet()
        System.out.println("\nTraversing using entrySet():");
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Clear the HashMap
        map.clear();

        System.out.println("\nAfter clear():");
        System.out.println(map);

        // Check if empty after clearing
        System.out.println("\nIs HashMap empty now?");
        System.out.println(map.isEmpty());
    }
}