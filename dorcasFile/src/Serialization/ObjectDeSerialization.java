package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectDeSerialization {

    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("dog"))){

            var dog = (Dog) objectInputStream.readObject();
            System.out.println(dog);
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
