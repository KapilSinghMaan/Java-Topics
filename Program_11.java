// Circumference , Area and Volume

import java.util.*;

public class Program_11 {
    public static void main(String[] args) {

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        float radius = scanner.nextFloat();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("Circumference = %.2f cm", circumference);
        System.out.printf("\nArea = %.2f cm^2", area);
        System.out.printf("\nVolume = %.2f cm^3", volume);

        scanner.close();
    }
}
