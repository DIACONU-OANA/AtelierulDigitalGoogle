package generics.ch2;

public class Heels implements Shoe{
    private String colour;
    private Integer number;

    public Heels(String colour, Integer number) {
        this.colour = colour;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Heels{" +
                "colour='" + colour + '\'' +
                ", number=" + number +
                '}';
    }
}
