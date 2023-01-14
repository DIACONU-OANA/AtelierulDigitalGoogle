package exceptions.IO.ch1;

import java.util.Objects;

public class Contact {
    private String name,phoneNr;

    public Contact(String name, String phonenr) {
        this.name = name;
        this.phoneNr = phonenr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNr='" + phoneNr + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(phoneNr, contact.phoneNr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNr);
    }
}
