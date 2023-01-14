package collections.ch5;

import java.util.*;

public class Merge2Lists {
    public static void main(String[] args) {
        int[] list1={1,5,6,7,8,9};
        int[] list2={2,3,4};
        int[] merged_list=merge(list1,list2);
        for(int i=0;i<merged_list.length;i++)
            System.out.print(" "+merged_list[i]);
    }
    public static int[] merge(int []l1,int []l2){
        int i=0,j=0,k=0;
        int[] l3= new int[l1.length+l2.length];
        while(i<l1.length){
            l3[k++]=l1[i++];
        }
        while(j<l2.length){
            l3[k++]=l2[j++];
        }
        Arrays.sort(l3);
        return l3;
    }
}
