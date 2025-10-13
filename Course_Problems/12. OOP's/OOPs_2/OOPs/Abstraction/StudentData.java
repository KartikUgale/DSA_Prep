abstract class School {
    private String schoolName;
    private int std;    

    void setSchool(String name) {
        schoolName = name;
    }

    abstract void setStd(int standard);

    public void setStandard(int std) {
        this.std = std;
    }

    public int getStd() {
        return this.std;
    }

}

class Student extends School {
    @Override
    void setStd(int standard) {
        this.setStandard(standard);
    }
}

public class StudentData {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStd(2);
        s1.setSchool("nm");
    }
}
