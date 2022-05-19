package DietelJavaChapters.ChapterThree;

import java.time.LocalDate;
import java.util.Scanner;


public class HeartRates {
    private String firstName;
    private String lastName;
    private int monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;

    private double Age;
    private double currentYear;

    private double rate;

    private double targetHR;
    private double targetHR2;

    public HeartRates(String firstName, String lastName, int monthOfBirth, int dayOfBirth, int yearOfBirth) {

    }

        public void setFirstName (String firstName){
            this.firstName = firstName;
        }
        public void setLastName (String lastName){
            this.lastName = lastName;
        }
        public void setMonthOfBirth ( int monthOfBirth){
            this.monthOfBirth = monthOfBirth;
        }
        public void setDayOfBirth ( int dayOfBirth){
            this.dayOfBirth = dayOfBirth;
        }
        public void setYearOfBirth ( int yearOfBirth){
            this.yearOfBirth = yearOfBirth;
        }

        public String getFirstName () {
            return firstName;
        }
        public String getLastName () {
            return lastName;
        }
        public int getMonthOfBirth () {
            return monthOfBirth;
        }
        public int getdayOfBirth () {
            return dayOfBirth;
        }
        public int getYearOfBirth () {
            return yearOfBirth;
        }

        public int getAge () {
        LocalDate currentDate = LocalDate.now();
            int currentYear = currentDate.getYear();
            return currentYear - yearOfBirth;

        }
        public int getMaxHeartRate () {
            int age = getAge();
            return 220 - age;

        }
        public int getTargetHR () {
            int maxRate = getMaxHeartRate();
            return  maxRate * 50 / 100;
        }
        public int getTargetHR2 () {
            int maxRate = getMaxHeartRate();
            return  maxRate * 85 / 100;
        }

    }







