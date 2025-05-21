import java.util.ArrayList;

public class DetectCycle_inDirectedGraph {
    static class Edge {
        int src, dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void create(ArrayList<Edge>[] graph) {
        for (int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 vertex
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        // 1 vertex
        graph[1].add(new Edge(1,3));

        // 2 vertex
        graph[2].add(new Edge(2,3));
    }

    public static boolean isCycle(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];

        for (int i=0; i<graph.length; i++) {
            if (!vis[i]) {
                if (isCycleUtil(graph, i, vis, stack)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, boolean[] stack) {
        vis[curr] = true;
        stack[curr] = true;

        for (Edge e : graph[curr]) {
            if (stack[e.dest]) { // cycle
                return true;
            }
            if (!vis[curr] && isCycleUtil(graph, e.dest, vis, stack)) {  // cycle
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        /* Directed Graph
                           0
                         /  \
                        v    v
                        1    2
                         \  /
                          vv
                          3
        */
        int v = 4;
        ArrayList<Edge>[] graph = new  ArrayList[v];
        create(graph);
        System.out.println(isCycle(graph));
    }
}