package Streams;

import java.io.*;

public class Example3 {
    public static void main(String[] args) {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            String sentence = bufferedReader.readLine();
            PrintWriter printWriter = new PrintWriter(new FileWriter("text.txt"));
            printWriter.println(sentence.toUpperCase());
           // printWriter.flush();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
