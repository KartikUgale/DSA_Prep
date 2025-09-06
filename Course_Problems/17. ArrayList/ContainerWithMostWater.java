import java.util.ArrayList;

public class ContainerWithMostWater { // IMP Que ask by Flipkart
    public static void container(ArrayList<Integer> list) { // Brute force aproach
        int waterQty = 0;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int height = Math.min(list.get(i), list.get(j));
                int width = j - i;
                int area = height * width;
                if (waterQty < area) {
                    index1 = i;
                    index2 = j;
                    waterQty = area;
                } // T.C. is O(n^2)
            }
        }
        System.out.println("Most water Contains = " + waterQty);
        System.out.println("between index (" + index1 + ") & index (" + index2 + ").");
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        container(list);
    }
}
