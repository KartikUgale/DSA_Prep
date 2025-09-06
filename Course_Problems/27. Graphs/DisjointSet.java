public class DisjointSet {
    static int n = 10;
    static int[] par = new int[n]; // parent
    static int[] rank = new int[n];

    public static void init() {
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    public static int find(int x) {
        if (x == par[x]) {
            return x;
        }

        return par[x] = find(par[x]);
    }

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }

    public static void main(String[] args) {
        init();
        System.out.println(find(3));
        System.out.println(find(4));
        union(3, 4);
        System.out.println(find(3)); // will give output 3
        System.out.println(find(4)); // will give output 3 (because 3 is 4's parent)

        union(5, 3);
        System.out.println(find(4));

        union(7, 2);
        union(1, 2);
        union(8, 2);
        System.out.println(find(8));

        union(3, 7);
        System.out.println(find(3));
    }
}
