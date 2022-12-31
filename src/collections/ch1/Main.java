package collections.ch1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista= new ArrayList<>(Arrays.asList(1,25,6,3,7,3,7,23,67,9,45,90,2));
        //Collections.reverse(lista);
        int max=0;
        for(int i=0;i<lista.size();i++)
            if(lista.get(i)>max){
                max= lista.get(i);
            }
        System.out.println("Liderii sunt:"+ max +", "+ lista.get(lista.size()-1));







    }

}
