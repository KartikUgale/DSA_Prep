import java.util.ArrayList;

public class addInHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);

            int childIdx = arr.size() - 1; // child index
            int parIdx = (childIdx - 1) / 2; // parent index

            while (arr.get(childIdx) < arr.get(parIdx)) {
                int temp = arr.get(childIdx);
                arr.set(childIdx, arr.get(parIdx));
                arr.set(parIdx, temp);

                childIdx = parIdx;
                parIdx = (childIdx - 1) / 2;
            }
        }
    }

    public static void main(String[] args) {

    }
}