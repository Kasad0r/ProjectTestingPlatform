package MainController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamsTesting {
    public static void main(String[] args) {
        /*List<String> strings = new ArrayList<>();

        strings.add("Hello");
        strings.add("World");
        strings.add("!");
        strings.add("We love");
        strings.add("Java 8");
        strings.stream().filter(s -> s.startsWith("W")).forEach(System.out::println);
        strings.stream().filter(s -> s.startsWith("Ja")).forEach(System.out::println);*/
        Random random = new Random();
        random.nextInt(100);
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integers.add(random.nextInt(100));
            System.out.println(integers.get(i));
        }
        System.out.println("-------------------------------------");
        integers.stream().filter(s->s.equals(5)).forEach(System.out::println);
        System.out.println("______________________________________");
        integers.stream().filter(s->s.equals(2)).forEach(System.out::println);

    }

}
