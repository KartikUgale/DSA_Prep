package OOPs.InnerClass;

public class InnerClass {

    class InnerC01{     // object creation required to call Non static class
        int num;
    }

    public static void main(String[] args) {
        InnerC01 i1 = new InnerClass().new InnerC01();
        i1.num = 89;
        System.out.println(i1.num);

        InnerClass obj1 = new InnerClass();
        InnerC01 i2 = obj1.new InnerC01();
        i2.num = 100;
        System.out.println(i2.num);
    }
}
