package pattern.lesson3.condiment;

import pattern.lesson3.beverages.Beverage;

// 裝飾者類別，基底一樣是Beverage
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription(); // 所有裝飾者都必須重新實踐getDescription
}
