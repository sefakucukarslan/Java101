package StudentInformationSystem;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double snote;


    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0.0;
        this.snote = 0.0;



    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;

        } else {
            System.out.println("Teacher and Branch does not match.");
        }

    }

    void printTeacher() {
        this.teacher.print();
    }
}
