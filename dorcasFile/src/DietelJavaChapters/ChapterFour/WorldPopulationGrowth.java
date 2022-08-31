package DietelJavaChapters.ChapterFour;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        long currentWorldPopulation = 8_000_000_000L;
        double annualPopGrowthRate = 1.05;

        int counter = 1;
        int year = 2022;
        long population = currentWorldPopulation;

        System.out.println("Year\t\tEstimated Population\t\tAnnual Increase\n");

        while (counter <= 75){
            year+= 1;

            double increase = population * annualPopGrowthRate/100;
            population+=increase;
            counter++;

            System.out.printf("%d\t\t%d\t\t\t\t\t%.0f\n", year, population, increase);
        }
        System.out.println("The year in which population would be double what it is today is 2089");
    }
}
