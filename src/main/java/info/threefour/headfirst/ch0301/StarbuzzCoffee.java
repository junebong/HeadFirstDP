package info.threefour.headfirst.ch0301;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());
                
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Moca(beverage2);
        beverage2 = new Moca(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());
        
    }
}
