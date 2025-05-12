// Employee class (child)

public class Program_47_d extends Program_47_b {

    double salary;

    Program_47_d(String first, String last, double salary) {
        super(first, last);
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(this.first + "'s salary is " + this.salary);
    }
}
