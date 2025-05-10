// Constructors in java

public class Program_42_b {
    public static void main(String[] args) {

        Program_42_a obj1 = new Program_42_a("Kapil", 21, 8.9);
        Program_42_a obj2 = new Program_42_a("Dev", 20, 9.9);
        Program_42_a obj3 = new Program_42_a("Varun", 20, 8.8);

        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1.gpa);
        System.out.println(obj1.isEnrolled);
        System.out.println();
        System.out.println(obj2.name);
        System.out.println(obj2.age);
        System.out.println(obj2.gpa);
        System.out.println(obj2.isEnrolled);
        System.out.println();
        System.out.println(obj3.name);
        System.out.println(obj3.age);
        System.out.println(obj3.gpa);
        System.out.println(obj3.isEnrolled);
        System.out.println();

        obj1.study();
        obj2.study();
        obj3.study();
    }
}
