import java.util.ArrayList;

public class DetectCycleUsingDFS {
    static class Edge {
        int src, dest;      // source, destinstion

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void create(ArrayList<Edge>[] graph) {
        for (int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 vertex
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        // 1 vertex
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        // 2 vertex
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        // 3 vertex
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        // 4 vertex
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        // 5 vertex
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        // 6 vertex
        graph[6].add(new Edge(6,5));
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        for (int i=0; i<graph.length; i++) {
            if (!visited[i]) {
                if (detectCycleUtil(graph, i, visited, -1)) {
                    return true;    // cycle exist
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited, int parent) {
        visited[curr] = true;
        for (int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            //case 3
            if (!visited[e.dest] && detectCycleUtil(graph, e.dest, visited, curr)) {
                return true;
            }
            //case 1
            else if (visited[e.dest] && e.dest!=parent) {
                return true;
            } 
            // case 2 --> do nothing (continue) 
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
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        create(graph);

        System.out.println(detectCycle(graph));
    }
}
