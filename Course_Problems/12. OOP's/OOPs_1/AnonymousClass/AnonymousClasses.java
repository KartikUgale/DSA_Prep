package OOPs.AnonymousClass;

// Anonymous classes usually extends subclasses or implements interfaces.
// Types :- 1. a superclass that an anonymous class extends.
//          2. an Interface that an anonymous class implements.


public class AnonymousClasses {

//    class innerClass extends OuterClass {
//
//    }

    OuterClass obj0 = new OuterClass() {       // Anonymous class (class without name)     We create it when we want to use this class only once
        void sing(){

        }

        @Override
        public void outerMethod() {

        }
    };

    superInterfaceClass obj = new superInterfaceClass() {
        @Override   // Override just indicate the use of abstract function to coder (it is Optional)
        public void right() {

        }
    };
}

class OuterClass {
    public void outerMethod() {

    }
}

interface superInterfaceClass {
    void right();
}
