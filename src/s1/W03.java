package s1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
public class W03 {
    public static void main(String[] args) {
        List<String> stringCollection = Arrays.asList( "ddd2","aaa2","bbb1","aaa1","bbb3","ccc","bbb2","ddd1");
        Stream<String> stream = stringCollection.stream();
//        stringCollection
//                .stream()
//                .filter(s -> !s.startsWith("a"))
//                .forEach(x -> System.out.println(x)); //System.out::println
//
//        stringCollection
//                .stream()
//                .sorted()
//                .forEach(x -> System.out.print(x));

        stringCollection
                .stream()
                .filter(s -> !s.startsWith("a"))
                .map(String::toUpperCase)
                .filter(s -> !s.startsWith("D"))
                .map(x -> "*" + x)
                .filter(s -> !s.startsWith("*D"))
                .sorted((a,b) -> b.compareTo(a))
                .forEach(System.out::println);
        // есть ли хоть один эленст начинающийся с а
        boolean a =  stringCollection
                .stream()
                .anyMatch(s -> s.startsWith("a")); // allMatch noneMatch
        boolean b =  stringCollection
                .stream()
                .allMatch(s -> s.startsWith("a"));

        long c =  stringCollection
                .stream()
                .count();
        System.out.println(c);

        Optional<String> d =
                stringCollection
                    .stream()
                    .reduce((s1,s2) -> s1 + "#" + s2);
        d.ifPresent(System.out::println);













        Stream<String> stream1 = Stream.of("ddd2",
                "aaa2",
                "bbb1",
                "aaa1",
                "bbb3",
                "ccc",
                "bbb2",
                "ddd1"
        );

        //System.out.println(isNegative(-45));
    }

    static boolean isNegative(int str) {
        return str == -45;
    }
}


