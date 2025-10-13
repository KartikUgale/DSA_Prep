import java.util.function.Consumer;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Consumer_ {
    public static void main(String[] args) {
        Consumer<Integer> consume = x -> System.out.println(x);
        consume.accept(90);

        
        List<Integer> list = Arrays.asList(1, 2, 3, 6, 7, 3, 4);
        Consumer<List<Integer>> printList = x -> {
            for (int i : x) {
                System.out.print(i + " ");
            }
        };

        printList.accept(list);
    }
    
}
