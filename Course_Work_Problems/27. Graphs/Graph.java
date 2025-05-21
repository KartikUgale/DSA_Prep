import java.util.ArrayList;

public class Graph {
    static class Edge {
        int ver, dest, wt;

        Edge(int v, int d, int w) {
            this.ver = v;
            this.dest = d;
            this.wt = w;
        }
    }
    
    public static void main(String[] args) {
        /*  Graph

              0
               \
             (5)\   
                 \  (1)    (2)
                  1__ __ 2__ __ 4
                   \    /
                 (3)\  /(1)
                     \/
                      3
        */

        int v = 5; // vertices
        ArrayList<Edge>[] graph = new ArrayList[v]; //  {{null}{null}{null}{null}{null}}

        for (int i=0; i<v; i++) {
            graph[i] = new ArrayList<>(); // graph[0] --> {}
        }

        // 0 vertex
        graph[0].add(new Edge(0,1,5));

        // 1 vertex
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        // 2 vertex
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));

        // 3 vertex
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        // 4 vertex
        graph[4].add(new Edge(4,2,2));

        // print all graph
        for (int i=0; i<graph.length; i++) {
            for (Edge e : graph[i]) {
                System.out.print("("+e.ver+","+e.dest+","+e.wt+")");
            }
            System.out.println();
        }
    }
}
