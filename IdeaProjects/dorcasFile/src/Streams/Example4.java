package Streams;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Example4 {
    public static void main(String[] args) {
            try (PrintWriter writer = new PrintWriter("test.txt");){

                writer.println("Knowledge is power");
              /* writer.flush();
               writer.close();*/
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

