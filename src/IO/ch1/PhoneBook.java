package IO.ch1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PhoneBook {

    private List<Contact> phoneBook;

    public PhoneBook() throws IOException {
        phoneBook = new ArrayList<Contact>();
        BufferedReader buffer = new BufferedReader((new FileReader("./src/IO/phonebook/new.txt")));
        String line;
        while((line=buffer.readLine())!= null){
            String[] result = Arrays.stream(line.split(" ")).map(String::trim).toArray(String[]::new);
            Contact c= new Contact(result[0],result[1]);
            phoneBook.add(c);
        }
    }

    public String findPhoneNumber(String name){
        for(int i=0;i<phoneBook.size();i++){
            if(phoneBook.get(i).getName().equals(name))
                return phoneBook.get(i).getPhoneNr();
        }
        return null;

    }



}
