package tdd.classWork;

import classWork.Kata;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class KataTest {
        @Test
        public void additionTest() {
            Kata calculator = new Kata();
            //int result = calculator.add(2, 6);//data name called add

            //assertEquals(8, result);
            assertEquals(8, calculator.add(2, 6));
            assertEquals(66, calculator.add(54, 12));
        }

        @Test

        public void subtractionTest() {
            Kata calculator = new Kata();
            int result = calculator.subtract(4, 2);

            assertEquals(2, result);

        }

        @Test
        public void absoluteSubtractionTest() {
            Kata calculator = new Kata();
            int result = calculator.subtract(2, 4);
            assertEquals(2, result);
        }

        @Test
        public void productTest() {
            Kata calculator = new Kata();
            int result = calculator.product(5, 5);
            assertEquals(25, result);
        }

        @Test
        public void quotientTest() {
            Kata calculator = new Kata();
            int result = calculator.quotient(10, 5);
            assertEquals(2, result);
        }

        @Test
        public void absoluteQuotientTest() {
            Kata calculator = new Kata();
            int result = calculator.quotient(10, 0);
            assertEquals(0, result);
        }

        @Test
        public void calculateSavingsTest() {
            Kata calculator = new Kata();
            double savings = calculator.getSavings(100);
            BigDecimal testSavings = new BigDecimal(savings).setScale(2, RoundingMode.DOWN);
            assertEquals(608.81, testSavings.doubleValue());
        }

        @Test
        public void calculateMassTest() {
            Kata calculator = new Kata();
            double bmi = calculator.getBmi(95.5, 50);
            BigDecimal testMass = new BigDecimal(bmi).setScale(4, RoundingMode.UP);
            assertEquals(26.8573, testMass.doubleValue());
        }

        @Test
        public void calculateEnergyTest() {
            Kata calculator = new Kata();
            double energy = calculator.getEnergy(55.5, 10.5, 3.5);
            assertEquals(1625484.0, energy);
        }

        @Test
        public void calculateHeightTest() {
            Kata calculator = new Kata();
            double feet = calculator.getFeetInMeters(16.5);
            assertEquals(5.0325, feet);
        }
        @Test
        public void calculateTimeTest(){
            Kata calculator = new Kata();
            long time = calculator.getTime(1000000000);
            assertEquals(1902, time);
        }

        @Test
        public void calculateWeightTest() {
            Kata calculator = new Kata();
            double weight = calculator.getWeight(55.5);
            assertEquals(25.197, weight);
        }

        @Test
        public void calculateDistanceTest() {
            Kata calculator = new Kata();
            double drivingCost = calculator.getDrivingCost(900.5, 25.5, 3.55);
            BigDecimal testDrivingCost = new BigDecimal(drivingCost).setScale(2, RoundingMode.DOWN);
            assertEquals(125.36, testDrivingCost.doubleValue());
        }

        @Test
        public void futureValueTest() {
            Kata calculator = new Kata();
            double futureInvestment = calculator.getFutureInvestment(4.25, 1000.56, 1);
            BigDecimal testFutureInvestment = new BigDecimal(futureInvestment).setScale(2, RoundingMode.DOWN);
            assertEquals(1043.92, testFutureInvestment.doubleValue());
        }

        @Test
        public void calculateInterestTest() {
            Kata calculator = new Kata();
            double interest = calculator.getInterest(1000, 3.5);
            BigDecimal testInterest = new BigDecimal(interest).setScale(5, RoundingMode.UP);
            assertEquals(2.91667, testInterest.doubleValue());
        }

        @Test
        public void calculateTriangleTest() {
            Kata calculator = new Kata();
            double triangle = calculator.getTriangle(1.5, -3.4, 4.6, 5, 9.5, -3.4);
            BigDecimal testTriangle = new BigDecimal(triangle).setScale(1, RoundingMode.DOWN);
            assertEquals(33.6, testTriangle.doubleValue());
        }

        @Test
        public void gradeTest() {
            Kata calculator = new Kata();
            String grade = calculator.getGrade(95);

            assertEquals("A", grade);
        }

        @Test
        public void bitFlipperTest() {
            Kata calculator = new Kata();
            int flipper = calculator.getFlipper(1);
            assertEquals(0, flipper);
        }

        @Test
        public void oddEvenTest() {
            Kata calculator = new Kata();
            int number = 12;
            assertEquals("Even", calculator.oddEven(number));
        }

        @Test
        public void mysteryNumber(){
            Kata calculator = new Kata();
            String guessNumber = calculator.getNumber(9);
            assertEquals("too low", guessNumber);
        }
        @Test
        public void scoreTest(){
            Kata calculator = new Kata();
            String score = calculator.getScore(67);
            assertEquals("Pass", score);

        }
        @Test
        public  void factorsTest(){
            int factors = Kata.noOfFactorsOf(10);
            assertEquals(4, factors);
        }
        @Test
        public void primeNumberTest(){
            boolean isPrime = Kata.isPrime(5);
            assertTrue(isPrime);
        }


    }



