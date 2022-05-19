package DietelJavaChapters.ChapterTwo;

public class worldPopulationGrowthCalculator {
    public static void main(String[] args) {
        long currentPopulation = 7_000_000_000L;
        double annualGrowthRate = 1.0;
        long currentPopulation2022;
        long population2023;
        long population2024;
        long population2025;
        long population2026;
        long population2027;


        currentPopulation2022 = (long) ((currentPopulation * (annualGrowthRate / 100)) + currentPopulation);
        population2023 = (long) ((currentPopulation2022 * (annualGrowthRate / 100)) + currentPopulation2022);
        population2024 = (long) ((population2023 * (annualGrowthRate / 100)) + population2023);
        population2025 = (long) ((population2024 * (annualGrowthRate / 100)) + population2024);
        population2026 = (long) ((population2025 * (annualGrowthRate / 100)) + population2025);
        population2027 = (long) ((population2026 * (annualGrowthRate / 100)) + population2026);

        System.out.println("Estimated world population after one year: " + population2023);
        System.out.println("Estimated world population after two years: " + population2024);
        System.out.println("Estimated world population after three years: " + population2025);
        System.out.println("Estimated world population after four years: " + population2026);
        System.out.println("Estimated world population after five years: " + population2027);
    }
}
