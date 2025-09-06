import java.util.ArrayList;
import java.util.Arrays;

public class BellmanFord {
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

    public static void bellmanFord(ArrayList<Edge>[] graph, int src) {
        int dist[] = new int[graph.length];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        int v = graph.length;
        for (int i = 0; i < v - 1; i++) {
            for (int j = 0; j < v; j++) {
                for (Edge e : graph[j]) {
                    if (dist[e.src] != Integer.MAX_VALUE && dist[e.src] + e.wt < dist[e.dest]) {
                        dist[e.dest] = dist[e.src] + e.wt;
                    }
                }
            }
        }

        for (int d : dist) {
            System.out.print(d + " ");
        }
    }

    public static void main(String[] args) {
        int n = 6;
        ArrayList<Edge>[] graph = new ArrayList[n];
        createGraph(graph);

        int src = 0;
        bellmanFord(graph, src);

    }
}
