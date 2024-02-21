package myinterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("In main method of Main class");
        // MyInterface1 myInterface1=new MyInterfaceImpl1();
        // myInterface1.speak();

        int n1, n2;

        MyInterface1 i = new MyInterface1() {
            public void speak() {
                System.out.println("In speak method, it's first method of anonymus class");
            }
        };

        i.speak();

        MyInterface1 i2 = new MyInterface1() {
            public void speak() {
                System.out.println("This is second method of anonymus class.");
            }
        };

        i2.speak();

        SumInterface sumInterface = (int a, int b) -> {
            return a + b;
        };
        System.out.println("Sum of 5 & 6 is " + sumInterface.sum(5, 6));
        System.out.println();
        // Or in short form
        SumInterface sumInterface2 = (x, y) -> x + y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        System.out.println("Sum of " + n1 + " " + n2 + " is " + sumInterface2.sum(n1, n2));
        scanner.close();
    }
}
