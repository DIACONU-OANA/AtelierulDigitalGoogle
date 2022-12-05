package DesignPatterns.ch1;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayCustomIterator implements Iterator {
    Iterator<Integer> it;

    public ArrayCustomIterator(int[] a) {

        this.it = Arrays.stream(a).iterator();
    }

    @Override
    public boolean hasNext() {
        return it.hasNext();
    }

    @Override
    public Integer next() {
        return it.next();
    }
}
