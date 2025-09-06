import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {
    public static int minCutCost(Integer[] verCost, Integer[] horCost) {
        Arrays.sort(verCost, Collections.reverseOrder());
        Arrays.sort(horCost, Collections.reverseOrder());

        int hc = 0, vc = 0; // Horizontal cut & Vertical cut
        int hp = 1, vp = 1; // Horizontal piece & Vertical piece
        int cost = 0;

        while (hc < horCost.length && vc < verCost.length) {
            if (verCost[vc] <= horCost[hc]) { // then do Vertical cut
                cost += (horCost[hc] * vp);
                hc++; // horizontal cut ++
                hp++; // horizontal piece ++
            } else {
                cost += (verCost[vc] * hp);
                vc++;
                vp++;
            }
        }

        while (hc < horCost.length) {
            cost += (horCost[hc] * vp);
            hc++;
            hp++;
        }
        while (vc < verCost.length) {
            cost += (verCost[vc] * hp);
            vc++;
            vp++;
        }

        return cost;
    }

    public static void main(String[] args) {
        Integer[] verCost = { 2, 1, 3, 1, 4 };
        Integer[] horCost = { 4, 1, 2 };

        int cost = minCutCost(verCost, horCost);

        System.out.println("minimum cost for cut = " + cost);
    }
}