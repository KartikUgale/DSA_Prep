import java.util.HashMap;
import java.util.Map;

public class MapOperations {
    public static void main(String[] args) {
        // Create a new HashMap
        Map<Integer, String> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Display the map
        System.out.println("Initial Map: " + map);

        // Access a value by its key
        System.out.println("Value for key 2: " + map.get(2));

        // Check if a key exists in the map
        System.out.println("Does key 3 exist? " + map.containsKey(3));

        // Check if a value exists in the map
        System.out.println("Does value 'Two' exist? " + map.containsValue("Two"));

        // Update a value for a specific key
        map.put(2, "Second");
        System.out.println("After updating key 2: " + map);

        // Remove a key-value pair
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // Iterate over keys in the map
        System.out.println("Keys in the map:");
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        // Iterate over values in the map
        System.out.println("Values in the map:");
        for (String value : map.values()) {
            System.out.println(value);
        }

        // Iterate over key-value pairs in the map
        System.out.println("Key-Value pairs in the map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Get the size of the map
        System.out.println("Size of the map: " + map.size());

        // Check if the map is empty
        System.out.println("Is the map empty? " + map.isEmpty());

        // Clear all entries in the map
        map.clear();
        System.out.println("After clearing the map: " + map);

        // Check again if the map is empty
        System.out.println("Is the map empty after clearing? " + map.isEmpty());
    }
}
