// functional interface without Lambda expression

public class _01NoLambda {
    public static void main(String[] args) {
        Employee emp = new SoftEngineer();
        System.out.println(emp.position());
    }
}

@FunctionalInterface
interface Employee {
    String position();  // Abstract function
}

class SoftEngineer implements Employee {
    public String position() {
        return "SDE1";
    }
}