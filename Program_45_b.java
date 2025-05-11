// static = Modifies a variable or method belong to the class,
//               rather than to any specific object.
//               Commonly used for utility methods or shared resources.

public class Program_45_b {
    public static void main(String[] args) {
        Program_45_a obj1 = new Program_45_a("Kapil");
        Program_45_a obj2 = new Program_45_a("Dev");
        Program_45_a obj3 = new Program_45_a("Sumit");
        Program_45_a obj4 = new Program_45_a("Varun");

        System.out.println(obj1.name);
        System.out.println(obj2.name);
        System.out.println(obj3.name);
        System.out.println(obj4.name);

        Program_45_a.friends();
    }
}
