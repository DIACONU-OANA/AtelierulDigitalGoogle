package DesignPatterns.decorator;

public class Chocolate extends Topping{
    public Chocolate(Beverage bev){
        super("Chocolate",3,bev);
    }
}
