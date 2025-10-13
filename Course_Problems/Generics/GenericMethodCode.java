public class GenericMethodCode {
    public static <E extends Number, V extends Number> double add(E a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));

        Animal a = new Animal("Deer");  // Raw type object
        System.out.println(a.getName());
        a.changeName(890);
        System.out.println(a.getName());


        Animal<String> b = new Animal<>("Dog");
        System.out.println(b.getName());
        b.changeName("891");
        System.out.println(b.getName());

    }
}

class Animal<E> {
    private E name;

    Animal (E Animal) {
        name = Animal;
    }

    public void changeName(E name) {
        this.name = name;
    }

    public E getName() {
        return this.name;
    }

}
