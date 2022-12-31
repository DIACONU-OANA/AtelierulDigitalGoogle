package concurrency.ch3;

public class Main {
    public static void winner(Player j1, Player j2) {
        if (j1.getChoice() == "piatra") {
            if (j2.getChoice() == "hartie") {
                System.out.println(j2.toString() + " won");
                System.out.println(j1.toString() + " lost");
                return;
            }
            if (j2.getChoice() == "piatra") {
                System.out.println(j1.toString());
                System.out.println(j2.toString());
                System.out.println("Remiza");
                return;
            } else {
                System.out.println(j1.toString() + " won");
                System.out.println(j2.toString() + " lost");
            }

        }
        if (j1.getChoice() == "hartie") {
            if (j2.getChoice() == "foarfeca") {
                System.out.println(j2.toString() + " won");
                System.out.println(j1.toString() + " lost");
                return;
            }
            if (j2.getChoice() == "hartie") {
                System.out.println(j1.toString());
                System.out.println(j2.toString());
                System.out.println("Remiza");
                return;
            } else {
                System.out.println(j1.toString() + " won");
                System.out.println(j2.toString() + " lost");
            }
        }
        if (j1.getChoice() == "foarfeca") {
            if (j2.getChoice() == "piatra") {
                System.out.println(j2.toString() + " won");
                System.out.println(j1.toString() + " lost");
                return;
            }
            if (j2.getChoice() == "foarfeca") {
                System.out.println(j1.toString());
                System.out.println(j2.toString());
                System.out.println("Remiza");
                return;
            } else {
                System.out.println(j1.toString() + " won");
                System.out.println(j2.toString() + " lost");
            }
        }

    }
    public static void main (String[]args) throws InterruptedException {
        Player jucator = new Player("Andrei");
        Player jucator2 = new Player("Cici");
        jucator.start();
        jucator.join();
        jucator2.start();
        jucator2.join();
        winner(jucator, jucator2);

    }
}
