package SMS;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CourseTest {
        Course course;
        @BeforeEach
        void setUp() {
            course = new Course("Biology", 101);

        }
        @Test
        public void testThatCourseCanBeCreated(){
            assertNotNull(course);
        }


}
