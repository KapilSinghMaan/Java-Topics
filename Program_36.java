// varargs = allow a method to accept a varying # of arguments
//                  makes methods more flexible, no need for overloaded methods
//                  java will pack the arguments into an array
//                  ... (ellipsis)

public class Program_36 {
    public static void main(String[] args) {
        System.out.println(average(45, 65, 25, 35));
    }

    static double average(double... numbers) {
        double sum = 0;
        if (numbers.length == 0) {
            return 0;
        }

        else {
            for (double number : numbers) {
                sum += number;
            }
            return sum / numbers.length;
        }
    }
}
