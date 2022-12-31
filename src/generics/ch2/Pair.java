package generics.ch2;

import exceptions.calculator.FatalException;

public class Pair<T extends Boot>  {
    private T first;
    private T second;

    public Pair(T first, T second) {

        this.first = first;
        this.second = second;
        if(!first.getColour().equals(second.getColour()))
            throw new RuntimeException("Culoare trebuie sa fie aceeasi");
        if(first.getNumber()!= second.getNumber())
            throw  new RuntimeException("Nr trebuie sa fie acelasi");
    }


    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
