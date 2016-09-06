package tiy;

/**
 * Created by Yehia830 on 9/5/16.
 */
public class FrenchGreeting implements Greeting{
    @Override
    public void Greet() {
        GreetSomeone("tout le monde");
    }

    @Override
    public void GreetSomeone(String name) {

        System.out.println("Salut " + name);
    }
}
