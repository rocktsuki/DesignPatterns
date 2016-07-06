package pattern.lesson1.strategy.Behavior;

public class Quck implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
