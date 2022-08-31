package Streams;

import java.io.*;

public class ReadFromFile {
    public static void main(String[] args) {
        try {

           // FileInputStream fileInputStream = new FileInputStream();
            FileReader fileReader = new FileReader("/home/adeh/Documents/CompiledJava/IdeaProjects/dorcasFile/test.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String sentence = reader.readLine();
            System.out.println(sentence);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
