// MyRunnable class

public class Program_72_b implements Runnable {

    final String text;

    Program_72_b(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(text);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
