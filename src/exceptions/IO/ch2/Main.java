
package exceptions.IO.ch2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    private static String str;

    public static void main(String[] args) throws IOException {

        BufferedReader buffer = new BufferedReader((new FileReader("./src/exceptions/IO/ch2/new.txt")));
        String line;
        while ((line = buffer.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (Character.isUpperCase(c)) str += c;
            }
        }
        String mesaj = str.replace('X', ' ');
        System.out.println("Output: " + mesaj);
    }
}

