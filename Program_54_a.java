// They help protect object data and add rules for accessing or modifying them.
// GETTERS = Methods that make a field READABLE.
// SETTERS = Methods that make a field WRITEABLE.

public class Program_54_a {
    public static void main(String[] args) {
        Program_54_b car = new Program_54_b("Swift", "Black", 500000);
        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());
        car.setColor("Pink");
        car.setPrice(499999);
        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());
    }
}
