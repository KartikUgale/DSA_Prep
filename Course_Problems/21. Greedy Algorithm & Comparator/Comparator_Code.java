import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_Code {
    public static void main(String[] args) {
        // Creating a list of Person objects
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Aman", 34));
        list.add(new Person("Kartik", 22));
        list.add(new Person("Aniket", 35));

        System.out.println("Original List:");
        System.out.println(list);

        // Sorting by age using Comparable
        Collections.sort(list);
        System.out.println("\nSorted by Age (using Comparable):");
        System.out.println(list);

        // Sorting by name using a custom Comparator
        Collections.sort(list, new NameComparator());
        System.out.println("\nSorted by Name (using custom Comparator):");
        System.out.println(list);

        // Sorting by descending age using a custom Comparator
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p2.getAge(), p1.getAge()); // Descending order
            }
        });
        System.out.println("\nSorted by Age (Descending):");
        System.out.println(list);
    }
}

// A class to represent a Person
class Person implements Comparable<Person> {
    // Fields (properties of the class)
    private String name;
    private int age;

    // Constructor to initialize Person objects
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods to access private fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /*
     * This method compares this Person object with another Person object based on
     * age.
     */
    @Override
    public int compareTo(Person person) {
        return Integer.compare(this.age, person.age);
    }

    /*
     * Overrides toString to provide a readable representation of the Person object.
     */
    @Override
    public String toString() {
        return this.name + ": " + this.age;
    }
}

// Custom Comparator to compare Person objects by name
class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
