package exceptions.IO.ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void readAndWrite() throws IOException {
        FileInputStream input =new FileInputStream("./src/exceptions.IO/in.txt");
        FileOutputStream output= new FileOutputStream("./src/exceptions.IO/out.txt");
        int c;
        while((c=input.read())!= -1){
            output.write(c);
        }
    }
    public static void main(String[] args) {
        try {
            readAndWrite();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
