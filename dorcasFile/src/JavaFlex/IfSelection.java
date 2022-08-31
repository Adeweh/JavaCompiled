package JavaFlex;

public class IfSelection {
    public static void main(String[] args) {
        System.out.println("chapter 1");
        int number = 2;
        if(number < 3){
        System.out.println("chapter "+ number);
        System.out.println("chapter 3");
        System.out.println("chapter 7");
        }
        else {System.out.println("chapter 4");
        System.out.println("chapter 5");}


        int i = 1;
        while(i <= 10){
            if (i % 2 == 1){
                System.out.println(i);
            }
            i++;
        }
        System.out.println();
        for (int j = 0; j < 10; j++) {
            if (j % 2 == 0 && j <= 6) {
                System.out.println(j);
            }
        }

    }
}
