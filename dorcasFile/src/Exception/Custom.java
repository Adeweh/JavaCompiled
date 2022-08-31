package Exception;

import java.util.Scanner;

public class Custom {
    private static final Scanner userInput = new Scanner(System.in);

    public static int collectInput() throws Cohort11Exception{
        System.out.println("Enter a number: ");
        int input = userInput.nextInt();
        if (input < 0){
            throw new Cohort11Exception("Can not take a negative integer");
        }
        return 0;
    }

    public static void main(String[] args) {
        try{
            collectInput();
        } catch (Cohort11Exception cE){
            System.out.println(cE.getMessage());
        }
    }
}
