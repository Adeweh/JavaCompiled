package SMS;

public class Student {
    private String name;
    private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    private int numberOfCourse = 0;

    public String getName() {
        return name;
    }


    public int getStudentId() {
        return studentId;
    }

    public int addCourse() {
        return numberOfCourse++;
    }

    public int removeCourse() {
        return numberOfCourse--;
    }
}
