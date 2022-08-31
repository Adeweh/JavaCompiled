package classWork;

//prompt user to input score
//if score is between 90-100 print Grade A
//if score is between 80-90 print Grade B
//if score is between 70-80 print Grade C
//if score is between 60-69 print Grade D
//if score is less than 60 print Grade F


import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner score = new Scanner(System.in);

        System.out.print("Enter a score: ");
        int number = score.nextInt();

        if (number >= 90 && number <= 100) {
            System.out.println("Grade A");
        }

        if (number >= 80 && number <= 90) {
            System.out.println("Grade B");
        }

        if (number >= 70 && number <= 80) {
            System.out.println("Grade C");
        }

        if (number >= 60 && number <= 69) {
            System.out.println("Grade D");
        }

                if (number < 60) {
                    System.out.println("Grade F");
                }


            }

    }



      /*  if (number >= 90) {
            System.out.println("Grade A");
        } else {
            if (number >= 80) {
                System.out.println("Grade B");
            } else {
                if (number >= 70) {
                    System.out.println("Grade C");
                } else {
                    if (number >= 60) {
                        System.out.println("Grade D");
                    } else {
                        if (number < 60) {
                            System.out.println("Grade F");
                        }
                    }
                }
            }
        }
    }
}
        if (number >= 90) {
            System.out.println("Grade A");
        } else if (number >= 80) {
                System.out.println("Grade B");
            } else if (number >= 70) {
                    System.out.println("Grade C");
                } else if (number >= 60) {
                        System.out.println("Grade D");
                    } else if (number < 60) {
                            System.out.println("Grade F");
                        }




    }*/


