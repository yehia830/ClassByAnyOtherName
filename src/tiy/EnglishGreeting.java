package tiy;

/**
 * Created by Yehia830 on 9/5/16.
 */
public class EnglishGreeting implements Greeting{

    @Override
    public void Greet() {
        String name = "world";
        GreetSomeone("world");
    }

    @Override
    public void GreetSomeone(String name) {
        System.out.println("Hello " + name);
    }
}
