package dorcas;

public class NaturalNumbers {
    public static void main(String[] args) {

        int i;
        int number = 10;
        int Sum = 0;

        for (i = 1; i <= 10; ++i) {
            Sum += i;
        }
        System.out.println("Sum of First 10 Natural Numbers is: " + Sum);
    }
}