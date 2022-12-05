package DesignPatterns.ch2;

import java.util.Arrays;
import java.util.Objects;

public class main {

    public static void main(String[] args) {
        Integer arr[]=new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copu01ofArr= Arrays.copyOf(arr,arr.length);
        Integer[] copu02ofArr= Arrays.copyOf(arr,arr.length);

        displaySorted(new BubbleSort(),copu01ofArr);
        displaySorted(new MergeSort(),copu02ofArr);
    }

    private static void displaySorted(SortingStrategy strategy, Integer[] arr) {

        if(strategy.alege().equals("Bubble")){
            System.out.println("BubbleSort");
            strategy.sort(arr);
           for(int i=0;i<arr.length;i++)
               System.out.println(arr[i]);
        }
        if(strategy.alege().equals("Merge")){
            System.out.println("MergeSort");
            strategy.sort(arr);
            for(int i=0;i<arr.length;i++)
                System.out.println(arr[i]);
        }



    }
}
