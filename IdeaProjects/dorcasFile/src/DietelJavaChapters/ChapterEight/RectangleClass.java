package DietelJavaChapters.ChapterEight;

public class RectangleClass {
        private double length;
        private double width;

        public RectangleClass() {
            this(1, 1);
        }

        public RectangleClass(int length, int width) {
            this.setLength(length);
            this.setWidth(width);
        }

    public void setLength(double length) {
        if (length <= 0.0 || length >= 20.0)
            throw new IllegalArgumentException("length must be 0-20");
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    public void setWidth(double width) {
        if (width <= 0.0 || width >= 20.0)
            throw new IllegalArgumentException("width must be 0-20");
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public double area() {
            return getWidth() * getLength();
        }

        public double perimeter() {
            return 2 * (getWidth() + getLength());
        }
      public String toString() {
            return String.format("Rectangle%nWidth: %.1f%nLength: %.1f%n", getWidth(), getLength());
}




    }



