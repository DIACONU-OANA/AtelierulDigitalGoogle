package exceptions.IO.ch5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static String str;

    public static void main(String[] args) throws IOException {
        Map<String,Integer> words = new TreeMap<>();
        Scanner scanner = new Scanner( new BufferedReader(new FileReader("./src/exceptions/IO/ch5/input.txt")));
        String line;
        while (scanner.hasNext()) {
            String text =scanner.next();
            String word = text.toLowerCase();
            if(words.containsKey(word)) words.put(word,words.get(word)+1);
            else words.put(word,1);
        }
        Map<String,Integer> result = words.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        result.entrySet().forEach(x-> System.out.println(x.getKey()+"="+x.getValue()));
    }
}
