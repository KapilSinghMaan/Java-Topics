// Method overriding = When a subclass provides its own
//                     implementation of a method that is already defined.
//                     Allows for code reusability and gives specific implementations.

public class Program_48_a {

    public static void main(String[] args) {
        Program_48_b animal = new Program_48_b();
        Program_48_c fish = new Program_48_c();

        animal.move();
        fish.move();
    }
}
