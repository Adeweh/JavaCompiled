package DietelJavaChapters.ChapterFive;

public class DivisibleBy3 {
    public static void main(String[] args) {
        int sumOfIntegers = 0;

        for (int i = 1; i <= 30 ; i++) {
            if (i % 3 == 0)
                sumOfIntegers+= i++;

        }
        System.out.println(sumOfIntegers);
    }
}
