package generics.ch2;

public class Boot {
    private String colour;
    private Integer number;

    public Boot(String colour, Integer number) {
        this.colour = colour;
        this.number = number;
    }

    public String getColour() {
        return colour;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Boot{" +
                "colour='" + colour + '\'' +
                ", number=" + number +
                '}';
    }
}
