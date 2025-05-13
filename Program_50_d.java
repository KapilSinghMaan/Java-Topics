// Rectangle class (child)

public class Program_50_d extends Program_50_b {

    double length;
    double width;

    Program_50_d(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

}
