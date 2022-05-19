package DietelJavaChapters.ChapterTwo;

public class GreatPyramidOfGiza {
    public static void main(String[] args) {
        long numberOfStones = 2_300_000L;
        double averageWeight = 2.5;
        int years = 20;
        double weightPerYear;
        double weightPerHour;
        double weightPerMinute;

        weightPerYear = (float) (numberOfStones * years) / years;
        weightPerHour = averageWeight/(years * 24);
        weightPerMinute = weightPerHour/60;

        System.out.println("The weight of the pyramid built each year: " + weightPerYear);
        System.out.printf("The weight of the pyramid built each hour: %.4f%n", weightPerHour);
        System.out.printf("The weight of the pyramid built each minute:%.4f ", weightPerMinute);




    }
}
