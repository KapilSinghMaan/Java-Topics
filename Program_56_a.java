// Composition = Represents a "part-of" relationship between objects.
//                            For example, an Engine is "part of" a Car.
//                            Allows complex objects to be constructed from smaller objects.

public class Program_56_a {
    public static void main(String[] args) {


        Program_56_b car = new Program_56_b("Corvette", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }
}
