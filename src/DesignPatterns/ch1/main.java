package DesignPatterns.ch1;

public class main {
    public static void main(String[] args) {
        int []arr = new int[]{1,2,3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
