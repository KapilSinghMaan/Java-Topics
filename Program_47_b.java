// Person class (Parent)

public class Program_47_b {

    String first;
    String last;

    Program_47_b(String first, String last) {
        this.first = first;
        this.last = last;
    }

    void showName() {
        System.out.println(this.first + " " + this.last);
    }
}
