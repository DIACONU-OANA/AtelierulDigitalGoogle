package DesignPatterns.ch1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ArrayCustomIterator{
    private Integer[] v;
    private int size;
    private int currentIndex= -1;

    public ArrayCustomIterator(Integer[] v) {
        this.v = v;
        this.size=v.length;
    }

    public boolean hasNext() {
        return currentIndex< size-1;
    }

    public Integer next() {
        if(hasNext()) return v[++currentIndex];
        return null;
    }



}
