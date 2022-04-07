package lambda;

import com.sun.security.jgss.GSSUtil;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainLambda {

    public static void main(String[] args) {
        Predicate<String> pred = input -> input.length() > 8;
        Predicate<String> notPred = Predicate.not(pred);

        System.out.println(pred.test("hello world"));
        System.out.println(notPred.test("hello world"));


        Function<String, Integer> func = input -> input.length();
        System.out.println(func.apply("hello world"));

        BiFunction<String, String, Integer> biFunction = (a,b) -> (a + b).length();
        System.out.println(biFunction.apply("hello", "world"));


        Supplier<String> supplier = () -> "supplied";
        System.out.println(supplier.get());

        Consumer<Integer> consumer = input -> System.out.println("number is " + input);
        consumer.accept(10);





    }
}
