package collections.hashmap.StudentDB;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Student.CNPSizeException {
        List students = new ArrayList<Student>();
        Student stud = new Student("1234567891","Eli");
        students.add(new Student("1234567890","Oana"));
        students.add(new Student("1234567891","Andrei"));
        students.add(new Student("1234567892","Cici"));
        students.add(new Student("1234567892","Cici")); // adrese diferite ca sunt cu new
        students.add(stud); // aceeasi adresa
        students.add(stud);
        StudentDatabase sd = new StudentDatabase(students);
        String name =sd.findStudentName("1234567880");
        System.out.println(name);

        System.out.println(students);
        HashSet<Student> hashStudents = new HashSet<>(students);
        System.out.println("HS=" + hashStudents);
    }
}
