import java.util.ArrayList;

public class Que_HasPath {
    static class Edge {
        int ver, dest, wt;

        Edge(int v, int d, int w) {
            this.ver = v;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void create(ArrayList<Edge>[] graph) {
        for (int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 vertex
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        // 1 vertex
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        // 2 vertex
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        // 3 vertex
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,5));

        // 4 vertex
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        // 5 vertex
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        // 6 vertex
        graph[6].add(new Edge(6,5,1));
    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited) {
        if (src == dest) {
            return true;
        }
        visited[src] = true;
        for (int i=0; i<graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if(!visited[e.dest] && hasPath(graph, e.dest, dest, visited)) {
                return true;
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        /*  Graph
                  1__ __ 3
                 /       |\
                0        | 5
                 \       |/ \
                  2__ __ 4   6
        */
        int v=7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        create(graph);

        int src = 0;
        int dest = 6;

        System.out.println(hasPath(graph, src, dest, new boolean[v]));
    }
}
