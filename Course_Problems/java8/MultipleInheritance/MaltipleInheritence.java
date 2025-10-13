package MultipleInheritance;
public class MaltipleInheritence {
    public static void main(String[] args) {
        C c = new C();
        c.show();

        A.show();
    }
}

interface A {
    static void show() {    // static not allows to inherite
        System.out.println("A");
    }
}

interface B {
    default void show() {   // default can be inherite
        System.out.println("B");
    }
}

class C implements B{
}
