public class InterfaceExtends implements Child{
    @Override
    public void hello() {
        System.out.println("Hello from child");
    }
    public static void main(String[] args) {
        InterfaceExtends c = new InterfaceExtends();
        c.hello();
    }
}


interface Parent {
    void hello();
}


@FunctionalInterface
interface Child extends Parent{ // extends interface in interface
    
}
