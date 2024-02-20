package myinterface;

public class EmployeeInterfaceImpl {
    public static void main(String[] args) {
        EmployeeInterface employeeInterface=()->"Ashutosh";
        System.out.println(employeeInterface.getName());
        EmployeeInterface engeinner=()->"Engineer";
        System.out.println(engeinner.getName());
    }
}
