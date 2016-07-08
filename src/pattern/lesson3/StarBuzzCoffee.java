package pattern.lesson3;

import pattern.lesson3.beverages.Beverage;
import pattern.lesson3.beverages.DarkRoast;
import pattern.lesson3.beverages.Decaf;
import pattern.lesson3.beverages.Espresso;
import pattern.lesson3.condiment.Mocha;
import pattern.lesson3.condiment.Soy;
import pattern.lesson3.condiment.Whip;

public class StarBuzzCoffee {
    public static void main(String args[]){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Soy(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new Decaf();
        beverage2.setSize("L");
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
