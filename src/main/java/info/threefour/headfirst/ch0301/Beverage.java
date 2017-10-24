package info.threefour.headfirst.ch0301;

public abstract class Beverage {
    String description = "Unknown Beverage";
    
    public String getDescription() {
        return description;
    }
    
    public abstract double cost();
    
}
