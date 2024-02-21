package predicate;

import java.util.function.Predicate;

public class Predicate2 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Ashutosh");
        Student s2 = new Student(3, "Rajeev");

        Predicate<Student> studenPredicate = student -> student.getId() > 1;

        System.out.println(studenPredicate.test(s1));
        System.out.println(studenPredicate.test(s2));

        Predicate<Object> predicateObject = Predicate.isEqual("Ashutosh");
        System.out.println("Is Ashutosh equlas to Ashutosh " + predicateObject.test("Ashutosh"));
    }
}
