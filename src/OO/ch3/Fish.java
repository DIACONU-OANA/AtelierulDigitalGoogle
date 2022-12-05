package OO.ch3;

public class Fish extends Animal {

    public Fish() {
        super(0);
    }

    @Override
    void eat() {
        System.out.println("I eat fish food");
    }

    @Override
    public void walk() {
        System.out.println("I cant walk, no legs");
    }
}
