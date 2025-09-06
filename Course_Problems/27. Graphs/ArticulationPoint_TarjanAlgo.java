import java.util.ArrayList;

public class ArticulationPoint_TarjanAlgo {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void create(ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        /*
                1---0---3---5
                |  /    |  /
                | /     | /
                2       4
        */

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,0));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, int par, int[] dt, int[] low, int time, boolean[] vis, boolean[] ap) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;

        for (Edge e : graph[curr]) {
            int neigh = e.dest;
            if (par == neigh) {
                continue;
            } else if (vis[neigh]) {
                low[curr] = Math.min(low[curr], dt[neigh]);
            } else {
                dfs(graph, neigh, curr, dt, low, time, vis, ap);
                low[curr] = Math.min(low[curr], low[neigh]);
                if (par != -1 && dt[curr] <= low[neigh]) {
                    ap[curr] = true;
                }
                children++;
            }
        }

        if (par == -1 && children > 1) {
            ap[curr] = true;
        } 
    }

    public static void tarjanArticulation(ArrayList<Edge>[] graph, int v) {
        boolean[] vis = new boolean[v];
        boolean[] ap = new boolean[v];
        int[] dt = new int[v];
        int[] low = new int[v];
        int time = 0;

        for (int i=0; i<v; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, dt, low, time, vis, ap);
            }
        }

        for (int i=0; i<v; i++) {
            if (ap[i]) {
                System.out.println("Articulation point = "+ i);
            }
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        create(graph);

        tarjanArticulation(graph, v);
    }
}

