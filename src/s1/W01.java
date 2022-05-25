package s1;

import java.awt.print.Printable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class W01 {
    interface Printable {
        void print(String s);
    }

    public static void main(String[] args) {
        Printable printer = s -> System.out.println(s);
        printer.print("Hello, world");
        List<String> af= Arrays.asList("ed","dsf","fff");




        sd();

    }

    public static void sd(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        sumAll(numbers, n -> true);
        sumAll(numbers, n -> n % 2 == 0);
        sumAll(numbers, n -> n > 3);
        numbers.forEach(System.out::println);
        System.out.println(sumAll(numbers, n -> n % 2 == 0));
    }

    public static int sumAll(List<Integer> numbers, Predicate<Integer> p) {
        int total = 0;
        for (int number : numbers) {
            if (p.test(number)) {
                total += number;
            }
        }
        return total;
    }

    public static List<String> sort(List<String> list){
        Collections.sort(list, (a, b) -> a.compareTo(b));
        return list;
    }
}
