// .toString() = Method inherited from the Object class.
//                       Used to return a string representation of an object.
//                       By default, it returns a hash code as a unique identifier.
//                       It can be overridden to provide meaningful details.

public class Program_49_a {

    public static void main(String[] args) {
        Program_49_b car1 = new Program_49_b("Ford", "Mustang", 2025, "Black");
        Program_49_b car2 = new Program_49_b("Chevrolet", "Corvette", 2026, "Blue");
        System.out.println(car1);
        System.out.println(car2);
    }
}