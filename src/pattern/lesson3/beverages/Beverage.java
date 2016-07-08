package pattern.lesson3.beverages;

// 基底抽象類別
public abstract class Beverage {
    String description = "Unknown Beverage";
    String size;

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
