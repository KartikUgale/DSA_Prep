import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class ConnectedComponents {
    static class Edge {
        int ver, dest, wt;

        Edge(int v, int d, int w) {
            this.ver = v;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void create(ArrayList<Edge>[] graph) {    // create graph
        for(int i=0; i<graph.length; i++) {
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

        // 7 vertex
        graph[7].add(new Edge(7,8,1));

        // 8 vertex
        graph[8].add(new Edge(8,7,1));
        graph[8].add(new Edge(8,9,1));

        // 9 vertex
        graph[9].add(new Edge(9,8,1));
    }

    public static void bfs(ArrayList<Edge>[] graph) {       // Breadth First Search Traversal (BFS)
        boolean[] visited = new boolean[graph.length];

        for(int i=0; i<graph.length; i++) {
            if(!visited[i]) {
                bfsUtil(graph, i, visited);
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge>[] graph, int start, boolean[] visited) {     // BFS helper function
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        if(!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr+" ");

            if(!visited[curr]) {
                for(int i = 0; i<graph[curr].size(); i++) {     // or we can use -->   for(Edge e = graph[curr]) {curr = e.dest}
                    Edge e = graph[curr].get(i);
                    curr = e.dest;
                    q.add(curr);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph) {       // Depth First Search Traversal (DFS)
        boolean[] visited = new boolean[graph.length];
        for(int i=0; i<graph.length; i++) {
            if(!visited[i]) {
                dfsUtil(graph, i, visited);
            }
        }
    }

    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited) {  // DFS helper function
        System.out.println(curr);
        visited[curr] = true;

        for(int i=0; i<graph.length; i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]) {
                dfsUtil(graph, curr, visited);
            }
        }
    }

    public static void main(String[] args) {        // main function
        /*  Graph
                  1__ __ 3
                 /       |\      7
                0        | 5      \
                 \       |/ \      8__ __ 9
                  2__ __ 4   6
                component 1         component 2
        */

        int v=10;
        ArrayList<Edge>[] graph = new ArrayList[v];
        create(graph);
        bfs(graph);
    }
}