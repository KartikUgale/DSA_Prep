public class SuperKeyForConstructor {
    public static void main(String[] args) {
        Cat c2 = new Cat("bunny");
        Dog d1 = new Dog("german");
        d1.bread();
    }
}

class Animal {
    private String name;

    Animal(String name) {
        System.out.println(name + " is Animal");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Cat extends Animal {

    Cat(String name) {
        super(name);
        System.out.println("Cat name is "+ name);
    }
}

class Dog extends Animal {
    private String bread;
    Dog(String bread) {
        super(bread);
    }

    public void bread() {
        System.out.println(getName());
    }
}