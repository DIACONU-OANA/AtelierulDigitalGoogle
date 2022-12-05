package OO.ch1;

public class Main {
    public static void main(String[] args) {
        Fighter f1 =new Fighter("fighter1",100,20);
        Fighter f2 =new Fighter("fighter2",100,20);
        BoxingMatch bm = new BoxingMatch(f1,f2);
        System.out.println(bm.fight());

    }
}
