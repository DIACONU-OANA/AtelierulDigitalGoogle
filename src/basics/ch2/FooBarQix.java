package basics.ch2;

import java.util.Objects;

public class FooBarQix {
    public  static String compute(int nr){
        if(nr%3!=0 && nr%5!=0 && nr%7!=0){
            String lst ="";
            while(nr>0){
                int x=nr%10;
                if(x==0){lst+="*";}
                else {
                    String str= Integer.toString(x);
                    lst+=str;
                }
                nr=nr/10;
            }
            return lst;
        }

        String list= " ";
        if(nr%3==0) list+= "Foo";
        if(nr%5==0) list+= "Bar";
        if(nr%7==0) list+="Qix";
        if(compute2(nr)!=null) list+=compute2(nr);
        while(nr>0){
            int x = nr%10;
            if(x==3) list+="Foo";
            if(x==5) list+= "Bar";
            if(x==7) list+="Qix";
            nr=nr/10;
        }
        return list;

    }
    public static void main(String[] args) {
        System.out.println(compute(10101));
        System.out.println(compute(15));
        System.out.println(compute(105));
        System.out.println(compute(101));
        System.out.println(compute(2));


    }
    public static String compute2(int nr2){
        String string= "";
        while(nr2>0){
            int x=nr2%10;
            if(x==0) string+="*";
            nr2=nr2/10;
        }
        return string;
    }
}
