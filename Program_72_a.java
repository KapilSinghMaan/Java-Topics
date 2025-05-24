// Multithreading = Enables a program to run multiple threads concurrently
//                  (Thread = A set of instructions that run independently)
//                  Useful for background tasks or time-consuming operations

public class Program_72_a {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Program_72_b("Ping"));
        Thread thread2 = new Thread(new Program_72_b("Pong"));

        System.out.println("Game Start");
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
        System.out.println("Game Over");
    }
}
