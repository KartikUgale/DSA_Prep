// predicate is a Boolean Valued Function
import java.util.function.Predicate;

public class Predicate_ {
    public static void main(String[] args) {
        // check if Integer is more than hunred
        Predicate<Integer> graterThanHundred = x -> x > 100;
        System.out.println(graterThanHundred.test(10));


        // check if Integer is Even or odd
        Predicate<Integer> isEvenNum = x -> x % 1 == 0;
        System.out.println(isEvenNum.test(10));
        System.out.println(isEvenNum.test(23));


        // word start with letter 'v'
        Predicate<String> startWithV = x -> x.toLowerCase().charAt(0) == 'v';
        System.out.println(startWithV.test("Vishal"));
        System.out.println(startWithV.test("Karan"));

        Predicate<String> endWithL = x -> x.toLowerCase().charAt(x.length()-1) == 'l';

        Predicate<String> VtoL = startWithV.and(endWithL);
        System.out.println(VtoL.test("Vishal"));

    }
}
