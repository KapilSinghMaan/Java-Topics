// Temperature Conversion Program

import java.util.*;

public class Program_19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F):");
        String unit = scanner.next().toUpperCase();

        double newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;
        System.out.printf("Temperature after Conversion: %.2f ° %s ", newTemp, unit);

        scanner.close();
    }
}
