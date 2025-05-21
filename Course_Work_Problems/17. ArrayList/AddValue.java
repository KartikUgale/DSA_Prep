import java.util.ArrayList;

public class AddValue {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // variable.add(value) is used to store value in heap using ArrayList
        list.add(2);
        list.add(3);

        System.out.println(list);
    }
}
