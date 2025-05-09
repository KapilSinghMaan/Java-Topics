// overloaded methods = methods that share the same name,
// but different parameters
// signature = name + parameters


public class Program_29 {
    public static void main(String[] args) {


        String pizza = bakePizza("flat-bread", "mozzarella", "pepperoni");

        System.out.println(pizza);

    }

    static String bakePizza(String bread) {
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }

    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + " pizza";
    }
}
