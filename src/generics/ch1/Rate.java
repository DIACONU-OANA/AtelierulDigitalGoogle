package generics.ch1;

public class Rate {
    private Class from;
    private Class to;
    private float rate;

    public Rate(Class from, Class to, float rate) {
        this.from = from;
        this.to = to;
        this.rate = rate;
    }

    public float getRate() {
        return rate;
    }

    public Class getFrom() {
        return from;
    }

    public Class getTo() {
        return to;
    }
}
