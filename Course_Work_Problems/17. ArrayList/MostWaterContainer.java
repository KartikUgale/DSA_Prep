import java.util.ArrayList;

public class MostWaterContainer { // IMP Que Ask by Flipkart
    public static void container(ArrayList<Integer> list) {
        int waterQty = 0;
        int lp = 0; // left point
        int rp = list.size() - 1; // right point
        while (lp < rp) {
            int height = Math.min(list.get(lp), list.get(rp));
            int width = rp - lp;
            int waterStored = height * width;
            waterQty = Math.max(waterQty, waterStored);
            if (list.get(lp) < list.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        System.out.println("Most Water stored = " + waterQty);
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
