package Lambdas.FunctionalInterface;

import java.util.Random;
import java.util.function.*;

/*Consumer
BiConsumer
Predicate
BiPredicate
Supplier
Unary Operator
Binary Operator
Function
BiFunction*/

public class Example {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (number) -> System.out.println(number);
        consumer.accept(22);

        BiConsumer<Integer, String> biConsumer = (age, name)-> System.out.println("my name is "+name+" , I love the number "+age);
        biConsumer.accept(22, "Ade");

        Random random = new Random();
        Supplier<Integer> supplier = ()-> random.nextInt();
        System.out.println(supplier.get());

        Predicate<String> predicate = (name)-> name.equals("Asake") ;
        System.out.println(predicate.test("Boyo"));

        BiPredicate<Integer, String> biPredicate = (num, character)-> String.valueOf(num).equals(character);
        System.out.println(biPredicate.test(5,"5"));

        Function<String, String> func = (word) -> new StringBuilder(word).reverse().toString();
        System.out.println(func.apply("Hello!"));

        BiFunction<Integer, Integer, String> biFunction = (num1, num2) -> String.valueOf(num1*num2);
        System.out.println(biFunction.apply(2, 4));

        UnaryOperator<Integer> unaryOperator = (number)-> number*number*number;
        System.out.println(unaryOperator.apply(5));

        BinaryOperator<Integer> binaryOperator = (num1, num2)-> num1*num2;
        System.out.println(binaryOperator.apply(4,5));

    }
}
