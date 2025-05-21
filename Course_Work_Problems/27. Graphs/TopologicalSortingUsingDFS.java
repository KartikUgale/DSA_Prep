import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortingUsingDFS {
    static class Edge {
        int src,  dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void create(ArrayList<Edge>[] graph) {
        for (int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 2 vertex
        graph[2].add(new Edge(2,3));

        // 3 vertex
        graph[3].add(new Edge(3,1));

        // 4 vertex
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        // 5 vertex
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }

    public static void topSort(ArrayList<Edge>[] graph) {   // Topology Sort
        boolean[] vis = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for (int i=0; i<graph.length; i++) {
            if(!vis[i]) {
                topSortUtil(graph, i, vis, s);  // modified DFS
            }
        }
        
        while (!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }

    public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> s) {
        vis[curr] = true;

        for (Edge e : graph[curr]) {
            if(!vis[e.dest]) {
                topSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void main(String[] args) {
        /*  Directed Acyclic Graph (DAG)
                5 --> 0 <-- 4
                |           |
                v           v
                2 --> 3 --> 1 
        */

        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        create(graph);

        topSort(graph);
    }
}
