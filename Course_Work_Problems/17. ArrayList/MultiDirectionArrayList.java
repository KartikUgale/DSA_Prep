import java.util.ArrayList;

public class MultiDirectionArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        mainList.add(list2);

        System.out.println(mainList); // print whole array directly

        for (int i = 0; i < mainList.size(); i++) { // Print matrix
            ArrayList<Integer> tempList = mainList.get(i);
            for (int j = 0; j < tempList.size(); j++) {
                System.out.print(tempList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
