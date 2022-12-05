package DesignPatterns.decorator;

public abstract class Topping extends Beverage{
    private Beverage beverage;

    public Topping(String desc, int cost, Beverage beverage) {
        super(desc, cost);
        this.beverage = beverage;
    }
    public String getDescriere(){
        return beverage.getDescriere() + ","+ super.getDescriere();
    }

    public int getCost(){
        return beverage.getCost()  + super.getCost();
    }
}
