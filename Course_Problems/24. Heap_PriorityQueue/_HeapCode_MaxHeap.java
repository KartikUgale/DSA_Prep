import java.util.ArrayList;

public class _HeapCode_MaxHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public boolean isEmpty() {
            return arr.size() == 0;
        }

        public void add(int data) {
            arr.add(data);

            int childIdx = arr.size() - 1;
            int parIdx = (childIdx - 1) / 2;

            while (arr.get(childIdx) > arr.get(parIdx)) { // if new is max
                int temp = arr.get(childIdx);
                arr.set(childIdx, arr.get(parIdx));
                arr.set(parIdx, temp);

                childIdx = parIdx;
                parIdx = (childIdx - 1) / 2;
            }
        }

        public int remove() {
            int data = arr.get(0);
            // step 1 - swap
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step 2 - delete last
            arr.remove(arr.size() - 1);

            // step 3 - heapify
            heapify(0); // initiaize with root
            return data;
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int maxIdx = i;

            if (left < arr.size() && arr.get(left) > arr.get(maxIdx)) {
                maxIdx = left;
            }
            if (right < arr.size() && arr.get(right) > arr.get(maxIdx)) {
                maxIdx = right;
            }
            if (maxIdx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(maxIdx));
                arr.set(maxIdx, temp);

                heapify(maxIdx);
            }
        }

        public void print() {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        public int peek() {
            return arr.get(0);
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();

        heap.add(78);
        heap.add(54);
        heap.add(45);
        heap.print();

        heap.remove();
        heap.add(20);
        heap.print();
    }
}