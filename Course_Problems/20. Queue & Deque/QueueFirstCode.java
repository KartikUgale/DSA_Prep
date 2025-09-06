public class QueueFirstCode {
    public static class Queue { // This is Queue created in Array
        static int[] arr;
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) { // Enque
            if (rear == size - 1) { // last index
                System.out.println("Array is full");
                return;
            }
            rear++; // rear index updated
            arr[rear] = data;
        }

        public static int remove() { // Dequeue
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = arr[0]; // arr at index 0 is stored in front variable
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1]; // next index data is now curr index's data
            }
            rear--;
            return front;
        }

        public static int peek() { // Peek
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}