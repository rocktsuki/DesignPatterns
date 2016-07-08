package pattern.lesson3.condiment;

import pattern.lesson3.beverages.Beverage;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        String size = beverage.getSize();
        if ("L".equals(size)) {
            cost += .20;
        } else if ("M".equals(size)) {
            cost += .15;
        } else if ("S".equals(size)) {
            cost += .10;
        }
        return cost;
    }
}
