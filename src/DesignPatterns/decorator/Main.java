package DesignPatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage coffe = new Coffe();
        Topping t = new Whip(coffe);
        Beverage m = new Chocolate(t);
        System.out.println(m.getDescriere());
        System.out.println(m.getCost());

        Beverage milkTea= new Milk(new Tea());
        System.out.println(milkTea.getDescriere());
        System.out.println(milkTea.getCost());
    }
}
