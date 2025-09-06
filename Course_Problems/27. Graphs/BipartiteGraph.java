import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class BipartiteGraph {
    static class Edge {
        int src, dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void create(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 vertex
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // 1 vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        // 2 vertex
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        // 3 vertex
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        // 4 vertex
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        int[] color = new int[graph.length];
        for (int i = 0; i < color.length; i++) {
            color[i] = -1; // fill color array wil all no color // -1 = no color
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) { // BFS start
                q.add(i);
                color[i] = 0; // starting color or first color is blue
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (Edge e : graph[curr]) {
                        if (color[e.dest] == -1) {
                            int nextCol = color[curr] == 0 ? 1 : 0; // 1 = red, 0 = blue
                            color[e.dest] = nextCol;
                            q.add(e.dest);
                        } else if (color[curr] == color[e.dest]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /*
              0
             / \
             1  2
             |  |
             3 _4
        */
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        create(graph);
        System.out.println(isBipartite(graph));
    }
}
