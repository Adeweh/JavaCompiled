package Arrays;

public class StoreValues {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int [] numbers = new int[ARRAY_LENGTH];

        for (int counter = 0; counter < numbers.length; counter++) {
            numbers[counter] = 2 + 2 * counter;
        }
        System.out.printf("%s   %s%n", "Index", "Value");

        for (int counter = 0; counter < numbers.length; counter++){

            System.out.printf(" %d      %d%n ",counter, numbers[counter]);
        }
    }
}
