// Functional Interface with lambda expression

public class _01WithLambda {
    public static void main(String[] args) {
        Engineer se = () -> "Software Engineer";
        System.out.println(se.getPosition());

        Engineer editor = () -> "Editor";
        System.out.println(editor.getPosition());
    }
}

@FunctionalInterface
interface Engineer {
    String getPosition();
}


// with lamda expression 
//          - no need to create extra implementation class for implementation single abstract interface (functional interface)