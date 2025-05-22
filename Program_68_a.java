// Generics = A concept where you can write a class, interface, or method
//            that is compatible with different data types.
//            <T> type parameter (placeholder that gets replaced with a real type)
//            <String> type argument (specifies the type)

public class Program_68_a {
    public static void main(String[] args) {
        Program_68_b<String, Double> product1 = new Program_68_b<>("Pizza", 499.99);
        Program_68_b<String, Integer> product2 = new Program_68_b<>("Sauce", 49);

        System.out.println(product1.getItem() + " costs " + product1.getPrice() + " ruppee only.");
        System.out.println(product2.getItem() + " costs " + product2.getPrice() + " ruppee only.");
    }
}
