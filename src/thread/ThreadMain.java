package thread;

public class ThreadMain {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++)
                System.out.println("Thraed " + i);
        };
        Thread thread = new Thread(runnable);
        thread.run();
    }
}
