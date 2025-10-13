public class Leet3304 {
    public static void main(String[] args) {
        int k = 9;
        System.out.println(kthCharacter(k));
    }

    public static char kthCharacter(int k) {
        String str = "abbcbccd";
        k--;    // 1 based index

        if (k < 8) return str.charAt(k);

        int index = k - 8;
        int next = k / 8;
        
        return (char) (str.charAt(index) + next);
    }

    // 1 2 3 4 5 6 7 8
    // a b b c b c c d
    // b c c d c d d e  +1
    // b c c d c d d e  +1
    // c d d e d e e f  +2
    // b c d...
    // c d d...
    // c d d...
    // d e e...
}