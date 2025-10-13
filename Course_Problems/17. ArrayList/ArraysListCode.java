import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArraysListCode {
    public static void main(String[] args) {
        // add
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.addAll(Arrays.asList(1, 1, 2, 3));

        System.out.println(list1);

        //add
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(list2.add(5));

        System.out.println(list2);

        // isEmpty()
        System.out.println(list1.isEmpty());

        // contains element
        System.out.println(list1.contains(3));

        // contains all elements of another list
        System.out.println(list1.containsAll(list2)); // return true if list1 contains all elements of list2

        // remove
        list1.remove(1);    // it will remove element at index 1
        list1.remove(Integer.valueOf(1));   // it will remove value 1

        // add all elements of another list
        list1.addAll(list2);
        System.out.println(list1);

        // sort in asscending order
        Collections.sort(list1);    // sort
        System.out.println(list1);
        
        // sort in descending order
        Collections.sort(list1, Comparator.reverseOrder());
        System.out.println(list1);

        // clear all list
        list1.clear();
        System.out.println(list1);

        // -----------------------------------------------
        List<Integer> list01 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> list02 = new ArrayList<>(Arrays.asList(2, 4, 6, 8));

        // remove all elements from list(list01) which are not present in another list(list02)
        list01.retainAll(list02);
        System.out.println(list01);

        // list to array
        list01.toArray();

        // search index of element
        System.out.println(list02.indexOf(6));  // return index or -1 if not present
        System.out.println(list02.contains(9)); // return true / false



        // ---------------------------------------------------------------
        // ways to Iterate
        List<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "kiwi", "orange"));

        // way 01 - for loop
        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + " ");
        }

        // way 02 - for each
        for (String num : fruits) {
            System.out.print(num + " ");
        }

        // way 03 - Interator
        Iterator<String> fruit = fruits.iterator();
        while (fruit.hasNext()) {
            System.out.print(fruit.next() + " ");
        }

        // subList
        List<String> someFruits = fruits.subList(0, 3); // it will contain index 0, 1, 2
        System.out.println(someFruits);

    }
}
