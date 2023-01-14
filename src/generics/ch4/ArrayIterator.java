package generics.ch4;

public class ArrayIterator<T> implements IArrayIterator{
    private T[] array;
    private int size;
    private int currentIndex= -1;

    public ArrayIterator(T[] v) {
        this.array = v;
        this.size=v.length;
    }
    @Override
    public boolean hasNext() {
        return currentIndex<size-1;
    }

    @Override
    public T next() {
        if(hasNext()) return array[++currentIndex];
        return null;
    }
}
