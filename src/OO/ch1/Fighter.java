package OO.ch1;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAtack;

    public void attack(Fighter fighter){
        fighter.health = fighter.health -damagePerAtack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamagePerAtack() {
        return damagePerAtack;
    }

    public Fighter(String name, int health, int damagePerAtack) {
        this.name = name;
        this.health = health;
        this.damagePerAtack = damagePerAtack;
    }
}
