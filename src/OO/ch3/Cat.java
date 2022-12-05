package OO.ch3;

public class Cat extends Animal implements Pet {
    private String name;
    public Cat(String name) {
        super(4);
        this.name = name;
    }
    public Cat() {
        this("");
    }

    @Override
    public void play() {
        System.out.println("I play with a ball");
    }

    @Override
    void eat() {
        System.out.println("I eat fish");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
