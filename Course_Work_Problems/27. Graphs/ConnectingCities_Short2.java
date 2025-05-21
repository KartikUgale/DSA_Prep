import java.util.PriorityQueue;

public class ConnectingCities_Short2 {  // Question- find minimum cost paths to connect all cities. return cost; 🕯️use this code
    static class Edge implements Comparable<Edge> {
        int dest;
        int cost;

        Edge(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }

        public int compareTo(Edge e2) {
            return this.cost - e2.cost;
        }
    }

    public static int minCostCities(int[][] cities) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[cities.length];
        pq.add(new Edge(0,0));
        int minCost = 0; int count = 0;

        while (!pq.isEmpty() && count < cities.length) {
            Edge curr = pq.poll();
            if(!visited[curr.dest]) {
                visited[curr.dest] = true;
                minCost += curr.cost;
                count++; // new city visited

                for (int i=0; i < cities.length; i++) {
                    if (cities[curr.dest][i] != 0 && !visited[i]) {
                        pq.add(new Edge(i, cities[curr.dest][i]));
                    }
                }
            }
        }

        return (count==cities.length) ? minCost : -1;   // cheack all cities are visited if not means some city does not have any path

    }

    public static void main(String[] args) {
        int[][] cities = {{0,1,2,3,4},  // i is src & j is dest & value is cost;    (e.g.- i=0,j=0,cost=0.   i=0,j=1,cost=1)
                        {1,0,5,0,7},
                        {2,5,0,6,0},
                        {3,0,6,0,0},
                        {4,7,0,0,0}};

        int minCost = minCostCities(cities);
        if (minCost != -1) {
            System.out.println("Minimum cost to visit all Cities = "+minCost);
        } else {
            System.out.println("all Cities are Not connected !!");
        }
    }
}
