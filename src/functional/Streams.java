package functional;

import java.util.*;

public class Streams {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("abc","bcde","ceorkeok","sd"));
        Optional<String> i  =list.stream()
                .filter(s->{
            System.out.println("filter "+ s);
            return s.length()>3;
        })
                .map(s->{
                    System.out.println("map "+ s);
                    return s.toUpperCase(Locale.ROOT);
                })
                        .findFirst();
                //.count();
        System.out.println("args= "+ i);
    }
}
