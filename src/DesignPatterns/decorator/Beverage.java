package DesignPatterns.decorator;

public abstract class Beverage {
    private String descriere;
    private int cost;

    public Beverage(String desc,int cost){
        this.cost=cost;
        this.descriere=desc;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
