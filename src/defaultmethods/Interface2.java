package defaultmethods;

public interface Interface2 {
    default void sayHello() {
        System.out.println("In Interface2 sayHello");
    }
}
