package second_module.stream_api;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, -7);
        List<String> list2 = Arrays.asList("Timur", "Serik", "Berik");
        List<Somebody> list3 = Arrays.asList(new Somebody("John", 22), new Somebody("Adam", 19));
        list.stream().forEach(System.out::println);
        list3.stream().forEach(s -> System.out.println(s.getName()));
        list.stream().filter(element -> element % 2 == 0).forEach(System.out::println);
        list2.stream().filter(element -> (element.indexOf('e') != 1)).forEach(System.out::println);
        System.out.println(list.stream().filter(s->(s > 0)).count());

        int max = list.stream().mapToInt(Integer::intValue).max().orElseThrow();
        System.out.println(max);
    }
}
