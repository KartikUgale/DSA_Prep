public class breakTheLoop {
    public static void main (String args[]) {
        int a = 10;
        for (int i = 1; i <= a ;i++) {
            if(i == 5) {
                System.out.println("Reached to 5, hence im stop");
                break;
            }
            System.out.println(i);
        }
    }
}
