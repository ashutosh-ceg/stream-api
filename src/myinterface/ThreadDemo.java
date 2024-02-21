package myinterface;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable thread1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        System.out.println("First thread is running ");
        Thread thread = new Thread(thread1);
        thread.start();

        Runnable threadRunnable = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i * i);
                    Thread.sleep(1000);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        System.out.println("2nd thread is running ");
        Thread thread2 = new Thread(threadRunnable);
        thread2.start();
    }
}
