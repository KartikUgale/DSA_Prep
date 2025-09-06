import java.util.ArrayList;

public class OperationsInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1. add Operation
        list.add(1);
        list.add(2);
        list.add(10);
        System.out.println(list);

        // add Value at specific index
        list.add(1, 5);
        System.out.println(list);

        // 2. Get / access value
        int value = list.get(2);
        System.out.println("value at index 2 is: " + value);

        // 3. remove element
        list.remove(3);
        System.out.println(list);

        // 4. set element at index
        list.set(0, 9);
        System.out.println(list);

        // 5. contains element
        System.out.println(list.contains(1)); // if value contains in arraylist then it will return "true" or if not
                                              // then it will return "false";

        // 6. size element
        System.out.println(list.size());
    }
}
