import java.util.ArrayList;

public class _HeapCode_MinHeap { // for Min Heap
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public boolean isEmpty() { // isEmpty() Method
            return arr.size() == 0;
        }

        public void add(int data) { // O(logn)/ // add() Method
            arr.add(data);

            int childIdx = arr.size() - 1;
            int parIdx = (childIdx - 1) / 2;

            while (arr.get(childIdx) < arr.get(parIdx)) {
                int temp = arr.get(childIdx);
                arr.set(childIdx, arr.get(parIdx));
                arr.set(parIdx, temp);

                childIdx = parIdx;
                parIdx = (childIdx - 1) / 2;
            }
        }

        public int remove() {
            int data = arr.get(0);

            // step 1 - Swap 1st node with last node
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step 2 - remove last index
            arr.remove(arr.size() - 1);

            // step 3 - fix tree by working on array Heapify
            heapify(0);
            return data;
        }

        private void heapify(int i) { // heapify
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) { // i is root index
                // swap minIdx with root
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public void printHeap() { // print() method
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        public int peek() { // peek() Method
            return arr.get(0);
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();

        heap.add(34);
        heap.add(20);
        heap.add(78);
        heap.printHeap();

        heap.remove();
        heap.printHeap();

        heap.add(89);

        System.out.println(heap.peek());

        heap.printHeap();
    }
}
