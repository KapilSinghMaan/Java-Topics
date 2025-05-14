// Interface = A blueprint for a class that specifies a set of abstract methods
//                     that implementing classes MUST define.
//                     Supports multiple inheritance-like behavior.

public class Program_51_a {
    public static void main(String[] args) {
        Program_51_d rabbit = new Program_51_d();
        Program_51_e hawk = new Program_51_e();
        Program_51_f fish = new Program_51_f();

        rabbit.flee();
        hawk.hunt();

        fish.flee();
        fish.hunt();
    }
}
