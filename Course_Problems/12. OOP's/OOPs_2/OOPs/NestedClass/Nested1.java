public class Nested1 {
    public static void main(String[] args) {
        Outer outer1 = new Outer();

        Outer.Inner in1 = outer1.new Inner();

        in1.innerMsg();
    }
}

class Outer {
    private String msg = "Outer message";

    class Inner {
        void innerMsg() {
            System.out.println(msg);
        }
    }
}


class OutEr {
    static String msg = "Outer call";

    class Inner {
        void innerMsg() {
            System.out.println(msg);
        }
    }
}
