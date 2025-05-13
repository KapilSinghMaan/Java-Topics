// Circle class (child)

public class Program_50_c extends Program_50_b {

    double radius;

    Program_50_c(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
