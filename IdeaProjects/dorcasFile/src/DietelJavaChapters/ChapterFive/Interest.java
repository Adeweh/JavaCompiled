package DietelJavaChapters.ChapterFive;

public class Interest {
    public static void main(String[] args) {
        double principal = 1000.0;

        System.out.printf("%s %20s%25s%n ", "Year", "Interest","Amount on deposit");

        for (int year = 1; year <= 10 ; year++) {
            for (double rate = 5; rate <= 10 ; rate++) {
                double amount = principal * Math.pow(1.0 + rate/100, year);

                System.out.printf("%d%20.2f%25.2f%n", year, rate, amount);

            }

        }
    }
}
