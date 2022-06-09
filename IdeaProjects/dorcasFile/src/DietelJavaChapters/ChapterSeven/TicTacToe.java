package DietelJavaChapters.ChapterSeven;

import java.util.Objects;

public class TicTacToe {
    String[][] gameTic;
    public final int LENGTH = 3;

    private enum plays{X,O,EMPTY}


    public TicTacToe() {
        this.gameTic = new String[LENGTH][LENGTH];

    }

    public void display() {
        for (int i = 0; i < gameTic.length; i++) {
            for (int j = 0; j < gameTic.length; j++) {
                if (i == 0) {
                    gameTic[i][j] = "%d";
                    gameTic[i][j] = gameTic[i][j].formatted(j + 1);
                }
                if (i == 1) {
                    gameTic[i][j] = "%d";
                    gameTic[i][j] = gameTic[i][j].formatted(j + 4);
                }
                if (i == 2) {
                    gameTic[i][j] = "%d";
                    gameTic[i][j] = gameTic[i][j].formatted(j + 7);

                }
            }
        }
        for (int i = 0; i <LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                System.out.print(gameTic[i][j]+ "\t\t\t");

            }
            System.out.println();
            System.out.println("_".repeat(27));
            System.out.println();

        }
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                gameTic[i][j] = " ";
            }


        }
    }
    public void Player(int playerNumber, int number) {

        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                if (number >= 1 && number <= 3 && Objects.equals(gameTic[0][number - 1], " ") && playerNumber == 1) {
                    gameTic[0][number - 1] = "X";
                }

                if (number >= 1 && number <= 3 && Objects.equals(gameTic[0][number - 1], " ") && playerNumber == 2) {
                    gameTic[0][number - 1] = "O";
                }


                if (number >= 4 && number <= 6 && Objects.equals(gameTic[1][number - 4], " ") && playerNumber == 1) {
                    gameTic[1][number - 4] = "X";
                }
                if (number >= 4 && number <= 6 && Objects.equals(gameTic[1][number - 4], " ") && playerNumber == 2) {
                    gameTic[1][number - 4] = "O";
                }


                if (number >= 7 && number <= 9 && Objects.equals(gameTic[2][number - 7], " ") && playerNumber == 1) {
                    gameTic[2][number - 7] = "X";
                }
                if (number >= 7 && number <= 9 && Objects.equals(gameTic[2][number - 7], " ") && playerNumber == 2) {
                    gameTic[2][number - 7] = "O";
                }


            }
        }
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                System.out.print(gameTic[i][j]+ "\t\t\t");

            }
            System.out.println();
            System.out.println("_".repeat(27));
            System.out.println();

        }

//        result();
    }

    public String result() {
        String result = " ";
        String one= String.valueOf(plays.X);

        int row1=0, row2=0, row3=0;
        for (int i = 0; i < gameTic.length ; i++) {
            if (Objects.equals(gameTic[0][i],one)){
                row1+=1;
            }
            if (Objects.equals(gameTic[1][i],one)){
                row2+=1;
            }
            if (Objects.equals(gameTic[2][i],one)){
                row3+=1;
            }

        }
        if(row1==3||row2==3||row3==3){
            result = "Player 1 Wins!!!";
        }

        //ROWS - HORIZONTAL- PLAYER 1
//        if (Objects.equals(gameTic[0][0], "X") && Objects.equals(gameTic[0][1], "X") && Objects.equals(gameTic[0][2], "X")){
//            result = "Player 1 Wins!!!";
//
//        }
//        if (Objects.equals(gameTic[1][0], "X") && Objects.equals(gameTic[1][1], "X") && Objects.equals(gameTic[1][2], "X")){
//            result = "Player 1 Wins!!!";
//
//        }
//        if (Objects.equals(gameTic[2][0], "X") && Objects.equals(gameTic[2][1], "X") && Objects.equals(gameTic[2][2], "X")){
//            result = "Player 1 Wins!!!";
//
//        }

        //COLUMNS-VERTICAL- PLAYER 1
        if (Objects.equals(gameTic[0][0], "X") && Objects.equals(gameTic[1][0], "X") && Objects.equals(gameTic[2][0], "X")){
            result = "Player 1 Wins!!!";
        }
        if (Objects.equals(gameTic[0][1], "X") && Objects.equals(gameTic[1][1], "X") && Objects.equals(gameTic[2][1], "X")) {
            result = "Player 1 Wins!!!";
        }
        if (Objects.equals(gameTic[0][2], "X") && Objects.equals(gameTic[1][2], "X") && Objects.equals(gameTic[2][2], "X")) {
            result = "Player 1 Wins!!!";
        }


        //ROWS - VERTICAL- PLAYER 2
        if (Objects.equals(gameTic[0][0], "O") && Objects.equals(gameTic[0][1], "O") && Objects.equals(gameTic[0][2], "O")){
            result = "Player 2 Wins!!!";

        }
        if (Objects.equals(gameTic[1][0], "O") && Objects.equals(gameTic[1][1], "O") && Objects.equals(gameTic[1][2], "O")){
            result = "Player 2 Wins!!!";

        }
        if (Objects.equals(gameTic[2][0], "O") && Objects.equals(gameTic[2][1], "O") && Objects.equals(gameTic[2][2], "O")) {
            result = "Player 2 Wins!!!";
        }

        //COLUMNS-VERTICAL- PLAYER 2
        if (Objects.equals(gameTic[0][0], "O") && Objects.equals(gameTic[1][0], "O") && Objects.equals(gameTic[2][0], "O")){
            result = "Player 2 Wins!!!";
        }
        if (Objects.equals(gameTic[0][1], "O") && Objects.equals(gameTic[1][1], "O") && Objects.equals(gameTic[2][1], "O")) {
            result = "Player 2 Wins!!!";
        }
        if (Objects.equals(gameTic[0][2], "O") && Objects.equals(gameTic[1][2], "O") && Objects.equals(gameTic[2][2], "O")) {
            result = "Player 2 Wins!!!";
        }

        //DIAGONAL-PLAYER 1
        if (Objects.equals(gameTic[0][0], "X") && Objects.equals(gameTic[1][1], "X") && Objects.equals(gameTic[2][2], "X")) {
            result = "Player 1 Wins!!!";
        }
        if (Objects.equals(gameTic[0][2], "X") && Objects.equals(gameTic[1][1], "X") && Objects.equals(gameTic[2][0], "X")) {
            result = "Player 1 Wins!!!";
        }

        //DIAGONAL- PLAYER 2
        if (Objects.equals(gameTic[0][0], "O") && Objects.equals(gameTic[1][1], "O") && Objects.equals(gameTic[2][2], "O")) {
            result = "Player 2 Wins!!!";
        }
        if (Objects.equals(gameTic[0][2], "O") && Objects.equals(gameTic[1][1], "O") && Objects.equals(gameTic[2][0], "O")) {
            result = "Player 2 Wins!!!";
        }

            return result;
    }
}

