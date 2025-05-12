// super = Refers to the parent class (subclass <- superclass)
//               Used in constructors and method overriding
//               Calls the parent constructor to initialize attributes

public class Program_47_a {
    public static void main(String[] args) {
        Program_47_b person = new Program_47_b("Kapil", "Singh Maan");
        Program_47_c student = new Program_47_c("Kapil", "Singh Maan", 9.8);
        Program_47_d employee = new Program_47_d("Kapil", "Singh Maan", 500000);

        person.showName();
        student.showGpa();
        employee.showSalary();
    }
}
