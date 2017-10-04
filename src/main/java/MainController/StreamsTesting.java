package MainController;

import java.util.ArrayList;
import java.util.List;

public class StreamsTesting {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("Hello");
        strings.add("World");
        strings.add("!");
        strings.add("We love");
        strings.add("Java 8");
    strings.stream().filter(s->s.startsWith("W")).forEach(System.out::println);
    strings.stream().filter(s -> s.startsWith("Ja")).forEach(System.out::println);
    }

}
