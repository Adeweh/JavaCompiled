package DietelJavaChapters.ChapterSeven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe newGame;

    @BeforeEach
    void setup() {
        newGame = new TicTacToe();

        for (int i = 0; i < newGame.LENGTH; i++) {
            for (int j = 0; j < newGame.LENGTH; j++) {
                newGame.gameTic[i][j] = " ";
            }


        }
    }
    @AfterEach
    void display(){
        for (int i = 0; i < newGame.LENGTH; i++) {
            for (int j = 0; j < newGame.LENGTH; j++) {
                System.out.print(newGame.gameTic[i][j]+ "\t\t\t");

            }
            System.out.println();
            System.out.println("_".repeat(27));
            System.out.println();

        }

    }
    @Test
    void testForArrayTable() {
        // System.out.println(newGame.gameTic.length);
        for (int i = 0; i < newGame.LENGTH; i++) {
            System.out.println();
            for (int j = 0; j < newGame.LENGTH; j++) {
                System.out.print(newGame.gameTic[i][j] + "\t\t\t");
            }
            System.out.println();
            System.out.println("_".repeat(27));
            System.out.println();

        }
    }
    @Test
    void testForEmptyArrayTable(){
        for (int i = 0; i < newGame.LENGTH; i++) {
            for (int j = 0; j < newGame.LENGTH; j++) {
                System.out.print(newGame.gameTic[i][j] = " " + "\t\t\t");

            }
            System.out.println();
            System.out.println("_".repeat(40));
            System.out.println();

        }
    }
    @Test
    void testThatGameWorksOnRows(){
        newGame.Player(1, 1);
        newGame.Player(2, 3);

        newGame.Player(1, 5);
        newGame.Player(2,6);

        newGame.Player(1, 7);
        newGame.Player(2,8);
    }
    @Test
    void testThatPlayerCanWin(){
        newGame.Player(1, 1);
        newGame.Player(2, 3);

        newGame.Player(1, 5);
        newGame.Player(2,6);

        newGame.Player(1, 7);
        newGame.Player(2,8);

        newGame.Player(1, 9);
        System.out.println(newGame.result());




    }




}