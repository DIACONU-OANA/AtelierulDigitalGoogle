package generics.ch4;

import DesignPatterns.ch1.ArrayCustomIterator;

public class Main {
    public static void main(String[] args) {
        Integer []arr = new Integer[]{1,2,3};
        IArrayIterator it = new ArrayIterator<Integer>(arr);
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
