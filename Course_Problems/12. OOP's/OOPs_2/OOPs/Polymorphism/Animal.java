package OOPs.Polymorphism;
// Runtime Polymorphism
class Animal {
    public void sound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    public void sound() {
        //super.sound();
        System.out.println("Dog barks");
    }
}
