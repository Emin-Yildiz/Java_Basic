import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        startsWithFilter();
        constainsFilter();
        stringSorted();
        numberSorted();
        streamReduce();
        IntStreamReduce();
        stringMap();
        intToDoubleMap();
        stringDistinct();
        intDistinct();
    }

    private static void stringDistinct() {
        System.out.println("---------------------------------------\nString Distinct");

        List<String> names = new ArrayList<>();
        names.add("Emin");
        names.add("Beyza");
        names.add("Zeynep");
        names.add("Muharrem");
        names.add("Muharrem");
        names.add("Muharrem");
        names.add("Muharrem");
        names.add("Muharrem");

        names.stream().distinct().forEach(System.out::println);

    }

    private static void intDistinct() {
        System.out.println("---------------------------------------\nInt Distinct");

        List<Integer> names = new ArrayList<>();
        names.add(32);
        names.add(312);
        names.add(411);
        names.add(411);
        names.add(411);
        names.add(411);
        names.add(411);
        names.add(411);

        names.stream().distinct().forEach(System.out::println);

    }
    private static void intToDoubleMap() {
        System.out.println("---------------------------------------\nInt to Double Map");
        List<Integer> numbers = Arrays.asList(23,3124,54,76,9,0,76,646,34,243,13);

        numbers.stream().mapToDouble(s -> (double)s).forEach(System.out::println);
    }

    private static void stringMap() {
        System.out.println("---------------------------------------\nString Map");

        List<String> name = Arrays.asList("Emin","Zeynep");

        name.stream().map(
                s -> "Map eklendi " + s
        ).forEach(System.out::println);
    }

    private static void IntStreamReduce() {
        System.out.println("---------------------------------------\nIntStreamReduce");
        IntStream.of(321,413,4124,14,52).reduce(1,(a,b) ->{
            System.out.println(a*b);
            return a*b;
        });
    }

    private static void streamReduce() {
        System.out.println("---------------------------------------\nStreamReduce");
        List<Integer> numbers = Arrays.asList(213,43,5,123,5,234,12,3,5,51,654);

        int result = numbers.stream().reduce(0,(a,b) -> {
                System.out.println(a + b);
                return a+b;
            }
        );
    }

    private static void numberSorted() {
        List<Integer> numbers = Arrays.asList(87,3123,4,14,34,3,5,765,456,42,9,870,796);

        List result = numbers.stream().sorted().collect(Collectors.toList());

        System.out.println("Integer sorted: " + result);
    }

    private static void stringSorted() {
        List<String> name = Arrays.asList("Zeynep", "Beyza", "Emin", "Süleyman");

        List result = name.stream().sorted().collect(Collectors.toList());

        System.out.println("String sorted: " + result);
    }

    private static void constainsFilter() {
        List<String> name = Arrays.asList("Zeynep", "Beyza", "Emin", "Süleyman");

        List result = name.stream().filter(
                s -> s.contains("a") || s.contains("e") // içinde a veya e harfi olanları döndürür.
        ).collect(Collectors.toList());
        System.out.println("Contains:" + result);
    }

    public static void startsWithFilter(){
        List<String> name = Arrays.asList("Emin", "Enes", "Muharrem", "Beyza");

        List result = name.stream().filter(
                s -> s.startsWith("E") // Baş harfi 'E' olan elemanları filtreler.
        ).collect(
                Collectors.toList()
        );
        System.out.println("StartsWith" + result);
    }
}