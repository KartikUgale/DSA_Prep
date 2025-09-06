import java.util.ArrayList;

public class StoreProduct {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(1 * i); // 1 2 3 4 5
            list2.add(2 * i); // 2 4 6 8 10
            list3.add(3 * i); // 3 6 9 12 15
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        list2.remove(3); // removed value of index3 (8) in list2 arrayList

        System.out.println(mainList); // print ArrayList

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> lists = mainList.get(i);
            for (int j = 0; j < lists.size(); j++) {
                System.out.print(lists.get(j) + " ");
            }
            System.out.println();
        }
    }
}
