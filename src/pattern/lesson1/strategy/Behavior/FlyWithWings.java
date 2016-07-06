package pattern.lesson1.strategy.Behavior;

public class FlyWithWings implements  FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
