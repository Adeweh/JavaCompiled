package Streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamExplained {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.empty();

        Stream<Integer> numbers2 = Stream.of(10, 20, 30);

        Supplier<Integer> sup =()-> new Random().nextInt();
        Stream<Integer> numbersList = Stream.generate(sup);
        //numbersList.forEach((number) -> System.out.println(number));

        UnaryOperator<Integer> unaryOperator = (integer)-> integer + 1;
        Stream<Integer> badCharacters = Stream.iterate(1, unaryOperator).limit(10);
        badCharacters.forEach((c) -> System.out.println(c));

    }

}
