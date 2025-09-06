import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

public class ChipestFlight { // Question- Chipest Flight within K stops (return the cheapest price from src to des with at most k stops)
    static class Edge {
        int src, dest, wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(int[][] flight, ArrayList<Edge>[] graph) {        // graph create function
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i=0; i<flight.length; i++) {
            int src = flight[i][0];
            int dest = flight[i][1];
            int wt = flight[i][2];

            graph[src].add(new Edge(src, dest, wt));
        }
    }

    static class Info {
        int ver;
        int cost;
        int stops;

        Info(int v, int c, int s) {
            this.ver = v;
            this.cost = c;
            this.stops = s;
        }
    }

    public static int chipestFlight(int[][] flights, int n, int src, int dest, int k) {
        if(src == dest) return 0;

        ArrayList<Edge>[] graph = new ArrayList[n];
        createGraph(flights, graph);

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src,0,0));

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr.stops > k) {
                break;
            }

            for (Edge e : graph[curr.ver]) {
                int v = e.dest;
                int wt = e.wt;
                if (curr.cost + wt < dist[v] && curr.stops <= k) {
                    dist[v] = curr.cost + wt;
                    q.add(new Info(v, dist[v], curr.stops+1));
                }
            }
        }

        if (dist[dest] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dist[dest];
        }
    }

    public static void main(String[] args) {    // main function
        int[][] flights = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int n = 4;
        int  src = 0, dst = 3, k = 1;       // k is maximum allowed stops

        System.out.println("Minimum Cost = "+chipestFlight(flights, n, src, dst, k));
    }
}
