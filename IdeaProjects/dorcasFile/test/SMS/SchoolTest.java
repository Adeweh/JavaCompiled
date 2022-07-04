package SMS;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SchoolTest {


    School school;
    @BeforeEach
    void setUp() {
        school = new School();
    }
    @Test
    public void testThatWeCanAddStudent(){
        Student newStudent = new Student("Dee", 1001);
        Student newStudent1 = new Student("Dodo", 1002);
        school.addStudent(newStudent);
        school.addStudent(newStudent1);
        assertEquals(2,school.getNumberOfStudents());
    }

    @Test
    public void testThatWeCanRemoveStudent() {
        Student newStudent = new Student("Dee", 1001);
        Student newStudent1 = new Student("Dodo", 1002);
        Student newStudent2 = new Student("Didi", 1003);
        school.addStudent(newStudent);
        school.addStudent(newStudent1);
        school.addStudent(newStudent2);

        school.removeStudent(newStudent1);
        school.removeStudent(newStudent2);

        assertEquals(1, school.getNumberOfStudents());
    }
    @Test
    public void testThatWeCanAddCourse(){
        Course newCourse = new Course("Biology", 101);
        school.addCourse(newCourse);
        assertEquals(1, school.getNumberOfCourses());

    }
    @Test
    public void testThatWeCanRemoveCourses(){
        Course newCourse = new Course("Biology", 101);
        school.addCourse(newCourse);
        school.removeCourse(newCourse);
        assertEquals(0, school.getNumberOfCourses());


    }

}
