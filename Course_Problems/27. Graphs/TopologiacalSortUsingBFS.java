import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class TopologiacalSortUsingBFS {
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

    public static void calcIndeg(ArrayList<Edge>[] graph, int[] indeg) {
        for (int i=0; i<graph.length; i++) {
            for (Edge e : graph[i]) {
                indeg[e.dest]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge>[] graph) {
        int[] indeg = new int[graph.length];
        calcIndeg(graph, indeg);
        Queue<Integer> q = new LinkedList<>();

        for (int i=0; i<indeg.length; i++) {
            if(indeg[i] == 0) {
                q.add(i);
            }
        }

        //bfs
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr+" ");

            for (Edge e : graph[curr]) {
                indeg[e.dest]--;
                if (indeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
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
