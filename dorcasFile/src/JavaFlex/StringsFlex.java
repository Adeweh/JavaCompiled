package JavaFlex;

import java.util.Locale;

public class StringsFlex {
    public static void main(String[] args) {
        String message = "Dorcas";

        System.out.println(message.toLowerCase(Locale.ROOT));
        System.out.println(message.repeat(5));
        System.out.println(message.indexOf('c'));
        System.out.println(message.length());
        System.out.println(message.toString());
    }
}
