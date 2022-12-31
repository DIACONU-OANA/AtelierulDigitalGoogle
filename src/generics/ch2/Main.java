package generics.ch2;

public class Main {
    public static void main(String[] args) {
        Boot b1= new Boot("negru",37);
        Boot b2= new Boot("verde",20);
        try{
            Pair<Boot> pr = new Pair<Boot>(b1,b2);
            System.out.println(pr);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        }
        Heels h1 = new Heels("mov",37);
        //Pair<Boot> pr2 = new Pair<Boot>(h1,b2);
        //System.out.println(pr2);

    }


