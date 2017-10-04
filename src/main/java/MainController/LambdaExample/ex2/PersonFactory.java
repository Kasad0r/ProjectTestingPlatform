package MainController.LambdaExample.ex2;

interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}