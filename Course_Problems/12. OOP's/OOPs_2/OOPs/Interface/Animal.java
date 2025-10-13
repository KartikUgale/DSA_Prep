package OOPs.Interface;

interface Animal {
    String type = "Animal"; // final static
    void name();
    void type();
}

interface LivingThings {
    void live();
}

class Dog implements Animal, LivingThings {
    String name;
    @Override
    public void name() {
        System.out.println();
    }

    @Override
    public void type() {
        System.out.println("Animal");
    }

    @Override
    public void live() {
        System.out.println("Yes");
    }
}
