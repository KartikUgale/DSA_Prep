package OOPs;

public class FunctionalInterface {
    public static void main(String[] args) {

//        functionalInterface obj1 = new functionalInterface() {          // we can use lambda expression for functional Interface
//            @Override
//            public void eat() {
//
//            }
//        };

        functionalInterface obj2 = () -> {                  // This is lambda expression

        };




        Hunger h1 = (hunger) -> {
            return hunger;
        };

        h1.hungry("Yes");



        Hunger h2 = (hunger) -> "yes";

    }
}

@java.lang.FunctionalInterface
interface functionalInterface { // only one method is required for Functional Interface
    void eat();
}


@java.lang.FunctionalInterface
interface Hunger {
    String hungry(String hungry);
}

