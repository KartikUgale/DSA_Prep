import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class GraphTraversals {  // BFS & DFS
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

    public static void bfs(ArrayList<Edge>[] graph) {   // Breadth First Search
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];
        q.add(0);

        while (!q.isEmpty()) {   // run until queue is not being empty
            int curr = q.remove();  // remove first int from queue and store it in curr variable

            if (!visited[curr]) {    // if curr is not visited / curr is not true
                System.out.print(curr+" "); // print curr value
                visited[curr] = true;   // make curr visited
                for (int i=0; i<graph[curr].size(); i++) {  // run loop for find all curr's neighbours(destinations)
                    Edge e = graph[curr].get(i);    // store edge of curr in Edge e 
                    q.add(e.dest);  // store / add destination of curr node in Queue
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited) {  // Depth First Search
        System.out.print(curr+" ");
        visited[curr] = true;

        for (int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                dfs(graph, e.dest, visited);
            }
        }
    }

    public static void main(String[] args) {
        /*  Graph
                  1__ __ 3
                 /       |\
                0        | 5
                 \       |/ \
                  2__ __ 4   6
        */
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];

        create(graph);
        bfs(graph);
        System.out.println();
        
        dfs(graph, 0, new boolean[v]);
    }
}
