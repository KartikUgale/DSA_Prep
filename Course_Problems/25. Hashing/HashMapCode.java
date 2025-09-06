import java.util.LinkedList;
import java.util.ArrayList;

public class HashMapCode {
    static class HashMap<K, V> { // K,V are generic values whos type are not fix
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // qty of nodes
        private int N; // size of array
        private LinkedList<Node> buckets[]; // N --> (lambda = n/N)

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) { // Initiolise empty buckets
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode(); // convert key into hashcode
            return Math.abs(hc) % N; // .abs make +ve value
        }

        private int searchLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }

            return -1;
        }

        public void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            N = N * 2;
            buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) { // O(lambda) --> O(1)
            int bi = hashFunction(key); // bucket Index value is always between (0) to (size -1 = 3) which is return by
                                        // hashFunction.
            int di = searchLL(key, bi); // data index --> valid or -1 only.

            if (di != -1) { // key is already exist
                Node node = buckets[bi].get(di); // value at index of bi in buckets array at di index of LikedList
                node.value = value; // update the value // buckets is array, bi is array index .get is used to find
                                    // key at LinkedList at index di
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) { // O(1)
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if (di != -1) { // valid (Key available in data)
                return true;
            } else {
                return false;
            }
        }

        public V get(K key) { // O(1)
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public V remove(K key) { // O(1)
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if (bi != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() { // store & return
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }

        public void clear() {
            for (int i = 0; i < buckets.length; i++) {
                buckets[i].clear();
            }
            n = 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("pakistan", 40);
        hm.put("Nepal", 5);

        System.out.println(hm.keySet());

        System.out.println(hm.get("pakistan"));
        System.out.println(hm.remove("pakistan"));

        System.out.println(hm.keySet());
        System.out.println(hm.isEmpty());

        System.out.println(hm.containsKey("pakistan"));

        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
