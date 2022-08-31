package DietelJavaChapters.ChapterSix;

public class HypotenuseCalculations {
    public static void main(String[] args) {

        double side1 = 3.0;
        double side2 = 4.0;

        double hypotenuseT = hypotenuse(side1, side2);

        System.out.printf("The hypotenuse of Triangle 1 is: %.2f%n ", hypotenuseT);

        hypotenuseT = hypotenuse(5.0, 12.0);

        System.out.printf("The hypotenuse of Triangle 2 is: %.2f%n ", hypotenuseT);

        side1 = 8.0;
        side2 = 15.0;

        hypotenuseT = hypotenuse(side1, side2);

        System.out.printf("The hypotenuse of Triangle 3 is: %.2f%n ", hypotenuseT);



    }
    public static double hypotenuse (double side1, double side2){
        double hypotenuse;

        hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        return hypotenuse;

    }
}
