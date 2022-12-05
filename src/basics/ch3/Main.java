package basics.ch3;

public class Main {
    static int nr=0;
    static int contor= 0;
    public static int[] removeDuplicates(int[] myArray){
        nr =0;
        int[] newarray = new int[myArray.length];
        for(int i=0;i<myArray.length;i++){
            boolean added =false;
            for(int j=0;j<nr;j++){
                if (myArray[i] == newarray[j]) added = true;

            }
            if(added ==false){
                newarray[nr++]= myArray[i];
            }
        }

        return newarray;
    }

    public static void main(String[] args) {
        int [] myArray = new int[]{3,2,-3,-2,0,3};
        for(int i=0;i<myArray.length;i++)
            System.out.println(myArray[i]);

        int[] newarray = removeDuplicates(myArray);
        System.out.println("");
        for(int i=0;i<nr;i++){
            System.out.println(newarray[i] + " ");
        }

        Pair[] pairs =createPairs(newarray);
        System.out.println("Number of pairs= " + contor);


    }

    private static Pair[] createPairs(int[] newarray) {
        contor=0;
        Pair[] pairs = new Pair[nr-1];
        for(int i=0;i<nr;i++){
            for(int j=i+1;j<nr;j++){
                if(newarray[i]+ newarray[j] == 0){
                    pairs[contor++] = new Pair(newarray[i], newarray[j]);
                    System.out.println(pairs[contor -1]);
                }
            }
        }
        return pairs;
    }
}
