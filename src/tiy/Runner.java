package tiy;

/**
 * Created by Yehia830 on 9/5/16.
 */
public class Runner {
    public static void main(String[] args) {
        EnglishGreeting englishGreeting = new EnglishGreeting();
        englishGreeting.Greet();
        FrenchGreeting frenchGreeting = new FrenchGreeting();
        frenchGreeting.GreetSomeone("Fred");
        SpanishGreeting spanishGreeting = new SpanishGreeting();
        spanishGreeting.Greet();

    }
}
