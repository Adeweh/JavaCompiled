package classWork;

public class StarPyramid {
    public static void main(String[] args) {
        int i;
        int j;
        int number = 9;

        for (i=0; i<number; i++){
            for (j=number - i; j>1; j--){
                System.out.print(" ");
            }
            for (j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
