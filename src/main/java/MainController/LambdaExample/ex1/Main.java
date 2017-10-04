package MainController.LambdaExample.ex1;

public class Main {
    public static void main(String[] args) {
      /*  Converter<String, Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123*/


        Something something = new Something();
        Converter<String, String> converter = something::startsWith;
        String converted = converter.convert("Java");
        System.out.println(converted);    // "J"

       /* int num = 1;
        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
        num = 3;*/ // Не компилит ибо инт не файнал
    }
}
