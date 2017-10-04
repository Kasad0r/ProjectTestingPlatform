package MainController.LambdaExample.ex1;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
