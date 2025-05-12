// Inheritance = One class inherits the attributes and methods
//                         from another class.

public class Program_46_a {
    public static void main(String[] args) {
        Program_46_e dog = new Program_46_e();
        Program_46_f cat = new Program_46_f();
        Program_46_c plant = new Program_46_c();

        dog.eat();
        System.out.println(cat.lives);
        cat.eat();
        plant.photosynthesis();
    }
}
