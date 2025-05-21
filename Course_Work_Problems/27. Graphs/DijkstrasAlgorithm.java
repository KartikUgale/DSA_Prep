import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Arrays;

public class DijkstrasAlgorithm {
    static class Edge {
        int src, dest, wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Defining edges
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    static class Pair implements Comparable<Pair> {
        int node, dist;

        public Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.dist - p2.dist;
        }
    }

    public static void dijkstra(ArrayList<Edge>[] graph, int src) {
        int[] dist = new int[graph.length];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            int currNode = curr.node;

            for (Edge e : graph[currNode]) {
                if (dist[currNode] + e.wt < dist[e.dest]) {
                    dist[e.dest] = dist[currNode] + e.wt;
                    pq.add(new Pair(e.dest, dist[e.dest]));
                }
            }
        }

        // Print the shortest distances
        System.out.println("Shortest distances from node " + src + ":");
        for (int i = 0; i < dist.length; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.print("∞ ");
            } else {
                System.out.print(dist[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 6;
        ArrayList<Edge>[] graph = new ArrayList[n];
        createGraph(graph);

        int src = 0;
        dijkstra(graph, src);
    }
}
