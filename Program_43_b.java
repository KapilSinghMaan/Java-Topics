// Overloaded Constructors

public class Program_43_b {
    public static void main(String[] args) {

        Program_43_a obj1 = new Program_43_a();
        Program_43_a obj2 = new Program_43_a("Kapil");
        Program_43_a obj3 = new Program_43_a("Varun", "vartist@gmail.com");
        Program_43_a obj4 = new Program_43_a("Dev", "working@office.com", 21);

        System.out.println(obj1.username);
        System.out.println(obj1.email);
        System.out.println(obj1.age);
        System.out.println();

        System.out.println(obj2.username);
        System.out.println(obj2.email);
        System.out.println(obj2.age);
        System.out.println();

        System.out.println(obj3.username);
        System.out.println(obj3.email);
        System.out.println(obj3.age);
        System.out.println();

        System.out.println(obj4.username);
        System.out.println(obj4.email);
        System.out.println(obj4.age);
        System.out.println();
    }
}
