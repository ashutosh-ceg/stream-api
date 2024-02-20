package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparator {
    public static void main(String[] args) {
        Student s= new Student(1, "Ashutosh");
        Student s1=new Student(3, "Surya");
        Student s3=new Student(2, "Shiwa");
        Student s4= new Student(4, "Diwakar");

        List list =new ArrayList<Student>();
        list.add(s);
        list.add(s1);
        list.add(s3);
        list.add(s4);

        System.out.println("List without sorting "+list);

        //Collections.sort(list, (a,b)->b.id-a.id);

    }
}
