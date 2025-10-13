import java.util.function.Function;

public class Function_ {      // Function is a Functional Interface Introduced in java 1.8
    public static void main(String[] args) {
        Function<Integer, Integer> doubleIt = x -> x * 2;
        System.out.println(doubleIt.apply(20));


        Function<Integer, Integer> tripleIt = x -> x * 3;
        System.out.println(doubleIt.andThen(tripleIt).apply(2));
    }
}