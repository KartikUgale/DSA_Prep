import java.util.ArrayList;
import java.util.Stack;

public class KosarajuAlgorithm {     // this Algo use for to find Strongly Connected Component (SCC) in graph using modified reverse DFS.
    static class Edge {
        int src = 0;
        int dest = 0;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void create(ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1));
        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,4));
    }

    public static void topSort(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> s) {
        vis[curr] = true;

        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                topSort(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void dfs(ArrayList<Edge>[] transpose, int curr, boolean[] vis) {
        System.out.print(curr+" ");
        vis[curr] = true;

        for (Edge e : transpose[curr]) {
            if (!vis[e.dest]) {
                dfs(transpose, e.dest, vis);
            }
        }
    }

    public static void kosaraju(ArrayList<Edge>[] graph, int v) {
        // step 1  Get nodes in stack
        Stack<Integer> s = new Stack<>();
        boolean[] visited = new boolean[v];
        for (int i=0; i<v; i++) {
            if (!visited[i]) {
                topSort(graph, i, visited, s);
            }
        }

        // step 2 (transpose) reverse edges
        ArrayList<Edge>[] transpose = new ArrayList[v];
        for (int i=0; i<v; i++) {
            visited[i] = false;
            transpose[i] = new ArrayList<Edge>();
        }

        for (int i=0; i<v; i++) {
            for (int j=0; j<graph[i].size(); j++) {
                Edge e = graph[i].get(j);   // src --> dest
                transpose[e.dest].add(new Edge(e.dest, e.src)); // reverse edge   dest --> src
            }
        }

        // step 3   DFS on transpose graph
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!visited[curr]) {
                System.out.print("SSC = ");
                dfs(transpose, curr, visited); // SSC
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        create(graph);
        kosaraju(graph, v);
    }
}