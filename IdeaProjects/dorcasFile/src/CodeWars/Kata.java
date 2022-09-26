package CodeWars;

/*Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.

You will always get a valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
The array will always contain letters in only one case.*/

public class Kata {
    public static void main(String[] args) {
        char[] myArray = {'a','b','c','e'};
        System.out.println(findMissingLetter(myArray));
    }
    public static char findMissingLetter(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i + 1] - array[i] != 1) {
                return (char) (array[i] + 1);
            }
        }
        return 0;
    }


}


