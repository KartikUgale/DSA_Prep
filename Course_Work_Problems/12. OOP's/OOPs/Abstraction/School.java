package OOPs.Abstraction;

abstract class School {
    String schoolName;
    int std;
    abstract void setStd(int standard);
    abstract void setSchoolName(String schoolName);

    void school(String name) {
        schoolName = name;
    }

}

class Student extends School {

    @Override
    void setStd(int standard) {
        std = standard;
    }

    @Override
    void setSchoolName(String SchoolName) {
        schoolName = schoolName;
    }
}
