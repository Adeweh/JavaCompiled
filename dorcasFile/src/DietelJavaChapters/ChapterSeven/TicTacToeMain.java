package DietelJavaChapters.ChapterSeven;

import java.util.Objects;
import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String[] args) {
        TicTacToe mainGame = new TicTacToe();
        mainGame.display();

        System.out.println("Let's Begin Game!!!");
        System.out.println("Player 1 = X");
        System.out.println("Player 2 = O");

        Scanner userInput = new Scanner(System.in);


        String result = " ";


        do {
            System.out.print("Player 1 your turn ");
            mainGame.Player(1, userInput.nextInt());
            result = mainGame.result();
            if(result==" "){
                System.out.println("Player 2 your turn");
                mainGame.Player(2, userInput.nextInt());
                result = mainGame.result();
            }


        } while (Objects.equals(result, " "));

        System.out.println(result);


    }
}
