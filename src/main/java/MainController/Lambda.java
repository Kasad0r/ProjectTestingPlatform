package MainController;

import java.util.*;
import java.util.function.*;

public class Lambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, Comparator.naturalOrder());
        System.out.println(names);
        BinaryOperator<Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(5, 3));
        UnaryOperator<Integer> addSameInt = x -> x + x;
        System.out.println(addSameInt.apply(5));
        Function<Integer, String> convert = x -> String.valueOf(x) + " долларов";
        String s = convert.apply(5);
        Consumer<Integer> printer = x -> System.out.printf("%d долларов \n", x);
        printer.accept(600); // 600 долларов

        class User {

            private String name;

            String getName() {
                return name;
            }

            User(String n) {
                this.name = n;
            }
        }
        Supplier<User> userFactory = () -> {

            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = in.nextLine();
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();

        System.out.println("Имя user1: " + user1.getName());
        System.out.println("Имя user2: " + user2.getName());


    }


}
