package Streams;

import java.io.*;

public class Example1 {
    public static void main(String[] args) {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            String sentence = bufferedReader.readLine();
            System.out.println("we typed:: " + sentence);
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
