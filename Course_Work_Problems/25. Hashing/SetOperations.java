import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        // Create two sample sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements to set1
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        // Add elements to set2
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        // Display the original sets
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        // Union of set1 and set2 (combines elements from both sets without duplicates)
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        // Intersection of set1 and set2 (common elements in both sets)
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        // Difference of set1 and set2 (elements in set1 but not in set2)
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference (Set1 - Set2): " + difference);

        // Symmetric difference (elements in either set1 or set2 but not both)
        Set<Integer> symmetricDifference = new HashSet<>(set1);
        symmetricDifference.addAll(set2);
        Set<Integer> temp = new HashSet<>(set1);
        temp.retainAll(set2);
        symmetricDifference.removeAll(temp);
        System.out.println("Symmetric Difference: " + symmetricDifference);

        // Check if set1 contains a specific element
        System.out.println("Does Set1 contain 2? " + set1.contains(2));

        // Check if set1 is a subset of set2
        System.out.println("Is Set1 a subset of Set2? " + set2.containsAll(set1));

        // Add an element to a set
        set1.add(7);
        System.out.println("After adding 7 to Set1: " + set1);

        // Remove an element from a set
        set1.remove(7);
        System.out.println("After removing 7 from Set1: " + set1);

        // Clear all elements from a set
        set2.clear();
        System.out.println("After clearing Set2: " + set2);

        // Check if a set is empty
        System.out.println("Is Set2 empty? " + set2.isEmpty());
    }
}
