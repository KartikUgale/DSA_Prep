
// Que - We are giving n points in a 2D plane which are located of N cars. 
//      If we are at the origin, print the nearest K cars.
import java.util.*;

public class NearestCar {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSq;
        int index;

        public Point(int x, int y, int distSq, int index) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.index = index;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distSq - p2.distSq;
        }
    }

    public static void main(String[] args) {
        int[][] pt = { { 3, 3 }, { 5, -1 }, { -2, 4 } }; // C1, C2, C3
        int k = 2; // find k nearest cars

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < pt.length; i++) {
            int distSq = pt[i][0] * pt[i][0] + pt[i][1] * pt[i][1];
            pq.add(new Point(pt[i][0], pt[i][1], distSq, i + 1));
        }

        System.out.println("Nearest cars are : ");
        while (k != 0) {
            System.out.println("car " + pq.remove().index);
            k--;
        }
    }
}