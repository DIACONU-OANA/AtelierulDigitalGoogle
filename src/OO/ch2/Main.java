package OO.ch2;

public class Main {
    public static String[] nr_filme(Studio[] stu){
        int v=0;
        String[] string = new String[stu.length];
        for(int i=0;i<stu.length;i++){
            Film[] filme = stu[i].getFilme();
            if(stu[i].getFilme().length > 2)
                string[v++]= stu[i].getNume();
        }
        return string;

    }
    public static String[] actor_cu2_osc(Studio[] stu){
        int v=0;
        String[] string = new String[stu.length];
        for(int i=0;i<stu.length;i++){
            Film[] filme = stu[i].getFilme();
            for(int j=0;j< filme.length;j++){
                Actor[] actori = filme[j].getActori();
                for(int k=0;k<actori.length;k++){
                    if(actori[k].getNume().equals(" actor cu 2 oscaruri")) string[v++]= stu[i].getNume();
                }
            }
        }
        return string;
    }
    public static String[] actori_peste_50(Film[] flm){
        int v=0;
        String[] string = new String[flm.length];
        for(int i=0;i<flm.length;i++){
            Actor[] actori = flm[i].getActori();
            for(int j=0;j<actori.length;j++){
                if(actori[j].getVarsta()>50) string[v++]=flm[i].getNume();
            }
        }
        return string;

    }


    public static void main(String[] args) {
        Premiu oscar1990= new Premiu("oscar",1990);
        Premiu oscar2000= new Premiu("oscar",2000);
        Premiu oscar2010= new Premiu("oscar",2010);
        Premiu oscar2018= new Premiu("oscar",2018);

        Actor actoroscar1990 = new Actor(" actor cu 2 oscaruri",35,new Premiu[]{oscar1990,oscar2000});
        Actor actoroscar2010 = new Actor(" actor cu oscar din 2010",55,new Premiu[]{oscar2010});
        Actor actoroscar2018 = new Actor(" actor cu oscar din 2018",23,new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor(" actor fara oscar 01",33,new Premiu[]{});
        Actor actorFaraPremii02 = new Actor(" actor fara oscar 02",60,new Premiu[]{});
        Actor actorFaraPremii03 = new Actor(" actor fara oscar 03",20,new Premiu[]{});

        Film film1 = new Film(1990,"film cu actori de oscar",
                new Actor[]{actoroscar1990,actorFaraPremii01});
        Film film2 = new Film(2010,"film cu actori fara premii2",
                new Actor[]{actorFaraPremii01,actorFaraPremii02,actorFaraPremii03});
        Film film3 = new Film(2010,"film cu actori fara premii3",
                new Actor[]{actorFaraPremii01,actorFaraPremii02,actorFaraPremii03});
        Film film4 = new Film(2018,"film cu actori de oscar",
                new Actor[]{actoroscar2010,actoroscar2018,actorFaraPremii02});
        Film film5 = new Film(2018,"film cu actori fara premii5",
                new Actor[]{actorFaraPremii02,actorFaraPremii03});

        Studio studio1 =new Studio("MGM", new Film[]{film1,film2});
        Studio studio2 =new Studio("Disney", new Film[]{film3,film4,film5});

        Studio[] studioDatebase= new Studio[]{studio1,studio2};

        //ex 1
        String[] V =nr_filme(studioDatebase);
        for(int i=0;i<V.length;i++){
//            System.out.println(V[i]);
//            System.out.println("");
        }
        // ex 2
        String[] B =actor_cu2_osc(studioDatebase);
        for(int m=0;m<B.length;m++){
//            System.out.println(B[m]);
//            System.out.println("");
        }
        // ex 3
        Film[] multe_filme = new Film[]{film1,film2,film3,film4};
        String[] ok= actori_peste_50(multe_filme);
        for(int n=0;n<ok.length;n++){
            System.out.println(ok[n]);
            System.out.println("");
        }






    }
}
