package DietelJavaChapters.ChapterFive;

public class SumOfSeries {
    public static void main(String[] args) {

        int counter = 1;
        long sumOfSeries = 0;
        System.out.printf("%4s %25s%n", "number", "Sum of Series");

        while (counter >= 1 && counter <= 100){
            sumOfSeries += counter;
            System.out.printf("%4d %25d%n", counter, sumOfSeries);
            counter++;
        }
    }
}
