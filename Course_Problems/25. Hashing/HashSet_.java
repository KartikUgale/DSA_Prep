import java.util.HashSet;

public class HashSet_ {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(45);
        hs.add(67);
        hs.add(78);
        hs.add(45); // this will not add in set because only unique values are store in set

        System.out.println(hs.contains(78));

        hs.remove(67);
        System.out.println(hs);

        System.out.println(hs.size());
    }
}
