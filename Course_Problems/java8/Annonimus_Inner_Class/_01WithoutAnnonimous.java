// Without Annonimus inner class we need extra implemented class to use Iterface

public class _01WithoutAnnonimous {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name();
        s1.age();
    }
}

interface Identity {
    String name();
    int age();
}

class Student implements Identity {
    @Override
    public String name() {
        System.out.println("ram");
        return "ram";
    }

    @Override
    public int age() {
        System.out.println(12);
        return 12;
    }
}
