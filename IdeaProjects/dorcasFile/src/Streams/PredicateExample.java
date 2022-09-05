package Streams;


import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class PredicateExample {
    public static void main(String[] args) {


    Stream<Integer> numbers = Stream.empty();

    Stream<Integer> numbersA = Stream.of(10,20,30,40);
        System.out.println();

    Supplier<Integer> supplier=()->new Random().nextInt();
    Stream<Integer> numbers3 = Stream.generate(supplier);
        numbers3.forEach((number)-> System.out.println(number));
        System.out.println();

    UnaryOperator<Integer> unaryOperator=((number) -> number+1);
    Stream<Integer> badInt=
            Stream.iterate(1,unaryOperator)
                    .limit(10);
        badInt.forEach((number)-> System.out.println(number));
}
}
