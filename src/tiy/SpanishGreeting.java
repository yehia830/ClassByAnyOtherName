package tiy;

/**
 * Created by Yehia830 on 9/5/16.
 */
public class SpanishGreeting implements Greeting{
    @Override
    public void Greet() {
        String name = "mundo";
        GreetSomeone("mundo");
    }

    @Override
    public void GreetSomeone(String name) {
        System.out.println("Hola, " + name);
    }
}
