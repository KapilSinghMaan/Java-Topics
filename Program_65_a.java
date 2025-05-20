// Anonymous class = A class that doesn't have a name. Cannot be reused.
//                   Add custom behavior without having to create a new class.
//                   Often used for one time uses (TimerTask, Runnable, callbacks)

public class Program_65_a {
    public static void main(String[] args) {
        Program_65_b dog1 = new Program_65_b();
        Program_65_b dog2 = new Program_65_b() {
            @Override
            void speak() {
                System.out.println("But my dog can speek haryanvi");
            }
        };
        dog1.speak();
        dog2.speak();
    }
}