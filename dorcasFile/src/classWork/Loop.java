package classWork;

public class Loop {
    /*public static void main(String[] args) {
        int i = 0;
        while (i < 20) {
            i = i + 2;
            System.out.print(i + " ");

        }
    }

    public static void main(String[] args) {
        int i = 0;
        for (; i < 20; ) {
            i = i + 2;
            System.out.print(i + " ");

        }
    }

     */


 public static void main(String[] args){
        int number = 0;
        while (number % 2 == 0 && number < 20){
            number = number + 2;
            System.out.print(number + " ");


        }
    }
}

