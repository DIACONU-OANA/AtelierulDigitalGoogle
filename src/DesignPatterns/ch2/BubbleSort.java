package DesignPatterns.ch2;

public  class BubbleSort implements SortingStrategy{
    public String alege(){
        return "Bubble";
    }
    public void sort(Integer[] v){
        for(int i=0;i<v.length -1;i++)
            for(int j=0;j<v.length-i-1;j++)
                if(v[j]>v[j+1])
                {int aux=v[j];
                    v[j]=v[j+1];
                    v[j+1]=aux;}
    }
}
