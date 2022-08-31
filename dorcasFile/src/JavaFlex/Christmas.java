package JavaFlex;

import java.util.Scanner;

public class Christmas {
    public static void main(String[] args) {
        int day = printSongIntro();
        printSong(day);
    }
    private static boolean printSong(int day) {
            switch (day) {
                case 12:
                   printDay12();
                case 11:
                    printDay11();
                case 10:
                    printDay10();
                case 9:
                    printDay9();
                case 8:
                    printDay8();
                case 7:
                    printDay7();
                case 6:
                    printDay6();
                case 5:
                    printDay5();
                case 4:
                    printDay4();
                case 3:
                    printDay3();
                case 2:
                    printDay2();
                case 1:
                    printDay1();
                default:
                    System.out.println("Enter a valid christmas day between 1 and 12");
                    printSongIntro();

            }
        System.out.println();
        return false;
    }

    private static int printSongIntro() {
        Scanner userInput = new Scanner(System.in);


        System.out.println("Enter day for song: ");
        int day = userInput.nextInt();
        System.out.print("On the " + day);

        printPrefixForDay(day);


        System.out.println(" day of Christmas \nMy true love gave to me");
        return day;
    }

    private static void printPrefixForDay(int day) {

        switch (day) {
            case 1 -> System.out.print("st");
            case 2 -> System.out.print("nd");
            case 3 -> System.out.print("rd");
            default -> System.out.print("th");
        }
    }

    private static void printDay1(){
            System.out.println("A partridge in a pear tree");
        }

        private static void printDay2(){
            System.out.println("Two turtle doves and");
        }

        private static void printDay3(){
            System.out.println("Three French hens");
        }

        private static void printDay4(){
            System.out.println("Four calling birds");
        }

        private static void printDay5(){
            System.out.println("Five gold rings");
        }

        private static void printDay6(){
            System.out.println("Six geese a-laying");
        }

        private static void printDay7(){
            System.out.println("Seven swans a-swimming");
        }

        private static void printDay8(){
            System.out.println("Eight maids a-milking");
        }

        private static void printDay9(){
            System.out.println("Nine ladies dancing");
        }
        private static void printDay10(){
            System.out.println("Ten lords a-leaping");
        }
        private static void printDay11(){
            System.out.println("Eleven pipers piping");
        }
        private static void printDay12(){
            System.out.println("Twelve drummers drumming");
        }

}


