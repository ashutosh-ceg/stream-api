package methodandconstructorreferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentConstructorReference {
    public static void main(String[] args) {
        List<String> studentList = Arrays.asList("Ashutosh", "Amit", "Abhisek");
        List<Student> students = studentList.stream().map(x -> new Student(x)).collect(Collectors.toList());
        // Or By Using Constructor Reference
        List<Student> students1 = studentList.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(students1);

        System.out.println("List of student");
        System.out.println(students);
    }
}
