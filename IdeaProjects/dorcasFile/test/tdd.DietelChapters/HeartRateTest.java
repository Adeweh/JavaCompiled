package tdd.DietelChapters;

import DietelJavaChapters.ChapterThree.HeartRates;

import java.util.Scanner;

public class HeartRateTest {
    public static void main(String[] args) {

        HeartRates newHeartRateTest = new HeartRates("Tunde", "Seriki", 12, 6, 1901);

        Scanner userInput = new Scanner(System.in);

        System.out.println("The first name is: ");
        String firstName = userInput.nextLine();
        newHeartRateTest.setFirstName(firstName);


        System.out.println("The last name is: ");
        String lastName = userInput.nextLine();
        newHeartRateTest.setLastName(lastName);

        System.out.println("The day of birth is: ");
        int dayOfBirth = userInput.nextInt();
        newHeartRateTest.setDayOfBirth(dayOfBirth);

        System.out.println("The month of birth is: ");
        int monthOfBirth = userInput.nextInt();
        newHeartRateTest.setMonthOfBirth(monthOfBirth);

        System.out.println("The year of birth is: ");
        int yearOfBirth = userInput.nextInt();
        newHeartRateTest.setYearOfBirth(yearOfBirth);

        System.out.printf("My names are %s %s, my date of birth is: %d/%d/%d%n ", newHeartRateTest.getLastName(), newHeartRateTest.getFirstName(), newHeartRateTest.getdayOfBirth(),
                newHeartRateTest.getMonthOfBirth(), newHeartRateTest.getYearOfBirth());

        System.out.printf("My current age is %d%n: ", newHeartRateTest.getAge());

        System.out.printf("The maximum heart rate is %d%n: ", newHeartRateTest.getMaxHeartRate());

        System.out.printf("My target heart-rate range is %d%n: ", newHeartRateTest.getTargetHR(), newHeartRateTest.getTargetHR2());




    }
}
