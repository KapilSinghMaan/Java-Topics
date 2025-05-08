// break = break out of a loop (STOP)
// continue = skip current iteration of a loop (SKIP)

public class Program_26 {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
                // continue;
            }
            System.out.print(i + " ");
        }
    }
}
