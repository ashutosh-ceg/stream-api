package defaultmethods;

public class InterfaceImpl implements Inteface1,Interface2{
    public static void main(String[] args) {
        InterfaceImpl interfaceImpl=new InterfaceImpl();
        System.out.println("In main method");
        interfaceImpl.sayHello();
        interfaceImpl.sayHello();
    }

    @Override
    public void sayHello() {
        System.out.println("In sayHello method of InterfaceImpl class");
        Inteface1.super.sayHello();
    }
}
