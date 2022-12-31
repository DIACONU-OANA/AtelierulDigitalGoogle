package concurrency.ch3;

public class Player extends Thread{
    private String nume;
    private String choice;
    private int nr;
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public void run(){
        nr=getRandomNumber(1,3);
        if(nr==1) {this.choice="piatra";}
        if(nr==2){this.choice="hartie";}
        if(nr==3){this.choice="foarfeca";}

    }
    public Player(String nume){
        this.nume=nume;
    }

    public String getNume() {
        return nume;
    }

    public String getChoice() {
        return choice;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nume='" + nume + '\'' +
                ", choice='" + choice + '\'' +
                '}';
    }
}
