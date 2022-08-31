package Lambdas.Animal;

public class Main {
    public static void main(String[] args) {
        Animal cat = System.out::println;
        //Animal cat = sound-> System.out.println(sound)
        cat.speak("meow");
    }
}
