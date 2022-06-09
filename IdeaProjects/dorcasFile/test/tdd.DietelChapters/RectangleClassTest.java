package tdd.DietelChapters;

import DietelJavaChapters.ChapterEight.RectangleClass;

public class RectangleClassTest {

    public static void main(String[] args) {
            RectangleClass rectangle = new RectangleClass(9, 7);

            System.out.printf("Area of Rectangle = %.1f%n", rectangle.area());
            System.out.printf("Perimeter of Rectangle = %.1f ", rectangle.perimeter());
        }
    }

