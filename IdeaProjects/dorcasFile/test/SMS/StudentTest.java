package SMS;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    Student student;
    @BeforeEach
    void setUp() {
        student = new Student("Dee", 1001);

    }
    @Test
    public void testThatWeHaveStudent(){
        assertNotNull(student);
    }

    @Test
    public void testThatStudentCanAddCourse(){
        student.addCourse();
        assertEquals(1,student.addCourse());
    }
    @Test
    public void testThatStudentCanRemoveCourse(){
        student.addCourse();
        student.removeCourse();
        assertEquals(0, student.addCourse());
    }


}
