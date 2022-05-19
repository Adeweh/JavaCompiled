package DietelJavaChapters.ChapterFour;

import java.util.Scanner;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N\tN2\tN3\tN4");

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.printf("%.0f   ", Math.pow(i + 1, j));
                if (j == 4) {
                    System.out.println();
                }
            }


        }

    }
}


