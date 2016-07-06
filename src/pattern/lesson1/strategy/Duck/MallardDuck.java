package pattern.lesson1.strategy.Duck;

import pattern.lesson1.strategy.Behavior.FlyWithWings;
import pattern.lesson1.strategy.Behavior.Quck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quck();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
