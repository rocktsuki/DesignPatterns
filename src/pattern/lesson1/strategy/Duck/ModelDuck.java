package pattern.lesson1.strategy.Duck;

import pattern.lesson1.strategy.Behavior.FlyNoWay;
import pattern.lesson1.strategy.Behavior.Quck;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quck();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
