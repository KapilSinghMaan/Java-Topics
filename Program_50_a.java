// abstract = Used to define abstract classes and methods.
//                   Abstraction is the process of hiding implementation details
//                   and showing only the essential features.
//                   Abstract classes CAN'T be instantiated directly.
//                   Can contain 'abstract' methods (which must be implemented)
//                   Can contain 'concrete' methods (which are inherited)

public class Program_50_a {
    public static void main(String[] args) {

        Program_50_c circle = new Program_50_c(30);
        Program_50_d rectangle = new Program_50_d(14, 20);

        System.out.println(circle.area());
        circle.display();
        System.out.println(rectangle.area());
        rectangle.display();
    }
}
