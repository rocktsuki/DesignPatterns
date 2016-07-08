package pattern.lesson3.beverages;

public class Espresso extends Beverage {
    public Espresso() {
        // description實體變數繼承自Beverage
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
