package dorcas;

public class Kata {
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        int difference = 0;

        if (secondNumber > firstNumber) difference = secondNumber - firstNumber;
        if (firstNumber > secondNumber) difference = firstNumber - secondNumber;
        return difference;
        // int differnce = firstNumber - secondNumber;
        //if (secondNumber > firstNumber) difference + secondNumber - firstNumber;

    }

    public int product(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int quotient(int firstNumber, int secondNumber) {
        if (secondNumber == 0) return 0;
        return firstNumber / secondNumber;
        //if (secondNumber < 1) division = secondNumber / firstNumber;
        //if (secondNumber > 1) division = firstNumber / secondNumber;


    }

    public double getSavings(int savingAmount) {
        double monthly_interest_rate = 0.00417;
        double total = savingAmount * (1 + monthly_interest_rate);

        total = (savingAmount + total) * (1 + monthly_interest_rate);
        total = (savingAmount + total) * (1 + monthly_interest_rate);
        total = (savingAmount + total) * (1 + monthly_interest_rate);
        total = (savingAmount + total) * (1 + monthly_interest_rate);
        total = (savingAmount + total) * (1 + monthly_interest_rate);
        return total;

    }

    public double getBmi(double weightInPounds, double heightInInches) {


        double BMI = weightInPounds * 0.45359237 / (heightInInches * 0.0254 * heightInInches * 0.0254);

        return BMI;

    }

    public double getEnergy(double waterWeight, double finalTemp, double initialTemp) {


        double Energy = waterWeight * (finalTemp - initialTemp) * 4184;

        return Energy;

    }

    public double getFeetInMeters(double foot) {

        double feetInMeters = foot * 0.305;

        return feetInMeters;
    }

    public long getTime(long minutes) {

        long year = minutes / (365 * 24 * 60);
        //long day = (minutes % (365 * 24 * 60)) / (24 * 60);

        return year;
    }

    public double getWeight(double pounds) {

        double weight = pounds * 0.454;

        return weight;

    }

    public double getDrivingCost(double drivingDistance, double milesPerGallon, double pricePerGallon) {

        double cost = drivingDistance / milesPerGallon * pricePerGallon;

        return cost;
    }

    public double getFutureInvestment(double annualInterest, double investmentAmount, int years) {

        double monthlyInterest = (annualInterest) / 1200;

        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterest, years * 12);

        return futureInvestmentValue;
    }

    public double getInterest(int balance, double annualInterestRate) {

        double interest = balance * (annualInterestRate / 1200);

        return interest;
    }

    public double getTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {

        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        return area;

    }

    public String getGrade(int number) {
        if (number >= 90 && number <= 100) {
            return "A";
        }

        if (number >= 80 && number <= 90) {
            return "B";
        }

        if (number >= 70 && number <= 80) {
            return "C";
        }

        if (number >= 60 && number <= 69) {
            return "D";
        }

        if (number < 60) {
            return "F";
        }
        return "invalid";
    }

    public int getFlipper(int number) {
        if (number == 1) {
            return 0;
        }
        if (number == 0) {
            return 1;
        }
        return number;
    }

    public String oddEven(int number) {
        System.out.print("Enter a number: " + number);

        if (number % 2 == 0) {
            return "Even";
        }

        if (number % 2 == 1) {

            return "Odd";
        }
        return "Status";
    }

    public String getNumber(int Number) {
        int guessNumber = 22;
        System.out.print("Guess mystery number: " + Number);
        if (Number == guessNumber) {
            return "correct";
        }
        if (Number < guessNumber) {
            return "too low";

        }
        if (Number > guessNumber) {
            return "too high";
        }
        return "guess";
    }

    public String getScore(int number) {
        System.out.print("Enter a number: " + number);

        if (number >= 55) {
            return "Pass";
        }
        if (number < 55) {
            return "Fail";
        }
        return "null";
    }
}