package Lambdas;

public class Main {
    public static void main(String[] args) {
        Human h = (String word) -> System.out.println(word + " I am a man");
        h.speak("Hello");
    }
}
