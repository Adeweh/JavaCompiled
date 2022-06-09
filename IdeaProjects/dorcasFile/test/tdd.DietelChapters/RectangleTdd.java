package tdd.DietelChapters;

import DietelJavaChapters.ChapterEight.RectangleClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTdd {

    RectangleClass rectangleTdd;

    @BeforeEach
    public void setup(){
        rectangleTdd = new RectangleClass();
    }

    @Test
    public void testForPerimeter() {
        rectangleTdd.setLength(10);
        rectangleTdd.setWidth(10);

        double perimeter = rectangleTdd.perimeter();

        assertEquals(40, perimeter);
    }

    @Test
    public  void testForArea(){
        rectangleTdd.setWidth(10);
        rectangleTdd.setLength(10);

        double area = rectangleTdd.area();
        assertEquals(100, area);







    }
}
