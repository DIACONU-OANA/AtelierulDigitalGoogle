package collections.hashmap.StudentDB;

import java.util.Objects;

public class Student {
    private String CNP;
    private String name;

    public Student(String CNP, String name) throws CNPSizeException {
        if(CNP.length() !=10) throw new CNPSizeException();
        this.CNP = CNP;
        this.name = name;
    }

    public String getCNP() {
        return CNP;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "CNP='" + CNP + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    static class CNPSizeException extends Exception {
        public CNPSizeException(){
            super("CNP does not respect the requirements");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //daca au aceeasi adresa de memorie returneaza true
        if (o == null || getClass() != o.getClass()) return false; //vreifica daca au aceeasi clasa
        Student student = (Student) o;
        return Objects.equals(CNP, student.CNP) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CNP, name);
    }
}
