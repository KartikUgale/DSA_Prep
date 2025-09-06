public class pairsInArray {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        pairs(numbers);
    }

    public static void pairs(int num[]) {
        int pairs = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + num[i] + "," + num[j] + ") ");
                pairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + pairs);
    }
}
