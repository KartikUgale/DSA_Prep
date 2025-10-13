public class _01WithAnnonimous {
    public static void main(String[] args) {
        Students student = new Students() {
            @Override
            public String name() {
                return "ram";
            }

            @Override
            public int id() {
                return 903;
            }

            @Override
            public int age(int a) {
                return a;
            }
        };

        System.out.println(student.name());
        System.out.println(student.age(12));
    }
}

interface Students {
    String name();
    int id();
    int age(int a);
}
