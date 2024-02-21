package functionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import predicate.Student;

public class FunctionInterface1 {
    public static void main(String[] args) {
        Function<String, Integer> function = x -> x.length();
        System.out.println(function.apply("ashutosh"));
        Function<String, String> function2 = x -> x.substring(0, 3);
        System.out.println("Substring " + function2.apply("Ashutosh"));

        System.out.println("Students with prefix ashu");
        Function<List<Student>, List<Student>> studentWithAshuPrefix = list -> {
            List<Student> results = new ArrayList<>();
            for (Student s : list) {
                if (function2.apply(s.getName()).equalsIgnoreCase("ashu")) {
                    results.add(s);
                }
            }
            return results;
        };

        Student s1 = new Student(1, "Ashutosh");
        Student s2 = new Student(2, "Rajeev");
        Student s3 = new Student(3, "Srish");

        List<Student> students = Arrays.asList(s1, s2, s3);
        List<Student> resultantStudent = studentWithAshuPrefix.apply(students);
        System.out.println(resultantStudent);
    }
}
