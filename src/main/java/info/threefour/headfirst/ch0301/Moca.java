package info.threefour.headfirst.ch0301;

public class Moca extends CondimentDecorator{
    Beverage beverage;
    
    public Moca(Beverage beverage) {
        this.beverage = beverage;
    }
    
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
