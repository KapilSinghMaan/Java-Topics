// Wrapper classes = Allow primitive values (int, char, double, boolean)
// to be used as objects. "Wrap them in an object"
// Generally, don't wrap primitives unless you need an object.
// Allows use of Collections Framework and static utility methods.

public class Program_57 {
    public static void main(String[] args) {

        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;

        // Unboxing
        int w = a;
        double x = b;
        char y = c;
        boolean z = d;

        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
