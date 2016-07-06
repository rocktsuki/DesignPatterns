package pattern.lesson1.strategy;

import pattern.lesson1.strategy.Behavior.FlyRocketPowered;
import pattern.lesson1.strategy.Duck.Duck;
import pattern.lesson1.strategy.Duck.MallardDuck;
import pattern.lesson1.strategy.Duck.ModelDuck;

public class MiniDuckSimulator {
    // 定義了演算法家族，個別封裝起來，讓他們之間可以互相替換，
    // 此模式讓演算法的變動，不會影響到使用演算法的程式。
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
