package Lambdas.FunctionalProgramming;

public class Example {
    public static void main(String[] args) {
        Staff staff = hours -> overtime(hours);
        staff.work(2);

    }

    private static void overtime(int hours) {
        int doubleWorkingHours = hours*2;
        System.out.println("Buhari works "+ doubleWorkingHours+" hours a year");
    }

}
