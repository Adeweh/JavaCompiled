package Streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Locale;

public class Example2 {
    public static void main(String... args) {
        try(var bufferedReader = new BufferedReader(new InputStreamReader (System.in));
            var printStream = new PrintStream("test.txt")){
            String sentence = bufferedReader.readLine();
            printStream.println(sentence.toUpperCase());
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}

