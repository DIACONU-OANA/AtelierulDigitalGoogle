package OO.ch3;

public class Main {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        System.out.println("Fish :");
        d.walk();
        d.eat();
        System.out.println("");
        System.out.println("Cat :");
        System.out.println(c.getName());
        c.play();
        c.eat();
        c.walk();
        System.out.println("");
        System.out.println("Animal(fish) :");
        a.walk();
        a.eat();
        System.out.println("");
        System.out.println("Animal(spider) :");
        e.walk();
        e.eat();
        System.out.println("");
        System.out.println("Pet(cat) :");
        System.out.println(p.getName());
        p.play();
        System.out.println("");
        System.out.println("Fish cast:");
        Fish f2 = (Fish) a;
        f2.eat();
        f2.walk();
        System.out.println("");
        System.out.println("Spider cast:");
        Spider s2 = (Spider) e;
        s2.eat();
        s2.walk();

    }
}
