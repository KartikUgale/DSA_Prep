import java.util.ArrayList;
import java.util.Arrays;

public class BellmanFord2 {
    static class Edge {
        int src, dest, wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph) {
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));
        graph.add(new Edge(1, 2, -4));
        graph.add(new Edge(2, 3, 2));
        graph.add(new Edge(3, 4, 4));
        graph.add(new Edge(4, 1, -1));
    }

    public static void bellmanFord(ArrayList<Edge> graph, int src, int v) {
        int dist[] = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int i = 0; i < v - 1; i++) {
            for (Edge e : graph) {
                if (dist[e.src] != Integer.MAX_VALUE && dist[e.src] + e.wt < dist[e.dest]) {
                    dist[e.dest] = dist[e.src] + e.wt;
                }
            }
        }

        for (int d : dist) {
            System.out.print(d + " ");
        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph = new ArrayList<>();
        createGraph(graph);

        int src = 0;
        bellmanFord(graph, src, v);

    }
}
