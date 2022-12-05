package OO.ch3;

public abstract class Animal{
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }
    protected Animal() {
        this.legs = 0;
    }
    abstract void eat();
    public void walk() {
        System.out.println("I have " + legs + " legs");
    }
}