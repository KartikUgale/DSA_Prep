public class FriendsPairing { // find number of pairing ways
    public static int pairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return pairs(n - 1) + ((n - 1) * pairs(n - 2)); // friends remain after my 1 pair is = pairs(n-1)
    } // more chances of pairs with remaining friends is = pairs(n-1)*pairs(n-2)

    public static void main(String[] args) {
        System.out.println(pairs(4));
    }
}