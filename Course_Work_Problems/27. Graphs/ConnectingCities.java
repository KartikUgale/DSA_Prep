import java.util.ArrayList;
import java.util.PriorityQueue;

public class ConnectingCities {  // Question- find minimum cost paths to connect all cities. return cost;
    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph, int[][] cities) {
        for (int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i=0; i<cities.length; i++) {
            for (int j=0; j<cities[0].length; j++) {
                int src = i;
                int dest = j;
                int wt = cities[i][j];

                graph[i].add(new Edge(src, dest, wt));
            }
        }
    }

    static class Pair implements Comparable<Pair> {
        int ver;
        int cost;

        Pair(int ver, int cost) {
            this.ver = ver;
            this.cost = cost;
        }

        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static int minCostCities(int[][] cities) {
        ArrayList<Edge>[] graph = new ArrayList[cities.length];
        createGraph(graph, cities);
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[cities.length];
        pq.add(new Pair(0,0));
        int minCost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!visited[curr.ver]) {
                visited[curr.ver] = true;
                minCost += curr.cost;

                for (Edge e : graph[curr.ver]) {
                    if (e.wt != 0) {
                        pq.add(new Pair(e.dest, e.wt));
                    }
                }
            }
        }

        return minCost;

    }

    public static void main(String[] args) {
        int[][] cities = {{0,1,2,3,4},  // i is src & j is dest & value is cost;    (e.g.- i=0,j=0,cost=0.   i=0,j=1,cost=1)
                          {1,0,5,0,7},
                          {2,5,0,6,0},
                          {3,0,6,0,0},
                          {4,7,0,0,0}};

        System.out.println(minCostCities(cities));
    }
}
