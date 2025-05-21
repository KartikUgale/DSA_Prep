public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Ram");
        System.out.println(s1.getName());
        s1.setNo(20);
        System.out.println(s1.getNo());
        s1.setSchool("AVCOE"); // School is static for that reson is also aplicable for s2 student
        System.out.println(s1.getSchool());

        Student s2 = new Student();
        s2.setName("Sham");
        System.out.println(s2.getName());
        s2.setNo(12);
        System.out.println(s2.getNo());
        System.out.println(s2.getSchool()); // School is static for that reson is same for all Student.
                                            // if we changed school name for s2 then it will change for s1 student also

        System.out.println(s2.getPercentage(100, 100, 100));
    }
}

class Student {
    String name;
    int no;
    static String school;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setNo(int number) {
        this.no = number;
    }

    int getNo() {
        return this.no;
    }

    void setSchool(String school) {
        this.school = school;
    }

    String getSchool() {
        return this.school;
    }

    static int getPercentage(int math, int scince, int english) { // common function for every student
        return (math + scince + english) / 3;
    }

}