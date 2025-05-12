// Student class (Child)

public class Program_47_c extends Program_47_b {
    double gpa;

    Program_47_c(String first, String last, double gpa) {
        super(first, last);
        this.gpa = gpa;
    }

    void showGpa() {
        System.out.println(this.first + "'s gpa is " + this.gpa);
    }
}
