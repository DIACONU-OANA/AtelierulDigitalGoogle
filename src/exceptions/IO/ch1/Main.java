package exceptions.IO.ch1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            PhoneBook p =new PhoneBook();
            System.out.println(p.findPhoneNumber("Aaron"));
            System.out.println(p.findPhoneNumber("Abbey"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
