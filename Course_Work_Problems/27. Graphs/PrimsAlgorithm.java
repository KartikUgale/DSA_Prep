import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgorithm {       // Prims algorithm used for minimum cost(wighted) path to connect/traverse all nodes
    static class Edge {
        int src, dest, wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void create(ArrayList<Edge>[] graph) {
        for (int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,3,30));
        graph[0].add(new Edge(0,2,15));
        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));
        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));
        graph[3].add(new Edge(3,0,30));
        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));
    }

    static class Pair implements Comparable<Pair>{
        int ver;
        int cost;

        public Pair(int ver, int cost) {
            this.ver = ver;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void prims(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0,0));
        int finalCost = 0; // MST cost or Total minimum weight

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!visited[curr.ver]) {
                visited[curr.ver] = true;
                finalCost += curr.cost;

                for(Edge e : graph[curr.ver]) {
                    pq.add(new Pair(e.dest, e.wt));
                }
            }
        }

        System.out.println("Final cost of MSP = "+finalCost);
    }

    public static void main(String[] args) {
        /*
                        0
                   10  /|\ 15
                      1 | 2             0 to 3 have 30 wt
                   40  \|/ 50
                        3
        */
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        create(graph);
        prims(graph);
    }
}
