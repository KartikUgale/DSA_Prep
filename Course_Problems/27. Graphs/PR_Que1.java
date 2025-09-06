import java.util.ArrayList;

public class PR_Que1 {  // Detect Cycle
    static class Edge {
        int src, dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void create(ArrayList<Edge>[] graph) {
        for (int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 vertex
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        // 0 vertex
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,0));

        // 0 vertex
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,3));

        // 3 vertex
        graph[3].add(new Edge(3,2));
    }

    public static void main(String[] args) {
        /*
                0 __ 1
                 \   /
                  \ /
                   2 __ 3
        */
        int n=3;
        ArrayList<Edge>[] graph = new ArrayList[n];
        create(graph);
    }
}
